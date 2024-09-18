package com.example.profileservice.service;

import com.example.profileservice.dto.request.CartCreationRequest;
import com.example.profileservice.dto.request.ProfileCreationRequest;
import com.example.profileservice.dto.response.ProfileResponse;
import com.example.profileservice.mapper.ProfileMapper;
import com.example.profileservice.model.Profile;
import com.example.profileservice.repository.ProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ProfileService {
    ProfileRepository profileRepository;
    ProfileMapper profileMapper;
    CartService cartService;
    public ProfileResponse createProfile(ProfileCreationRequest request){
        if (profileRepository.existsByUserId(request.getUserId()))
            throw new RuntimeException("User already exists");
        Profile profile = profileMapper.toProfile(request);
        var profileResponse = profileMapper.toProfileResponse(profileRepository.save(profile));
        CartCreationRequest cartRequest = new CartCreationRequest(profileResponse.getId(),0,0);
        var cartResponse = cartService.creatCart(cartRequest);
        System.out.println(cartResponse);
        System.out.println(profileResponse);
        return profileResponse;
    }
}
