package com.bonitasoft.rest.api;

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.apache.http.HttpHeaders
import org.bonitasoft.web.extension.ResourceProvider
import org.bonitasoft.web.extension.rest.RestApiResponse
import org.bonitasoft.web.extension.rest.RestApiResponseBuilder
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import com.bonitasoft.rpa.ProcessBuilderLauncher
import com.bonitasoft.web.extension.rest.RestAPIContext
import com.bonitasoft.web.extension.rest.RestApiController

class Index implements RestApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(Index.class)

    @Override
    RestApiResponse doHandle(HttpServletRequest request, RestApiResponseBuilder responseBuilder, RestAPIContext context) {
		StringBuilder stringBuffer = new StringBuilder();
		String readLine;
		BufferedReader bufferedReader = request.getReader();
		while ((readLine = bufferedReader.readLine()) != null) {
			stringBuffer.append(readLine);
		}
		
		def jsonSlurper = new JsonSlurper()
		def body = jsonSlurper.parseText(stringBuffer.toString())
		
		String command = null;
		if(body instanceof Map) {
			command = body.get("command");
		}
		
		return buildResponse(responseBuilder, HttpServletResponse.SC_OK, new JsonBuilder(ProcessBuilderLauncher.launchCommand(command)).toString())
    }

    RestApiResponse buildResponse(RestApiResponseBuilder responseBuilder, int httpStatus, Serializable body) {
        return responseBuilder.with {
            withResponseStatus(httpStatus)
            withResponse(body)
            build()
        }
    }

    RestApiResponse buildPagedResponse(RestApiResponseBuilder responseBuilder, Serializable body, int p, int c, long total) {
        return responseBuilder.with {
            withContentRange(p,c,total)
            withResponse(body)
            build()
        }
    }

    Properties loadProperties(String fileName, ResourceProvider resourceProvider) {
        Properties props = new Properties()
        resourceProvider.getResourceAsStream(fileName).withStream { InputStream s ->
            props.load s
        }
        props
    }

}
