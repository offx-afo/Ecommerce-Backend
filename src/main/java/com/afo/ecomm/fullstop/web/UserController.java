package com.afo.ecomm.fullstop.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.afo.ecomm.fullstop.user.model.request.CommonUserResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@Tag(name = "User", description= "User Controller")
public class UserController {

	@Operation(summary = "Get User API",  description="Get User API", operationId="getUser")
	@ResponseStatus(HttpStatus.OK)
	@ApiResponses(value={
			@ApiResponse(responseCode = "200" ,description= "Success"),
			@ApiResponse(responseCode = "400" ,description= "Bad Request"),
			@ApiResponse(responseCode = "404" ,description= "Not Found"),
			@ApiResponse(responseCode = "403" ,description= "Unauthorized"),
			@ApiResponse(responseCode = "500" ,description= "Something Went Wrong")
	})
	@GetMapping("/{userId}")
	public ResponseEntity<CommonUserResponse> getUser(
			@Parameter(description="Holds an User ID", example="1", allowEmptyValue=true) @RequestHeader(value="userId", required=true) Long userId) {
		CommonUserResponse commonUserResponse = new CommonUserResponse();
		// retrieval logic
		return new ResponseEntity<>(commonUserResponse, HttpStatus.OK);
	}
}
