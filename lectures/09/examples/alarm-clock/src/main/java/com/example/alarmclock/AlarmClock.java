package com.example.alarmclock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * An alarm clock that supports listeners that are triggered when the alarm goes
 * off.
 * 
 * The alarm clock has an alarm time and a current time. The alarm time is when
 * the alarm should go off. The current time is the time now that the system
 * tells it.
 */
public class AlarmClock {
	private final List<AlarmListener> alarmListeners; // The set of listeners
	private final Date alarmTime; // The time the alarm should go off

	private Date time; // The current time

	public AlarmClock(Date alarmTime) {
		this.alarmListeners = new ArrayList<AlarmListener>();
		this.alarmTime = alarmTime;
	}

	/**
	 * Adds a listener which triggers some action when the alarm goes off.
	 * 
	 * @param lis
	 *            The listener to add.
	 */
	public void addAlarmListener(AlarmListener lis) {
		alarmListeners.add(lis);
	}

	/**
	 * Updates the current time on the alarm clock. This does not set a new
	 * alarm time.
	 * 
	 * @param newTime
	 */
	public void setTime(Date newTime) {
		time = newTime;
		if (time.equals(alarmTime) || time.after(alarmTime)) {
			publishAlarmEvent(time);
		}
	}

	/**
	 * Indicates if the alarm has gone off.
	 * 
	 * @return True if the alarm went off.
	 */
	public boolean hasGoneOff() {
		return time.after(alarmTime);
	}

	/**
	 * Notify all listeners that the alarm has gone off.
	 * 
	 * @param time
	 *            The current time.
	 */
	private void publishAlarmEvent(Date time) {
		for (AlarmListener al : alarmListeners) {
			al.onAlarmEvent(this, time);
		}
	}
}
