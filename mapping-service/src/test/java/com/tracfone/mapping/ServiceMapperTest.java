package com.tracfone.mapping;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.tracfone.dto.ServiceDTO;
import com.tracfone.model.Individual;
import com.tracfone.model.Party;
import com.tracfone.model.RelatedParties;
import com.tracfone.model.TFModelRequest;
import com.tracfone.model.TFModelResponse;

public class ServiceMapperTest {
	TFModelRequest request;
	Party party;
	ServiceDTO serviceDto;
	@Before
	public void init() {
		request = new TFModelRequest();
		party = new Party();
		party.setPartyId("INRA123");
		Individual customer = new Individual();
		customer.setFirstName("Anu");
		customer.setId(106368l);
		customer.setLastName("Sha");
		party.setCustomer(customer);
		party.setLanguage("ENG");
		request.setRelatedParties(new RelatedParties("DEALER",party));
		
		serviceDto = new ServiceDTO();
		serviceDto.setCustomerId(112233);
		serviceDto.setFirstName("Anu");
		serviceDto.setLastName("Sha");
		serviceDto.setLanguage("ENG");
		serviceDto.setPartyId("INRA123");
	}
	

	@Test
	public void requestListTest() {
		List<ServiceDTO> serviceDtoList = new ArrayList<>();
		
		serviceDtoList.add(serviceDto);
		List<TFModelResponse> responseList = ServiceMapper.INSTANCE.serviceDtoList2Response(serviceDtoList);
		TFModelResponse response = responseList.get(0);
		assertThat(responseList.size(), is(1));
		assertEquals(response.getRelatedParties().getParty().getPartyId(),serviceDto.getPartyId());
		
	}
	
	@Test
	public void requestList2ServiceListTest() {
		List<TFModelRequest> requestList = new ArrayList<>();
		requestList.add(request);
		List<ServiceDTO> serviceDTOList = ServiceMapper.INSTANCE.requestList2ServiceList(requestList);
		assertThat(serviceDTOList.size(), is(1));
		ServiceDTO serviceDTO = serviceDTOList.get(0);
		assertEquals(serviceDTO.getLanguage(),requestList.get(0).getRelatedParties().getParty().getLanguage());
		assertEquals(new Double(serviceDTO.getCustomerId()),new Double(requestList.get(0).getRelatedParties().getParty().getCustomer().getId()));
	}
	
	@Test
	public void requestMap2ServiceDTOMap() {
		HashMap<Double,TFModelRequest> requestMap = new HashMap<>();
		requestMap.put(1d,request);
		HashMap<Double,ServiceDTO> serviceDtoMap = ServiceMapper.INSTANCE.requestMap2ServiceDTOMap(requestMap);
		assertThat(serviceDtoMap.size(), is(1));
		serviceDtoMap.forEach((key,value)->{
            System.out.println("Key: "+key + " value: "+value);
            assertEquals(value.getLastName(),"Sha");
        });
	}
	
	@Test
	public void serviceDtoMap2Response() {
		HashMap<Double,ServiceDTO> request = new HashMap<>();
		request.put(1d, serviceDto);
		HashMap<Double,TFModelResponse> modelResponse = ServiceMapper.INSTANCE.serviceDtoMap2Response(request);
		assertThat(modelResponse.size(), is(1));
		modelResponse.forEach((key,value)->{
            System.out.println("Key: "+key + " value: "+value);
            assertEquals(value.getRelatedParties().getParty().getCustomer().getFirstName(),"Anu");
        });
	}
}
