package com.alibaba.dubbo.demo.consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.aspire.wlan.key.service.consumer.KeyToolService;

public class DemoKeytoolAction {
	private KeyToolService keyToolService;

	public void setKeyToolService(KeyToolService keyToolService) {
		this.keyToolService = keyToolService;
	}

	public void test() throws Exception {

		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDKtM4fYLdbwJ+Iz+7yMt8FFM4+K874+FVnJ0KiXfIZQxmAKo2mpG24Xfz8UCkKlgtOGyfNJ4He8ER8jEoaWMwpNEwUF0opthwduM/DK0y63+08BXCaMvbpyu/2gK3ZBa1/QSFYYZ8kgkVES5KwvZd8qnF9fJwHHtG69/o0M/U6UQIDAQAB";
		String encryptKey = keyToolService.getEncryptKey(publicKey);
		String cardInfo = null;
		String encryptCartinfo = null;
		long start = System.currentTimeMillis();
		long begin = 0;

		for (int i = 0; i < 10000; i++) {
			cardInfo = DemoKeytoolAction.getRandomString(13) + " "
					+ DemoKeytoolAction.getRandomString(6);
			System.out.println("cardInfo=" + cardInfo);
			begin = System.currentTimeMillis();
			encryptCartinfo = keyToolService.getEncryptCardinfo(cardInfo,
					encryptKey);
			System.out.println("encryptCartinfo=" + encryptCartinfo + "time="
					+ (System.currentTimeMillis() - begin));
		}

		System.out.println("totalTime=" + (System.currentTimeMillis() - start));
		keyToolService.removeSymmetricKey(encryptKey);
	}

	public static String getRandomString(int length) { // length 字符串长度
		StringBuffer buffer = new StringBuffer(
				"0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int range = buffer.length();
		for (int i = 0; i < length; i++) {
			sb.append(buffer.charAt(r.nextInt(range)));
		}
		return sb.toString();
	}

	public void start() throws Exception {
		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDKtM4fYLdbwJ+Iz+7yMt8FFM4+K874+FVnJ0KiXfIZQxmAKo2mpG24Xfz8UCkKlgtOGyfNJ4He8ER8jEoaWMwpNEwUF0opthwduM/DK0y63+08BXCaMvbpyu/2gK3ZBa1/QSFYYZ8kgkVES5KwvZd8qnF9fJwHHtG69/o0M/U6UQIDAQAB";
		final String encryptKey = keyToolService.getEncryptKey(publicKey);

		long start = System.currentTimeMillis();

		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(10000);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1,
				TimeUnit.DAYS, queue);
		int threadNum = 10000;
		final CountDownLatch runningThreadNum = new CountDownLatch(threadNum);
		System.out
				.println(Thread.currentThread().getName() + "-start:" + start);

		for (int i = 0; i < threadNum; i++) {
			executor.execute(new EncryptCartinfo(runningThreadNum,i,encryptKey,keyToolService));
		}
		
		
		runningThreadNum.await();
		executor.shutdown();
		System.out.println("totalTime=" + (System.currentTimeMillis() - start));
		keyToolService.removeSymmetricKey(encryptKey);
	}
}

class EncryptCartinfo implements Runnable {
	private final CountDownLatch doneSignal;
	private final int threadIndex;
	private final String encryptKey;
	private String cardInfo = null;
	private long begin = 0;
	private String encryptCartinfo = null;
	private final KeyToolService keyToolService;

	EncryptCartinfo(final CountDownLatch doneSignal, final int threadIndex,
			final String encryptKey, final KeyToolService keyToolService) {
		this.doneSignal = doneSignal;
		this.threadIndex = threadIndex;
		this.encryptKey = encryptKey;
		this.keyToolService = keyToolService;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {

			cardInfo = DemoKeytoolAction.getRandomString(13) + " "
					+ DemoKeytoolAction.getRandomString(6);
			System.out.println("cardInfo=" + cardInfo);
			begin = System.currentTimeMillis();
			encryptCartinfo = keyToolService.getEncryptCardinfo(cardInfo,
					encryptKey);
			System.out.println("Thread=" + threadIndex +", hashCode="+this.hashCode() + ", encryptCartinfo="
					+ encryptCartinfo + ",time="
					+ (System.currentTimeMillis() - begin));
			doneSignal.countDown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}