package com.cosminmiroiu.myprofile.entity.profile.sections;

import com.cosminmiroiu.myprofile.entity.profile.Profile;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "start_date")
    @NotNull
    private Date startDate;

    @Column(name = "in_progress")
    @NotNull
    private Boolean ongoing;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "description")
    @NotNull
    private String description;

}
