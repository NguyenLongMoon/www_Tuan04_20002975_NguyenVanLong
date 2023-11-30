package vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.services;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.dao.CandidateDAO;
import vn.edu.iuh.fit.www04_tuan04_20002975_nguyenvanlong.entities.Candidate;

import java.util.List;

@Component
public class CandidateServices {
    private final CandidateDAO candidateDAO;

    public CandidateServices(CandidateDAO candidateDAO) {
        this.candidateDAO = candidateDAO;
    }

    public List<Candidate> getAll() {
        return candidateDAO.getAll();
    }

    public boolean create(Candidate candidate) {
        return candidateDAO.create(candidate);
    }
}
