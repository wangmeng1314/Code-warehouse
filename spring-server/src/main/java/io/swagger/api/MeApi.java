package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Profile;

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

@Api(value = "me", description = "the me API")
public interface MeApi {

    @ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = Profile.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Profile information for a user", response = Profile.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Profile.class) })
    @RequestMapping(value = "/me",
        produces = { "application/JSON" }, 
        method = RequestMethod.GET)
    ResponseEntity<Profile> meGet();

}
