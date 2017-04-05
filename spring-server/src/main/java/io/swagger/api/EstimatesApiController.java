package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

@Controller
public class EstimatesApiController implements EstimatesApi {



    public ResponseEntity<List<PriceEstimate>> estimatesPriceGet( @NotNull @ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude,
         @NotNull @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude,
         @NotNull @ApiParam(value = "Latitude component of end location.", required = true) @RequestParam(value = "endLatitude", required = true) Double endLatitude,
         @NotNull @ApiParam(value = "Longitude component of end location.", required = true) @RequestParam(value = "endLongitude", required = true) Double endLongitude) {
        // do some magic!
        return new ResponseEntity<List<PriceEstimate>>(HttpStatus.OK);
    }

    public ResponseEntity<List<Product>> estimatesTimeGet( @NotNull @ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude,
         @NotNull @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude,
         @ApiParam(value = "Unique customer identifier to be used for experience customization.") @RequestParam(value = "customerUuid", required = false) UUID customerUuid,
         @ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @RequestParam(value = "productId", required = false) String productId) {
        // do some magic!
        return new ResponseEntity<List<Product>>(HttpStatus.OK);
    }

}
