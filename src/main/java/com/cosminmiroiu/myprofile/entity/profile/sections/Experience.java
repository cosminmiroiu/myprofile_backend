package com.cosminmiroiu.myprofile.entity.profile.sections;

import com.cosminmiroiu.myprofile.entity.profile.Profile;
import com.cosminmiroiu.myprofile.enums.profile.Industry;
import com.cosminmiroiu.myprofile.enums.profile.JobType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "experience")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private Long experienceId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "company_name")
    @NotNull
    private String companyName;

    @Column(name = "company_location")
    @NotNull
    private String companyLocation;

    @Column(name = "industry")
    @NotNull
    private Industry industry;

    @Column(name = "job_title")
    @NotNull
    private String jobTitle;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_type")
    @NotNull
    private JobType jobType;

    @Column(name = "start_date")
    @NotNull
    private Date startDate;

    @Column(name = "in_progress")
    @NotNull
    private Boolean ongoing;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "description")
    private String description;

}
