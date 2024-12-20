package com.afo.fullstop.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afo.ecomm.fullstop.user.model.request.CommonUserResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@Tag(name = "User API")
public class UserController {

	@GetMapping("/products/{id}")
	public ResponseEntity<CommonUserResponse> getProduct(@PathVariable Long id) {
		CommonUserResponse commonUserResponse = new CommonUserResponse();
		// retrieval logic
		return (ResponseEntity<CommonUserResponse>) ResponseEntity.ok();
	}
}
