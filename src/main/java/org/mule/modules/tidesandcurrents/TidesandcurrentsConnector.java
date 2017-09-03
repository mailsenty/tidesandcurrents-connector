package org.mule.modules.tidesandcurrents;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.tidesandcurrents.config.ConnectorConfig;

@Connector(name="tidesandcurrents", friendlyName="Tidesandcurrents")
public class TidesandcurrentsConnector {

    @Config
    ConnectorConfig config;


    private final String CURRENTS = "https://tidesandcurrents.noaa.gov/api/datagetter?";
	
	private  URL url;


	HttpURLConnection con ;

    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    

    @Processor
    public String getCurrentsAndTides(String begin_date, String end_date,String station, String product,String units,String time_zone,String application,String format) {
        String response;
    	try {
    		url  = new URL(CURRENTS+"begin_date="+begin_date+"&end_date="+end_date+"&station="+station+"&product="+product+"&units="+units+"&time_zone="+time_zone+"&application="+application+"&format="+format);
			response=processConnection(url);
		} catch (MalformedURLException e) {
			response="Error connecting to endpoint Please retry";
			e.printStackTrace();
		}
    	catch (Exception e) {
    		response="Error connecting to endpoint Please retry" ;  				
			e.printStackTrace();
		}
    	return response;
  

    }
    private String processConnection(URL url){
    	
    	StringBuffer response = new StringBuffer();
    	
    	try {
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");

			// add request header
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
		}  catch (Exception e) {
			response=new StringBuffer("Error getting Yoda Speak");
			e.printStackTrace();
		}

		// print result
		return response.toString();
    }

}