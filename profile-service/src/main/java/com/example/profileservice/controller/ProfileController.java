package com.example.profileservice.controller;

import com.example.profileservice.dto.request.ProfileCreationRequest;
import com.example.profileservice.dto.response.ProfileResponse;
import com.example.profileservice.service.ProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ProfileController {
    ProfileService profileService;

    @PostMapping("/users")
    public ProfileResponse createProfile(@RequestBody ProfileCreationRequest request){
        return profileService.createProfile(request);
    }
}
