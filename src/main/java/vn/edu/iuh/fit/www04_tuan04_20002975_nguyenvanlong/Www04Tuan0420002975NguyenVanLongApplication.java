package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Candidate;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.services.CandidateServices;

import java.util.List;

@SpringBootApplication
public class Www04Tuan0420002975NguyenVanLongApplication {
    @Autowired
    private CandidateServices candidateServices;

    public static void main(String[] args) {
        SpringApplication.run(Www04Tuan0420002975NguyenVanLongApplication.class, args);
    }

    @Bean
    CommandLineRunner test() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//				Address address = new Address(UUID.fromString("f1fd5b76-0491-476e-ac85-1a613d25b24e"));
//				Candidate candidate = new Candidate(UUID.randomUUID(), LocalDate.now(), "a1@gmail.com", "Nguyen Van A", "012345678", address);
//
//				boolean b = candidateServices.create(candidate);
//				System.out.println("Insert candidate: " + b);

                List<Candidate> candidates = candidateServices.getAll();

                System.out.println(candidates);
            }
        };
    }
}
