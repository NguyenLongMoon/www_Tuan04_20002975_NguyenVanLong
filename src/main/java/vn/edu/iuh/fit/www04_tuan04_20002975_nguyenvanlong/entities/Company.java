package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    private UUID compId;
    private String about;
    private String email;
    private String name;
    private String phone;
    private String webUrl;
    private Address address;

    public Company(UUID compId) {
        this.compId = compId;
    }
}
