package io.swagger.api;

import io.swagger.model.Activities;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

@Api(value = "history", description = "the history API")
public interface HistoryApi {

    @ApiOperation(value = "User Activity", notes = "The User Activity endpoint returns data about a user's lifetime activity with Uber. The response will include pickup locations and times, dropoff locations and times, the distance of past requests, and information about which products were requested.<br><br>The history array in the response will have a maximum length based on the limit parameter. The response value count may exceed limit, therefore subsequent API requests may be necessary.", response = Activities.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "History information for the given user", response = Activities.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Activities.class) })
    @RequestMapping(value = "/history",
        produces = { "application/JSON" }, 
        method = RequestMethod.GET)
    ResponseEntity<Activities> historyGet( @ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @RequestParam(value = "offset", required = false) Integer offset,
         @ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @RequestParam(value = "limit", required = false) Integer limit);

}
