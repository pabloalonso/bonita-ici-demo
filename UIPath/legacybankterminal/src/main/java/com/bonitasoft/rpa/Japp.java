package com.bonitasoft.rpa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import com.bonitasoft.rpa.pages.First;
import com.bonitasoft.rpa.pages.Second;
import com.bonitasoft.rpa.pages.Third;

public class Japp extends JFrame {
	public static final Color BACKGROUND_COLOR = Color.BLACK;
	public static final Color FOREGROUND_COLOR = Color.GREEN;
	
	private JPanel contentPane = null;
	private First first = null;
	private Second second = null;
	private Third third = null;

	public Japp() {
		setTitle("Loan application");
		setPreferredSize(new Dimension (400, 500));
		setLocationRelativeTo(null);
		setFocusTraversalKeysEnabled(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		// Create content pane
		contentPane = new JPanel();
		contentPane.setBackground(BACKGROUND_COLOR);
		contentPane.setForeground(FOREGROUND_COLOR);
		contentPane.setLayout(new BorderLayout());
		contentPane.setFocusTraversalKeysEnabled(false);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		
		setFirst();
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) {
		        dispose();
		        System.exit(0);
		    }
		});
	}
	
	public void setFirst() {
		contentPane.removeAll();
		first = new First(this);
		second = null;
		third = null;
		contentPane.add(first, BorderLayout.CENTER);
		first.create.requestFocusInWindow();
		pack();
	}
	
	public void setSecond() {
		contentPane.removeAll();
		first = null;
		second = new Second(this);
		third = null;
		contentPane.add(second, BorderLayout.CENTER);
		second.firstname.requestFocusInWindow();
		pack();
	}
	
	public void setThird() {
		contentPane.removeAll();
		first = null;
		second = null;
		third = new Third(this);
		contentPane.add(third, BorderLayout.CENTER);
		third.ok.requestFocusInWindow();
		pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Japp japp = new Japp();
				japp.setVisible(true);
			}
		});
	}
}
