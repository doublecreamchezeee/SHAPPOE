package com.example.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
//public class ProfileCreationRequest {
//    String username;
//    String identityNumber;
//    String phoneNumber;
//    String fullName;
//}

public class ProfileCreationRequest {
    String userId;
    String firstName;
    String lastName;
    String city;
    LocalDate dob;
}
