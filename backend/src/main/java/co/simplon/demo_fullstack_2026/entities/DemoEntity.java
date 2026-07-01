package co.simplon.demo_fullstack_2026.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "demo")
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String content;

    @Column(name = "is_active")
    private Boolean isActive;

    public DemoEntity() {

    }

    public DemoEntity(String content, Boolean isActive) {
        this.content = content;
        this.isActive = isActive;
    }

    public UUID getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setId(UUID newId) {
        this.id = newId;
    }

    public void setContent(String newContent) {
        this.content = newContent;
    }

    public void setIsActive(Boolean newActive) {
        this.isActive = newActive;
    }
}
