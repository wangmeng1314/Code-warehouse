package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

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

@Api(value = "estimates", description = "the estimates API")
public interface EstimatesApi {

    @ApiOperation(value = "Price Estimates", notes = "The Price Estimates endpoint returns an estimated price range for each product offered at a given location. The price estimate is provided as a formatted string with the full price range and the localized currency symbol.<br><br>The response also includes low and high estimates, and the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for situations requiring currency conversion. When surge is active for a particular product, its surge_multiplier will be greater than 1, but the price estimate already factors in this multiplier. ", response = PriceEstimate.class, responseContainer = "List", tags={ "Estimates", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of price estimates by product", response = PriceEstimate.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PriceEstimate.class) })
    @RequestMapping(value = "/estimates/price",
        produces = { "application/JSON" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PriceEstimate>> estimatesPriceGet( @NotNull @ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude,
         @NotNull @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude,
         @NotNull @ApiParam(value = "Latitude component of end location.", required = true) @RequestParam(value = "endLatitude", required = true) Double endLatitude,
         @NotNull @ApiParam(value = "Longitude component of end location.", required = true) @RequestParam(value = "endLongitude", required = true) Double endLongitude);


    @ApiOperation(value = "Time Estimates", notes = "The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.", response = Product.class, responseContainer = "List", tags={ "Estimates", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of products", response = Product.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Product.class) })
    @RequestMapping(value = "/estimates/time",
        produces = { "application/JSON" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> estimatesTimeGet( @NotNull @ApiParam(value = "Latitude component of start location.", required = true) @RequestParam(value = "startLatitude", required = true) Double startLatitude,
         @NotNull @ApiParam(value = "Longitude component of start location.", required = true) @RequestParam(value = "startLongitude", required = true) Double startLongitude,
         @ApiParam(value = "Unique customer identifier to be used for experience customization.") @RequestParam(value = "customerUuid", required = false) UUID customerUuid,
         @ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @RequestParam(value = "productId", required = false) String productId);

}
