package com.cosminmiroiu.myprofile.entity.profile;

import com.cosminmiroiu.myprofile.entity.auth.User;
import com.cosminmiroiu.myprofile.entity.profile.sections.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long profileId;

    @Column(name = "is_public")
    @NotNull
    private Boolean isPublic = false;

    @Column(name = "flag_public_msg")
    @NotNull
    private Boolean flagPublicMsg = true;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    private Address address;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "about_me")
    private String aboutMe;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Experience> experienceList;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Education> educationList;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Skill> skillList;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Language> languageList;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Project> projectList;

    @OneToOne(mappedBy = "profile")
    private User user;

}
