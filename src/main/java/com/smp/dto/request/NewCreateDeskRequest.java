package com.smp.dto.request;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NewCreateDeskRequest {

    private String tableName;

}
