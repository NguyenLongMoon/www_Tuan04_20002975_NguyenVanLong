package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.mapper;

import org.springframework.jdbc.core.RowMapper;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Company;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Job;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class JobMapper implements RowMapper<Job> {
    @Override
    public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("job_id");
        String desc = rs.getString("job_desc");
        String name = rs.getString("job_name");
        String companyId = rs.getString("company");

        Job job = new Job(UUID.fromString(id), desc, name, new Company(UUID.fromString(companyId)));

        return job;
    }
}
