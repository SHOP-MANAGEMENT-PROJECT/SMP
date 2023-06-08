package com.smp.dto.request;

import com.smp.repository.entity.enums.ERole;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateUserRequestDto {
    private String userName;
    private String password;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private ERole eRole;
}
