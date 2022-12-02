package com.cosminmiroiu.myprofile.enums.profile;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum EducationStage {

    PRIMARY_SCHOOL("Primary school"),
    HIGH_SCHOOL("High school"),
    UNIVERSITY("University"),
    POST_UNIVERSITY("Post University"),
    COURSE("Course"),
    OTHER("Other");

    private final String edStage;

    EducationStage(String edStage) {
        this.edStage = edStage;
    }

    public static List<String> getEdStages() {
        return Stream.of(EducationStage.values()).map(EducationStage::getEdStage).collect(Collectors.toList());
    }

}
