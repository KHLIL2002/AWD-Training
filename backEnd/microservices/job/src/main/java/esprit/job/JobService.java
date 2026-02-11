package esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job getJobById(int id) {
        return jobRepository.findById(id).orElse(null);
    }

    public Job getJobByNom(String nom) {
        return jobRepository.findByNom(nom).orElse(null);
    }

    public Job updateEtat(int id, String etat) {
        Job job = jobRepository.findById(id).orElse(null);
        if (job != null) {
            job.setEtat(etat);
            return jobRepository.save(job);
        }
        return null;
    }
}
