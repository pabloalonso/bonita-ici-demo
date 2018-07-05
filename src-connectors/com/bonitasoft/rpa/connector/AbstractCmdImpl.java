package com.bonitasoft.rpa.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractCmdImpl extends AbstractConnector {

	protected final static String COMMAND_INPUT_PARAMETER = "command";
	protected final String RESULT_OUTPUT_PARAMETER = "result";

	protected final java.lang.String getCommand() {
		return (java.lang.String) getInputParameter(COMMAND_INPUT_PARAMETER);
	}

	protected final void setResult(java.util.Map result) {
		setOutputParameter(RESULT_OUTPUT_PARAMETER, result);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getCommand();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("command type is invalid");
		}

	}

}
