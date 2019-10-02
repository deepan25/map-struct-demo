package com.tracfone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tracfone.dto.ServiceDTO;
import com.tracfone.mapping.ServiceMapper;
import com.tracfone.model.TFModelRequest;
import com.tracfone.model.TFModelResponse;

@RestController
public class MyMappingController {
	
	@PostMapping(path = "/service-mapping", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TFModelResponse> processServiceMapping(@RequestBody TFModelRequest request) {
		
		ServiceDTO dto = ServiceMapper.INSTANCE.request2ServiceDTO(request);
		
		System.out.println("From DTO ............. "+ dto.toString());
		
		TFModelResponse response = ServiceMapper.INSTANCE.ServiceDTO2Response(dto);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
