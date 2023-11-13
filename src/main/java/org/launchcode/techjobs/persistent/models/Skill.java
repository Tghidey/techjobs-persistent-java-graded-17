package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Description cannot be null")
    @Size(min = 3, max = 500, message = "Description must be between 3 and 500 characters")
    private String description;

    // Default constructor
    public Skill() {}

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}