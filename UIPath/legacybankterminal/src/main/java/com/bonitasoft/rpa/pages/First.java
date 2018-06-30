package com.bonitasoft.rpa.pages;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.bonitasoft.rpa.Japp;

public class First extends JPanel {
	private Japp japp = null;
	
	final public JButton create = new JButton();
	final public JButton status = new JButton();
	final public JButton exit = new JButton();

	public First(final Japp japp) {
		super();
		this.japp = japp;

		// Create first screen pane
		setBackground(Japp.BACKGROUND_COLOR);
		setForeground(Japp.FOREGROUND_COLOR);
		setFocusTraversalKeysEnabled(false);

		// Show "create", "status" and "exit", handle the tab focus and enter action
		add(create);
		add(status);
		add(exit);

		create.setName("create");
		create.setText("CREATE");
		create.setBackground(Japp.FOREGROUND_COLOR);
		create.setForeground(Japp.BACKGROUND_COLOR);
		create.setFocusTraversalKeysEnabled(false);
		create.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					status.requestFocusInWindow();
				} else if(e.getKeyChar() == '\n') {
					japp.setSecond();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});

		status.setName("status");
		status.setText("STATUS");
		status.setBackground(Japp.BACKGROUND_COLOR);
		status.setForeground(Japp.FOREGROUND_COLOR);
		status.setFocusTraversalKeysEnabled(false);
		status.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					exit.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		exit.setName("exit");
		exit.setText("EXIT");
		exit.setBackground(Japp.BACKGROUND_COLOR);
		exit.setForeground(Japp.FOREGROUND_COLOR);
		exit.setFocusTraversalKeysEnabled(false);
		exit.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					create.requestFocusInWindow();
				} else if(e.getKeyChar() == '\n') {
					japp.dispose();
					System.exit(0);
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});

		// Handle the focus highlighting
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) {
				String properties = e.getPropertyName();
				if (("focusOwner".equals(properties)) && (e.getNewValue() != null)) {
					String name = ((Component)e.getNewValue()).getName();
					
					if(name != null) {
						if(name.equals(create.getName())) {
							create.setBackground(Japp.FOREGROUND_COLOR);
							create.setForeground(Japp.BACKGROUND_COLOR);
							status.setBackground(Japp.BACKGROUND_COLOR);
							status.setForeground(Japp.FOREGROUND_COLOR);
							exit.setBackground(Japp.BACKGROUND_COLOR);
							exit.setForeground(Japp.FOREGROUND_COLOR);
						} else if(name.equals(status.getName())) {
							create.setBackground(Japp.BACKGROUND_COLOR);
							create.setForeground(Japp.FOREGROUND_COLOR);
							status.setBackground(Japp.FOREGROUND_COLOR);
							status.setForeground(Japp.BACKGROUND_COLOR);
							exit.setBackground(Japp.BACKGROUND_COLOR);
							exit.setForeground(Japp.FOREGROUND_COLOR);
						} else if(name.equals(exit.getName())) {
							create.setBackground(Japp.BACKGROUND_COLOR);
							create.setForeground(Japp.FOREGROUND_COLOR);
							status.setBackground(Japp.BACKGROUND_COLOR);
							status.setForeground(Japp.FOREGROUND_COLOR);
							exit.setBackground(Japp.FOREGROUND_COLOR);
							exit.setForeground(Japp.BACKGROUND_COLOR);
						}
					}
				}
			}
		});
	}
}
