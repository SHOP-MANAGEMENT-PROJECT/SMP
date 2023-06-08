package com.smp.repository.entity;

import com.smp.repository.entity.enums.ERole;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Table;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tbl_user")
@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;
    @Enumerated(EnumType.STRING)
    private ERole eRole;

}
