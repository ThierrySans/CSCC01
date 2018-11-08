package com.example.app;

import java.util.Date;

import com.example.alarmclock.AlarmClock;
import com.example.alarmclock.AlarmListener;
import com.example.alarmclock.listeners.AlarmWindow;
import com.example.alarmclock.listeners.Beeper;
import com.example.alarmclock.listeners.ReliabilityWatchDog;

/**
 * Creates an alarm that goes off in 3 seconds.
 */
public class App {

	private static final int SECOND = 1000; // Number of milliseconds in one
											// second

	/**
	 * Creates an alarm clock set to go off in three seconds, with three
	 * listeners. Each listener has a different behavior.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Launches an alarm window when the alarm goes off
		AlarmListener alarmWindowListener = new AlarmWindow();

		// Makes a beeping sound when the alarm goes off
		AlarmListener beeperListener = new Beeper();

		// Checks processes when alarm goes off
		AlarmListener watchDogListener = new ReliabilityWatchDog();

		// Calculate the time 3 seconds from now
		Date now = new Date();
		Date alarmTime = new Date(now.getTime() + 3 * SECOND);
		System.out.println("Time now is " + now.toString());
		System.out.println("Alarm set to go off at " + alarmTime.toString());

		// Create a new alarm clock and set the alarm
		AlarmClock alarmClock = new AlarmClock(alarmTime);

		// Add all the listeners to the alarm clock
		alarmClock.addAlarmListener(alarmWindowListener);
		alarmClock.addAlarmListener(beeperListener);
		alarmClock.addAlarmListener(watchDogListener);

		// Update the alarm clock's time every 100 milliseconds. When the alarm
		// time is reached, this will trigger the alarm clock.
		try {
			while (true) {
				alarmClock.setTime(new Date());

				if (alarmClock.hasGoneOff()) {
					break;
				}

				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
