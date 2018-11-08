package com.example.alarmclock.listeners;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Date;

import com.example.alarmclock.AlarmClock;
import com.example.alarmclock.AlarmListener;

/**
 * Plays a beeping sound when the alarm goes off.
 */
public class Beeper implements AlarmListener {

	private final AudioClip alarmSound;

	public Beeper() {
		try {
			alarmSound = Applet.newAudioClip(new File(
					"src/main/resources/alarm.wav").toURI().toURL());
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onAlarmEvent(AlarmClock source, Date time) {
		alarmSound.play();
	}

}
