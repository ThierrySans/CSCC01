package com.example.alarmclock;

import java.util.Date;

/**
 * This listener supports the event where the alarm goes off.
 */
public interface AlarmListener {
	/**
	 * The action to be done when the alarm goes off.
	 * 
	 * @param source
	 *            The instance of AlarmClock that triggered the alarm.
	 * @param time
	 *            The time the alarm clock goes off.
	 */
	void onAlarmEvent(AlarmClock source, Date time);
}
