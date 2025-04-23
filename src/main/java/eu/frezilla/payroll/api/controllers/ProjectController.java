package eu.frezilla.payroll.api.controllers;

import eu.frezilla.payroll.entities.Project;
import eu.frezilla.payroll.repositories.ProjectRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/projects")
@RestController
public class ProjectController implements ApiController<Project, Long> {

    private final ProjectRepository repository;
    
    public ProjectController(ProjectRepository projectRepository) {
        this.repository = Objects.requireNonNull(projectRepository);
    }

    @Override
    @PostMapping
    public Project create(@RequestBody Project object) {
        return repository.save(object);
    }

    @Override
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Project> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Project findByKey(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Project replace(Project object, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
