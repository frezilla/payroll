package eu.frezilla.payroll.api.controllers;

import eu.frezilla.payroll.entities.Project;
import eu.frezilla.payroll.repositories.ProjectRepository;
import java.util.Objects;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/projects")
@RestController
public class ProjectController {

    private final ProjectRepository repository;
    
    public ProjectController(ProjectRepository projectRepository) {
        this.repository = Objects.requireNonNull(projectRepository);
    }

    @PostMapping
    public Project create(@RequestBody Project object) {
        return repository.save(object);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping
    public Page<Project> findAll(Pageable p) {
        return repository.findAll(p);
    }

    @GetMapping("{id}")
    public Project findByKey(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException(id));
    }

    @PutMapping("{id}")
    public Project replace(@RequestBody Project object, @PathVariable Long id) {
        return repository.findById(id)
                .map(project -> {
                    project.setCommentary(object.getCommentary());
                    project.setDescription(object.getDescription());
                    project.setName(object.getName());
                    return repository.save(project);
                })
                .orElseGet(() -> {
                    return repository.save(object);
                });
    }
    
    
    
    
}
