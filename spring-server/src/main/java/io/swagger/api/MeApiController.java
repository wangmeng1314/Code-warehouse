package io.swagger.api;

import io.swagger.model.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T01:24:56.281Z")

@Controller
public class MeApiController implements MeApi {

    private static final Logger logger = LoggerFactory.getLogger(MeApiController.class);

    public ResponseEntity<Profile> meGet() {
        // do some magic!
        logger.error("fdsfdsafdfs");
        return new ResponseEntity<Profile>(HttpStatus.OK);
    }

}
