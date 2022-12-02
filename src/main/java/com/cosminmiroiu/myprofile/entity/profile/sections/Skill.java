package com.cosminmiroiu.myprofile.entity.profile.sections;

import com.cosminmiroiu.myprofile.entity.profile.Profile;
import com.cosminmiroiu.myprofile.enums.profile.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "skill")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "type")
    private SkillType type;

    @Column(name = "name")
    private String name;

}
