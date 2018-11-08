package com.example.alarmclock.listeners;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.example.alarmclock.AlarmClock;
import com.example.alarmclock.AlarmListener;

/**
 * A notification window which notifies the user that the alarm has gone off.
 */
public class AlarmWindow implements AlarmListener {

	private final JFrame frame;
	private final JLabel timeLabel;

	public AlarmWindow() {
		frame = new JFrame("Alarm Alert!");

		JPanel alarmPanel = new JPanel();
		alarmPanel.setLayout(new GridLayout(2, 1));

		timeLabel = new JLabel();

		JButton dismissButton = new JButton("Dismiss");
		dismissButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});

		alarmPanel.add(timeLabel);
		alarmPanel.add(dismissButton);

		frame.getContentPane().add(alarmPanel);

		frame.setSize(400, 200);
	}

	@Override
	public void onAlarmEvent(AlarmClock source, Date time) {
		timeLabel.setText("ALARM GONE OFF AT " + time.toString());
		frame.setVisible(true);
	}

}
