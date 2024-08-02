package com.example.identityservice.mapper;

import com.example.identityservice.dto.request.ProfileCreationRequest;
import com.example.identityservice.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel =  "spring")
public interface ProfileMapper {
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "dob", target = "dob")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "username", target = "userId")
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}