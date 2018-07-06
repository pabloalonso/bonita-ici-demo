package com.bonitasoft.rpa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ProcessBuilderLauncher {
	public final static Map<String, Object> launchCommand(String command) throws IOException, InterruptedException {
		Map map = new HashMap<String, Object>();

		final StringBuffer out = new StringBuffer();
		final Process process = new ProcessBuilder(command).redirectErrorStream(true).start();
		new Thread(new Runnable() {
			public void run() {
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line = null; 

				try {
					boolean firstLine = true;
					while ((line = input.readLine()) != null) {
						out.append((firstLine ? "" : "\n") + line);
						firstLine = false;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();

		map.put("code", process.waitFor());
		map.put("out", out.toString());

		return map;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String command = "\"C:\\Users\\pierr\\AppData\\Local\\UiPath\\app-18.2.3\\UiRobot.exe\" -file \"D:\\Pierrick\\Documents\\US\\Adoption\\webinars\\RPA\\demo\\bonita-ici-demo\\UIPath\\Read PDF\\readPDFText.xaml\"  -input \"{'pdfLocation': 'credit-history.pdf', 'taskId': '160010'}\"";
		Map<String, Object> bla = launchCommand(command);
		System.out.println(bla);
	}
}
