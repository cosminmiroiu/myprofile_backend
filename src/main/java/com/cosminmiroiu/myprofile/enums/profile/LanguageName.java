package com.cosminmiroiu.myprofile.enums.profile;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum LanguageName {

    ROMANIAN,
    ENGLISH,
    ITALIAN;

    public static List<String> getLanguages() {
        return Stream.of(LanguageName.values()).map(Enum::name).collect(Collectors.toList());
    }

}
