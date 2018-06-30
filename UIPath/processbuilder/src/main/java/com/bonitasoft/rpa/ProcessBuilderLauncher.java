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
		final Process process = new ProcessBuilder(command).inheritIO().start();
		new Thread(new Runnable() {
			public void run() {
				BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String line = null; 

				try {
					while ((line = input.readLine()) != null) {
						out.append(line + "\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();

		map.put("code", process.waitFor());
		map.put("out", out);

		return map;
	}
}
