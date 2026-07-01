package co.simplon.demo_fullstack_2026.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.simplon.demo_fullstack_2026.entities.DemoEntity;
import co.simplon.demo_fullstack_2026.repositories.DemoRepository;


@Component
public class DataInitializer implements CommandLineRunner {

    private DemoRepository demoRepository;

    public DataInitializer(DemoRepository demoRepositoryInjected) {
        this.demoRepository = demoRepositoryInjected;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.demoRepository.count() == 0) {
            this.demoRepository.save(new DemoEntity("This is the first element", true));
            this.demoRepository.save(new DemoEntity("Another stuff", false));
        }
    }

}
