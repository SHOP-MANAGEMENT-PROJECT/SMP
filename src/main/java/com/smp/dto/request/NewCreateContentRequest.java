package com.smp.dto.request;

import com.smp.repository.entity.enums.EType;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NewCreateContentRequest {
    private String name;
    private double price;
    private EType type;
}
