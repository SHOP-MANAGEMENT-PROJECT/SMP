package com.smp.repository.entity;

import com.smp.repository.entity.enums.EStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="tbl_desk")
@Entity
public class Desk extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tableName;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EStatus tableStatus=EStatus.PASSIVE;

}
