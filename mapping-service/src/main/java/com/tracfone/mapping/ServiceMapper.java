package com.tracfone.mapping;

import java.util.HashMap;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.tracfone.dto.ServiceDTO;
import com.tracfone.model.TFModelRequest;
import com.tracfone.model.TFModelResponse;

@Mapper
public interface ServiceMapper {
	ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);
	
	@Mappings({
		@Mapping(target="partyId", source="relatedParties.party.partyId"),
		@Mapping(target="language", source="relatedParties.party.language"),
		@Mapping(target="firstName", source="relatedParties.party.customer.firstName"),
		@Mapping(target="lastName", source="relatedParties.party.customer.lastName"),
		@Mapping(target="customerId", source="relatedParties.party.customer.id")
	})
	ServiceDTO request2ServiceDTO(TFModelRequest request);	
	
	@Mappings({	
		@Mapping(target="relatedParties.party.partyId", source="partyId"),
		@Mapping(target="relatedParties.party.language", source="language", defaultValue="ENG"),
		@Mapping(target="relatedParties.party.customer.firstName", source="firstName"),
		@Mapping(target="relatedParties.party.customer.lastName", source="lastName"),
		@Mapping(target="relatedParties.party.customer.id", source="customerId"),
		@Mapping(target="relatedParties.roleType", constant="constantType")
	}) 
	TFModelResponse ServiceDTO2Response(ServiceDTO dto);
	
	List<ServiceDTO> requestList2ServiceList(List<TFModelRequest> requestList);
	
	HashMap<Double,ServiceDTO> requestMap2ServiceDTOMap(HashMap<Double,TFModelRequest> request);
	
	List<TFModelResponse> serviceDtoList2Response(List<ServiceDTO> request);
	
	HashMap<Double,TFModelResponse> serviceDtoMap2Response(HashMap<Double,ServiceDTO> request);

}
