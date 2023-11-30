package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities;

import lombok.*;

import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CandidateSkill {
    private String moreInfos;
    private SkillLevel skillLevel;
    private Skill skill;
    private Candidate candidate;
}
