package com.cosminmiroiu.myprofile.entity.profile.sections;

import com.cosminmiroiu.myprofile.entity.profile.Profile;
import com.cosminmiroiu.myprofile.enums.profile.EducationStage;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "education")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Long educationId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    @Column(name = "stage")
    @NotNull
    private EducationStage stage;

    @Column(name = "start_date")
    @NotNull
    private Date startDate;

    @Column(name = "in_progress")
    @NotNull
    private Boolean ongoing;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "institution_name")
    @NotNull
    private String institutionName;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "institution_loc")
    @NotNull
    private String location;

    @Column(name = "description")
    private String description;

}
