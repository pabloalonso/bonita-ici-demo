package com.bonitasoft.rpa.pages;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.bonitasoft.rpa.Japp;

public class Second extends JPanel {
	private Japp japp = null;

	final public JPanel customer = new JPanel();
	final public JFormattedTextField firstname = new JFormattedTextField();
	final public JFormattedTextField lastname = new JFormattedTextField();
	final public JFormattedTextField dob = new JFormattedTextField();
	
	final public JPanel loan = new JPanel();
	final public JFormattedTextField amount = new JFormattedTextField();
	final public JFormattedTextField duration = new JFormattedTextField();
	
	final public JPanel action = new JPanel();
	final public JButton save = new JButton();
	final public JButton cancel = new JButton();
	
	public Second(final Japp japp) {
		super();
		this.japp = japp;

		// Create second screen pane
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Japp.BACKGROUND_COLOR);
		setForeground(Japp.FOREGROUND_COLOR);
		setFocusTraversalKeysEnabled(false);

		add(new JLabel(" "));
		
		// Show all text inputs
		customer.setLayout(new BoxLayout(customer, BoxLayout.X_AXIS));
		customer.add(firstname);
		customer.add(lastname);
		customer.add(dob);
		add(customer);
		
		firstname.setName("firstname");
		TitledBorder firstnameTitledBorder = new TitledBorder("Firstname");
		firstnameTitledBorder.setTitleColor(Japp.FOREGROUND_COLOR);
		firstname.setBorder(BorderFactory.createTitledBorder(firstnameTitledBorder));
		firstname.setCaretColor(Japp.FOREGROUND_COLOR);
		firstname.setBackground(Japp.BACKGROUND_COLOR);
		firstname.setForeground(Japp.FOREGROUND_COLOR);
		firstname.setSelectedTextColor(Japp.BACKGROUND_COLOR);
		firstname.setSelectionColor(Japp.FOREGROUND_COLOR);
		firstname.setFocusTraversalKeysEnabled(false);
		firstname.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					lastname.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		lastname.setName("lastname");
		TitledBorder lastnameTitledBorder = new TitledBorder("Lastname");
		lastnameTitledBorder.setTitleColor(Japp.FOREGROUND_COLOR);
		lastname.setBorder(BorderFactory.createTitledBorder(lastnameTitledBorder));
		lastname.setCaretColor(Japp.FOREGROUND_COLOR);
		lastname.setBackground(Japp.BACKGROUND_COLOR);
		lastname.setForeground(Japp.FOREGROUND_COLOR);
		lastname.setSelectedTextColor(Japp.BACKGROUND_COLOR);
		lastname.setSelectionColor(Japp.FOREGROUND_COLOR);
		lastname.setFocusTraversalKeysEnabled(false);
		lastname.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					dob.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		dob.setName("dob");
		TitledBorder dobTitledBorder = new TitledBorder("Date of birth");
		dobTitledBorder.setTitleColor(Japp.FOREGROUND_COLOR);
		dob.setBorder(BorderFactory.createTitledBorder(dobTitledBorder));
		dob.setCaretColor(Japp.FOREGROUND_COLOR);
		dob.setBackground(Japp.BACKGROUND_COLOR);
		dob.setForeground(Japp.FOREGROUND_COLOR);
		dob.setSelectedTextColor(Japp.BACKGROUND_COLOR);
		dob.setSelectionColor(Japp.FOREGROUND_COLOR);
		dob.setFocusTraversalKeysEnabled(false);
		dob.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					amount.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		add(new JLabel(" "));

		loan.setLayout(new BoxLayout(loan, BoxLayout.X_AXIS));
		loan.add(amount);
		loan.add(duration);
		add(loan);
		
		amount.setName("amount");
		TitledBorder amountTitledBorder = new TitledBorder("Amount");
		amountTitledBorder.setTitleColor(Japp.FOREGROUND_COLOR);
		amount.setBorder(BorderFactory.createTitledBorder(amountTitledBorder));
		amount.setCaretColor(Japp.FOREGROUND_COLOR);
		amount.setBackground(Japp.BACKGROUND_COLOR);
		amount.setForeground(Japp.FOREGROUND_COLOR);
		amount.setSelectedTextColor(Japp.BACKGROUND_COLOR);
		amount.setSelectionColor(Japp.FOREGROUND_COLOR);
		amount.setFocusTraversalKeysEnabled(false);
		amount.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					duration.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		duration.setName("duration");
		TitledBorder durationTitledBorder = new TitledBorder("Duration (months)");
		durationTitledBorder.setTitleColor(Japp.FOREGROUND_COLOR);
		duration.setBorder(BorderFactory.createTitledBorder(durationTitledBorder));
		duration.setCaretColor(Japp.FOREGROUND_COLOR);
		duration.setBackground(Japp.BACKGROUND_COLOR);
		duration.setForeground(Japp.FOREGROUND_COLOR);
		duration.setSelectedTextColor(Japp.BACKGROUND_COLOR);
		duration.setSelectionColor(Japp.FOREGROUND_COLOR);
		duration.setFocusTraversalKeysEnabled(false);
		duration.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					save.requestFocusInWindow();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		// Show "save", "cancel", handle the tab focus and enter action
		add(new JLabel(" "));
		
		action.setLayout(new BoxLayout(action, BoxLayout.X_AXIS));
		action.add(save);
		action.add(cancel);
		add(action);

		save.setName("save");
		save.setText("SAVE");
		save.setBackground(Japp.FOREGROUND_COLOR);
		save.setForeground(Japp.BACKGROUND_COLOR);
		save.setFocusTraversalKeysEnabled(false);
		save.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					cancel.requestFocusInWindow();
				} else if(e.getKeyChar() == '\n') {
					japp.setThird();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});

		cancel.setName("cancel");
		cancel.setText("CANCEL");
		cancel.setBackground(Japp.BACKGROUND_COLOR);
		cancel.setForeground(Japp.FOREGROUND_COLOR);
		cancel.setFocusTraversalKeysEnabled(false);
		cancel.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == '\t') {
					firstname.requestFocusInWindow();
				} else if(e.getKeyChar() == '\n') {
					japp.setFirst();
				}
			}

			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));


		// Handle the focus highlighting
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) {
				String properties = e.getPropertyName();
				if (("focusOwner".equals(properties)) && (e.getNewValue() != null)) {
					String name = ((Component)e.getNewValue()).getName();
					
					if(name != null) {
						if(name.equals(save.getName())) {
							save.setBackground(Japp.FOREGROUND_COLOR);
							save.setForeground(Japp.BACKGROUND_COLOR);
							cancel.setBackground(Japp.BACKGROUND_COLOR);
							cancel.setForeground(Japp.FOREGROUND_COLOR);
						} else if(name.equals(cancel.getName())) {
							save.setBackground(Japp.BACKGROUND_COLOR);
							save.setForeground(Japp.FOREGROUND_COLOR);
							cancel.setBackground(Japp.FOREGROUND_COLOR);
							cancel.setForeground(Japp.BACKGROUND_COLOR);
						} else {
							save.setBackground(Japp.BACKGROUND_COLOR);
							save.setForeground(Japp.FOREGROUND_COLOR);
							cancel.setBackground(Japp.BACKGROUND_COLOR);
							cancel.setForeground(Japp.FOREGROUND_COLOR);
						}
					}
				}
			}
		});
	}
}
