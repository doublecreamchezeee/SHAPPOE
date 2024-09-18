package com.example.profileservice.mapper;

import com.example.profileservice.dto.request.ProfileCreationRequest;
import com.example.profileservice.dto.response.ProfileResponse;
import com.example.profileservice.model.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    Profile toProfile(ProfileCreationRequest request);
    ProfileResponse toProfileResponse(Profile profile);
}
