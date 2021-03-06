/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.viktor.ttt.taskTracker.v1.service;

import com.viktor.ttt.taskTracker.v1.model.LoginConfirmation;
import com.viktor.ttt.taskTracker.v1.model.LoginUserRequestBody;
import com.viktor.ttt.taskTracker.v1.model.RegisterUserRequestBody;
import com.viktor.ttt.taskTracker.v1.model.RegistrationConfirmation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-13T00:43:09.361+02:00")

@Api(value = "Authentication", description = "the Authentication API")
@RequestMapping(value = "/api/v1")
public interface AuthenticationApi {

    Logger log = LoggerFactory.getLogger(AuthenticationApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "User Login", nickname = "loginUser", notes = "User Login", response = LoginConfirmation.class, tags={ "Authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = LoginConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access unauthorized") })
    @RequestMapping(value = "/authenticate/login",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<LoginConfirmation> loginUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody LoginUserRequestBody body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"A Message\",  \"status\" : 200}", LoginConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AuthenticationApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Register a user", nickname = "registerUser", notes = "Register a new user", response = RegistrationConfirmation.class, tags={ "Authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = RegistrationConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access unauthorized") })
    @RequestMapping(value = "/authenticate/register",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<RegistrationConfirmation> registerUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RegisterUserRequestBody body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"A Message\",  \"status\" : 200}", RegistrationConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AuthenticationApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
