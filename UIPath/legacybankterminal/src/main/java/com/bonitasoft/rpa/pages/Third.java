package com.bonitasoft.rpa.pages;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bonitasoft.rpa.Japp;

public class Third extends JPanel {
	private Japp japp = null;

	final public JLabel message = new JLabel();
	final public JButton ok = new JButton();
	
	public Third(final Japp japp) {
		super();
		this.japp = japp;
		
		// Create third screen pane
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Japp.BACKGROUND_COLOR);
		setForeground(Japp.FOREGROUND_COLOR);
		setFocusTraversalKeysEnabled(false);

		// Show confirmation message
		add(new JLabel(" "));
		
		add(message);

		message.setText("The loan has been created.");
		message.setAlignmentX(Component.CENTER_ALIGNMENT);
		message.setBackground(Japp.BACKGROUND_COLOR);
		message.setForeground(Japp.FOREGROUND_COLOR);
		message.setFocusTraversalKeysEnabled(false);

		add(new JLabel(" "));

		// Show "ok" handle the tab focus and enter action
		add(ok);

		ok.setName("ok");
		ok.setText("OK");
		ok.setAlignmentX(Component.CENTER_ALIGNMENT);
		ok.setBackground(Japp.FOREGROUND_COLOR);
		ok.setForeground(Japp.BACKGROUND_COLOR);
		ok.setFocusTraversalKeysEnabled(false);
		ok.requestFocusInWindow();
		ok.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					japp.setFirst();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
	}
}
