package com.afo.ecomm.fullstop.user.model.request;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class CommonUserResponse {
	
	private Long userId;
	
	private String userName;
	
	private String email;
	
}