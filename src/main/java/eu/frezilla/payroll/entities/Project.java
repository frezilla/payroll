package eu.frezilla.payroll.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Project {
    
    @Id @GeneratedValue private Long id;
    
    private String commentary;
    
    private String description;
    
    private String name;
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (this == o) return true;
    
        if (!(o instanceof Project)) return false;
        
        Project project = (Project) o;
        return Objects.equals(this.id, project.id) 
                && Objects.equals(this.commentary, project.commentary)
                && Objects.equals(this.name, project.name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.commentary, this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
