/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.viktor.ttt.taskTracker.v1.service;

import com.viktor.ttt.taskTracker.v1.model.AddCommentConfirmation;
import com.viktor.ttt.taskTracker.v1.model.AddCommentRequestBody;
import com.viktor.ttt.taskTracker.v1.model.AddTaskConfirmation;
import com.viktor.ttt.taskTracker.v1.model.AddTaskRequestBody;
import com.viktor.ttt.taskTracker.v1.model.DeleteCommentConfirmation;
import com.viktor.ttt.taskTracker.v1.model.DeleteTaskConfirmation;
import com.viktor.ttt.taskTracker.v1.model.Task;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-13T00:43:09.136+02:00")

@Api(value = "TaskTracker", description = "the TaskTracker API")
@RequestMapping(value = "/api/v1")
public interface TaskTrackerApi {

    Logger log = LoggerFactory.getLogger(TaskTrackerApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a comment", nickname = "addComment", notes = "Add a comment", response = AddCommentConfirmation.class, tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = AddCommentConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access forbidden") })
    @RequestMapping(value = "/task-tracker/comment",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<AddCommentConfirmation> addComment(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AddCommentRequestBody body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"message\"}", AddCommentConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Add a task", nickname = "addTask", notes = "Add a new task in database", response = AddTaskConfirmation.class, tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = AddTaskConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access unauthorized") })
    @RequestMapping(value = "/task-tracker/task",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AddTaskConfirmation> addTask(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AddTaskRequestBody body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"message\"}", AddTaskConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete a comment", nickname = "deleteComment", notes = "Delete a comment", response = DeleteCommentConfirmation.class, tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = DeleteCommentConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access forbidden") })
    @RequestMapping(value = "/task-tracker/comment/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<DeleteCommentConfirmation> deleteComment(@ApiParam(value = "id of comment",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"message\"}", DeleteCommentConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete a task", nickname = "deleteTask", notes = "Delete a task", response = DeleteTaskConfirmation.class, tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = DeleteTaskConfirmation.class),
        @ApiResponse(code = 403, message = "Status 403 - Access forbidden") })
    @RequestMapping(value = "/task-tracker/task/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<DeleteTaskConfirmation> deleteTask(@ApiParam(value = "id of task",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"message\" : \"message\"}", DeleteTaskConfirmation.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Return a task by id", nickname = "getTask", notes = "Fetch a task by id", response = Task.class, tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = Task.class),
        @ApiResponse(code = 403, message = "Status 403 - Access forbidden") })
    @RequestMapping(value = "/task-tracker/task/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Task> getTask(@ApiParam(value = "id of task",required=true) @PathVariable("id") String id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"comments\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  } ],  \"name\" : \"Task\",  \"description\" : \"This is some description for the task\",  \"id\" : 1,  \"assignedUsers\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  } ]}", Task.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Returns a list of tasks.", nickname = "getTasks", notes = "Fetch all tasks from database.", response = Task.class, responseContainer = "List", tags={ "TaskTracker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200 - Response OK", response = Task.class, responseContainer = "List"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/task-tracker/task",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Task>> getTasks() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"comments\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  } ],  \"name\" : \"Task\",  \"description\" : \"This is some description for the task\",  \"id\" : 1,  \"assignedUsers\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  } ]}, {  \"comments\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"id\" : 1,    \"content\" : \"content\",    \"username\" : \"username\"  } ],  \"name\" : \"Task\",  \"description\" : \"This is some description for the task\",  \"id\" : 1,  \"assignedUsers\" : [ {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  }, {    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",    \"address\" : \"Wall St.\",    \"comments\" : [ {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    }, {      \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 1,      \"content\" : \"content\",      \"username\" : \"username\"    } ],    \"fullName\" : \"Full Name\",    \"dateOfBirth\" : \"2000-01-23\",    \"id\" : 1,    \"email\" : \"example@example.com\",    \"username\" : \"userName\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskTrackerApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
