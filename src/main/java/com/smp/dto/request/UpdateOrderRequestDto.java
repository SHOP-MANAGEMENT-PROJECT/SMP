package com.smp.dto.request;

import lombok.*;

import javax.persistence.ElementCollection;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateOrderRequestDto {
    private Long id;
    private Long tableId;
    private List<Long> contentId;
    private Long userId;
}
