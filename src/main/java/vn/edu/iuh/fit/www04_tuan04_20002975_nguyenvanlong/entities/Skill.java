package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities;

import lombok.*;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.enums.SkillType;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Skill {
    private UUID id;
    private String description;
    private String name;
    private SkillType type;

    public Skill(UUID id) {
        this.id = id;
    }
}
