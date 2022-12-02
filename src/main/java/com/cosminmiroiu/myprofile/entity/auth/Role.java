package com.cosminmiroiu.myprofile.entity.auth;

import com.cosminmiroiu.myprofile.enums.auth.RoleType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_type")
    @Enumerated(EnumType.STRING)
    @NotNull
    private RoleType type;

}
