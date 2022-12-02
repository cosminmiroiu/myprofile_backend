package com.cosminmiroiu.myprofile.enums.profile;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Getter
public enum JobType {
    ONSITE("On-Site"),
    HYBRID("Hybrid"),
    REMOTE("Remote");

    private final String type;

    JobType(String type) {
        this.type = type;
    }

    public static List<String> getJobTypes() {
        return Stream.of(JobType.values()).map(JobType::getType).collect(Collectors.toList());
    }
}
