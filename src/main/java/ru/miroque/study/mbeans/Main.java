package ru.miroque.study.mbeans;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class Main {
	public static void main(String[] args) throws Exception {

		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = new ObjectName("ru.miroque.study.mbeans:type=Hello");
		Hello mbean = new Hello();
		mbs.registerMBean(mbean, name);

		while (true) {
			System.out.println("::number: "+ mbean.getNumber());
			System.out.println("::number*2: "+ mbean.getNumber()*2);
			TimeUnit.SECONDS.sleep(2);
		}
		
		
	}
}
