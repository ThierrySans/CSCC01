package com.example.alarmclock.listeners;

import java.util.Date;

import com.example.alarmclock.AlarmClock;
import com.example.alarmclock.AlarmListener;

/**
 * Pretends to check system processes when the alarm goes off. All it does is
 * simply print a message to the console.
 */
public class ReliabilityWatchDog implements AlarmListener {

	@Override
	public void onAlarmEvent(AlarmClock source, Date time) {
		String msg = String.format(
				"Alarm went off at %s. Checking processes... Done.",
				time.toString());
		System.out.println(msg);
	}

}
