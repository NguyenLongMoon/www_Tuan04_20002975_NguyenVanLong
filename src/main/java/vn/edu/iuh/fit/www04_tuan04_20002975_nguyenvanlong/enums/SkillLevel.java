package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum SkillLevel {
    BEGINNER(0), INTERMEDIATE(1), PROFICIENT(2);

    private final int value;

    SkillLevel(int value) {
        this.value = value;
    }

    public static SkillLevel convert(int value) {
        return Arrays.stream(SkillLevel.values())
                .filter(skillLevel -> skillLevel.value == value)
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }

}
