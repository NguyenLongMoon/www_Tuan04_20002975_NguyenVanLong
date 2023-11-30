package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities;

import lombok.*;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JobSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Job job;
    private Skill skill;
}
