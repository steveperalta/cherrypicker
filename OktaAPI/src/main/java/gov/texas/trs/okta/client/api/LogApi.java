package gov.texas.trs.okta.client.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import gov.texas.trs.esb.okta.model.LogEvent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Okta API
 *
 * <p>Allows customers to easily access the Okta API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface LogApi  {

    /**
     * Fetch a list of events from your Okta organization system log.
     *
     * The Okta System Log API provides read access to your organization’s system log. This API provides more functionality than the Events API
     *
     */
    @GET
    @Path("/api/v1/logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Fetch a list of events from your Okta organization system log.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LogEvent.class, responseContainer = "List") })
    public List<LogEvent> getLogs(@QueryParam("until")String until, @QueryParam("since")String since, @QueryParam("filter")String filter, @QueryParam("q")String q, @QueryParam("limit")@DefaultValue("100") Integer limit, @QueryParam("sortOrder")@DefaultValue("ASCENDING") String sortOrder, @QueryParam("after")String after);
}

