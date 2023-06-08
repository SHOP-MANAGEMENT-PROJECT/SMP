package com.smp.dto.request;

import com.smp.repository.entity.enums.EStatus;
import com.smp.repository.entity.enums.EType;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateDeskRequestDto {
    private String tableName;
    private EStatus status;
}
