package com.afo.ecomm.fullstop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.afo.ecomm.fullstop.model.entity.User;
import com.afo.ecomm.fullstop.model.exchange.CommonUserResponse;
import com.afo.ecomm.fullstop.repository.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
@Tag(name = "User", description= "User Controller")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepo;

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
	
	@Operation(summary = "Create User API",  description="Create User API", operationId="createUser")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiResponses(value={
			@ApiResponse(responseCode = "200" ,description= "Success"),
			@ApiResponse(responseCode = "400" ,description= "Bad Request"),
			@ApiResponse(responseCode = "404" ,description= "Not Found"),
			@ApiResponse(responseCode = "403" ,description= "Unauthorized"),
			@ApiResponse(responseCode = "500" ,description= "Something Went Wrong")
	})
	@PostMapping("/")
	public ResponseEntity<?> createUser(
			@Parameter(description = "Request Body For creating user", required = true) @RequestBody @Valid User users) {
		User newUser= userRepo.save(users);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);
	}
	@Operation(summary = "Create User API",  description="Create User API", operationId="createUser")
	@ResponseStatus(HttpStatus.OK)
	@ApiResponses(value={
			@ApiResponse(responseCode = "200" ,description= "Success"),
			@ApiResponse(responseCode = "400" ,description= "Bad Request"),
			@ApiResponse(responseCode = "404" ,description= "Not Found"),
			@ApiResponse(responseCode = "403" ,description= "Unauthorized"),
			@ApiResponse(responseCode = "500" ,description= "Something Went Wrong")
	})
	@GetMapping("/")
	public ResponseEntity<?> getAllUsers() {
		return ResponseEntity.ok(this.userRepo.findAll());
		
	}
	
	
	
}
