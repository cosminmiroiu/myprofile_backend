package com.cosminmiroiu.myprofile.entity.profile;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "country")
    @NotNull
    private String country;

    @Column(name = "town")
    @NotNull
    private String town;

    @OneToOne(mappedBy = "address")
    private Profile profile;

}
