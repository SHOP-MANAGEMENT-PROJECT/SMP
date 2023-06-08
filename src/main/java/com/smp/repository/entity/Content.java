package com.smp.repository.entity;

import com.smp.repository.entity.enums.EStatus;
import com.smp.repository.entity.enums.EType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Table;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tbl_content")
@Entity
public class Content extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    @Enumerated(EnumType.STRING)
    private EType type;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EStatus status=EStatus.ACTIVE;

}
