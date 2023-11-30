package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Job {
    private UUID id;
    private String desc;
    private String name;
    private Company company;

    public Job(UUID id) {
        this.id = id;
    }
}
