package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.mapper;

import org.springframework.jdbc.core.RowMapper;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Job;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.JobSkill;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Skill;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.enums.SkillLevel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class JobSkillMapper implements RowMapper<JobSkill> {
    @Override
    public JobSkill mapRow(ResultSet rs, int rowNum) throws SQLException {
        String moreInfos = rs.getString("more_infos");
        int skillLevelInt = rs.getInt("skill_level");
        String skillId = rs.getString("skill_id");
        String jobId = rs.getString("job_id");

        Job job = new Job(UUID.fromString(jobId));
        Skill skill = new Skill(UUID.fromString(skillId));
        SkillLevel skillLevel = SkillLevel.convert(skillLevelInt);

        return new JobSkill(moreInfos, skillLevel, job, skill);
    }
}
