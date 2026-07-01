package co.simplon.demo_fullstack_2026.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.demo_fullstack_2026.entities.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, UUID> {

}
