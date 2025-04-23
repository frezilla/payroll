package eu.frezilla.payroll.repositories;

import eu.frezilla.payroll.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
