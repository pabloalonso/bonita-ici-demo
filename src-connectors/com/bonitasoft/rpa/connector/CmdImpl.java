/**
 * 
 */
package com.bonitasoft.rpa.connector;

import java.io.IOException;

import org.bonitasoft.engine.connector.ConnectorException;

import com.bonitasoft.rpa.ProcessBuilderLauncher;

public class CmdImpl extends AbstractCmdImpl {

	@Override
	protected void executeBusinessLogic() throws ConnectorException{
		try {
			setResult(ProcessBuilderLauncher.launchCommand(getCommand()));
		} catch (IOException | InterruptedException e) {
			throw new ConnectorException(e);
		}
	 }

	@Override
	public void connect() throws ConnectorException{}

	@Override
	public void disconnect() throws ConnectorException{}
}
