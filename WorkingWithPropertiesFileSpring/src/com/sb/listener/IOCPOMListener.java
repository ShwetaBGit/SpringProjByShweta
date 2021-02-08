package com.sb.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCPOMListener implements ApplicationListener<ApplicationEvent> {

	private long start, end;

	@Override
	public void onApplicationEvent(ApplicationEvent ae) {

		if (ae.toString().indexOf("Refreshed") != -1) {
			start = System.currentTimeMillis();
		} else {
			end = System.currentTimeMillis();
		}

		System.out.println("Container acting time :: " + (end - start) + "ms");
	}

}
