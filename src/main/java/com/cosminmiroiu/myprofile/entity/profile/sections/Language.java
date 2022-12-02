package com.cosminmiroiu.myprofile.entity.profile.sections;

import com.cosminmiroiu.myprofile.entity.profile.Profile;
import com.cosminmiroiu.myprofile.enums.profile.LanguageLevel;
import com.cosminmiroiu.myprofile.enums.profile.LanguageName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "languages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Long languageId;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    @Enumerated(EnumType.STRING)
    @Column(name = "languages")
    @NotNull
    private LanguageName language;

    @Enumerated(EnumType.STRING)
    @NotNull
    private LanguageLevel languageLevel;

}
