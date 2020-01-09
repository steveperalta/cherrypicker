package gov.texas.esb.cxf.okta.client.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import gov.texas.esb.cxf.okta.client.api.LogEvents;
import gov.texas.esb.cxf.okta.client.service.OktaService;
import gov.texas.trs.esb.okta.model.LogEvent;
import gov.texas.trs.esb.okta.model.User;
import gov.texas.trs.okta.client.api.LogApi;

@Component( 
		configurationPid="gov.texas.trs.okta.client",
		property = {
			"oktaUri=your_okta_uri",
			"token=your_okta_token"
			
		}) 
public class OktaServiceImpl implements OktaService{


    private String oktaUri;
   
    private String authorizationHeader;
    private static final String AUTH_KEY="Authorization";
   
    private LogApi logApi;
    @Activate
    public void activate(Map<String, String> properties) {
    	
    	 oktaUri=properties.get("oktaUri");
    	 authorizationHeader="SSWS " + properties.get("token");
    }
 
    @Override
    public LogEvents getLogEvents(LocalDateTime since, LocalDateTime until) {
		
    	if(logApi==null)
    		logApi=init(LogApi.class);
    	 String filter = null;
         String q = null;
         Integer limit = 5;
         String sortOrder = "DESCENDING";
         String after = null;
      

         List<LogEvent> response = logApi.getLogs(until.toString(), since.toString(), filter, q, limit, sortOrder, after);

         return new LogEvents(response);
        
    }
     

	   public <T> T init(Class<T> apiClazz) {
	        JacksonJsonProvider provider = new JacksonJsonProvider();
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


	        provider.setMapper(mapper);
	        List providers = new ArrayList();
	        providers.add(provider);
	        
	        T api = JAXRSClientFactory.create(oktaUri, apiClazz, providers);
	        
	        Client client = WebClient.client(api);
	     	client.header("Authorization", authorizationHeader);

	     	return api;
	       
	    }

}
