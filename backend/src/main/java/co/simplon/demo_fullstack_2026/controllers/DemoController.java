package co.simplon.demo_fullstack_2026.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.demo_fullstack_2026.entities.DemoEntity;
import co.simplon.demo_fullstack_2026.repositories.DemoRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepositoryInjected) {
        this.demoRepository = demoRepositoryInjected;
    }

    @GetMapping("")
    public List<DemoEntity> getAllDemoItems() {
        return this.demoRepository.findAll();
    }
    
}
