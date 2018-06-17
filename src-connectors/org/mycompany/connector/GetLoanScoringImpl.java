/**
 * 
 */
package org.mycompany.connector;

import org.bonitasoft.engine.connector.ConnectorException;

/**
*The connector execution will follow the steps
* 1 - setInputParameters() --> the connector receives input parameters values
* 2 - validateInputParameters() --> the connector can validate input parameters values
* 3 - connect() --> the connector can establish a connection to a remote server (if necessary)
* 4 - executeBusinessLogic() --> execute the connector
* 5 - getOutputParameters() --> output are retrieved from connector
* 6 - disconnect() --> the connector can close connection to remote server (if any)
*/
public class GetLoanScoringImpl extends AbstractGetLoanScoringImpl {

	@Override
	protected void executeBusinessLogic() throws ConnectorException{
		//Get access to the connector input parameters
		//getCustomerId();
	
		//TODO execute your business logic here 
	
		//WARNING : Set the output of the connector execution. If outputs are not set, connector fails
		//setScore(score);
		throw new ConnectorException("External Scoring system return the following error: 'Error 1904: This API is no more available, please update your application to use the API v2 instead. See documentation for more details.'");
	
	 }

	@Override
	public void connect() throws ConnectorException{
		//[Optional] Open a connection to remote server
	
	}

	@Override
	public void disconnect() throws ConnectorException{
		//[Optional] Close connection to remote server
	
	}

}
