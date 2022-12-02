package com.cosminmiroiu.myprofile.enums.profile;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum LanguageLevel {

    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced"),
    NATIVE("Native");
    private final String level;
    LanguageLevel(String level) {
        this.level = level;
    }

    public static List<String> getLanguageLevels() {
        return Stream.of(LanguageLevel.values()).map(LanguageLevel::getLevel).collect(Collectors.toList());
    }

}
