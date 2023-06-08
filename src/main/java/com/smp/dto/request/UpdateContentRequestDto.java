package com.smp.dto.request;

import com.smp.repository.entity.enums.ERole;
import com.smp.repository.entity.enums.EType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateContentRequestDto {
    private String name;
    private Double price;
    private EType type;
}
