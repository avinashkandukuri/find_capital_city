package com.test.findcapitalcity.service;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import com.test.findcapitalcity.model.Response;


/**
 *
 * Service that interacts with REST end point to fetch state details.
 *
 */

public class Service {

	private static String baseURL = "https://restcountries.eu/rest/v2/name/INPUT?fullText=true";

	public String getContent(String country) throws Exception {
		Response[] response = null;
		ObjectMapper mapper = new ObjectMapper();
		String output = null;
		String finalutl = baseURL.replace("INPUT", country);
		try {

			response = mapper.readValue(new java.net.URL(finalutl), Response[].class);
			String message = response[0].getMessage();

			if (message!=null && message.contains("Not Found")) {
				output = message;
			} else {
				output = "Capital : " + response[0].getCapital() +
							", Code : " + response[0].getAlpha3Code()+
							", Country Name : " + response[0].getName() +
							", population : " + response[0].getPopulation();
			}

		} catch (IOException e) {
			throw new Exception("Exception occurred : Please verify input and try again later!!");
		}
		return output;
	}

}
