package esprit.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobRestApi {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/search")
    public Job getJobByNom(@RequestParam String nom) {
        return jobService.getJobByNom(nom);
    }

    @PutMapping("/{id}/etat")
    public Job updateEtat(@PathVariable int id,
                          @RequestParam String etat) {
        return jobService.updateEtat(id, etat);
    }
}
