package com.afo.ecomm.fullstop.user.model.request;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class CommonUserResponse {
	
	private Long userId;
	
	private String userName;
	
	private String email;
	
}