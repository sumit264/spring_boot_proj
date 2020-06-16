package com.letsstartcoding.springbootrestapiexample.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJobScheduling {
	
	@Scheduled(cron="0 * 9 * * ?")
	public void cronJobSch() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Java cron job Scheduling after one minute:: " + strDate);
	}
	
	 @Scheduled(fixedRate = 10000)
	   public void fixedRateSch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	      Date now = new Date();
	      String strDate = sdf.format(now);
	     // System.out.println("Fixed Rate scheduler After One Minute:: " + strDate);
	   }
	 
	 @Scheduled(fixedDelay = 10000, initialDelay = 30000)
	   public void fixedDelaySch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	      Date now = new Date();
	      String strDate = sdf.format(now);
	     // System.out.println("Fixed Delay scheduler:: " + strDate);
	   }

}
