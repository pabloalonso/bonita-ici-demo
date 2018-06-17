package org.mycompany.connector;

import org.bonitasoft.engine.connector.AbstractConnector;
import org.bonitasoft.engine.connector.ConnectorValidationException;

public abstract class AbstractGetLoanScoringImpl extends AbstractConnector {

	protected final static String CUSTOMERID_INPUT_PARAMETER = "customerId";
	protected final String SCORE_OUTPUT_PARAMETER = "score";

	protected final java.lang.String getCustomerId() {
		return (java.lang.String) getInputParameter(CUSTOMERID_INPUT_PARAMETER);
	}

	protected final void setScore(java.lang.Float score) {
		setOutputParameter(SCORE_OUTPUT_PARAMETER, score);
	}

	@Override
	public void validateInputParameters() throws ConnectorValidationException {
		try {
			getCustomerId();
		} catch (ClassCastException cce) {
			throw new ConnectorValidationException("customerId type is invalid");
		}

	}

}
