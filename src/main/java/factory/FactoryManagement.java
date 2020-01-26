package factory;

import factory.entities.components.FactoryComponent;
import factory.entities.components.LineComponent;
import factory.entities.factories.Entity;
import factory.entities.factories.FactoryProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class FactoryManagement {

    public static void main(String[] args) {
        SpringApplication.run(FactoryManagement.class, args);
        mockData();
    }

    private static void mockData() {
        Entity factory = FactoryProvider.getFactory("Factory").create("Factory Lodz", 0);
        Entity line = FactoryProvider.getFactory("Line").create("Line 1", 0);
        Entity machine = FactoryProvider.getFactory("Machine").create("Machine 1", 0);
        ((LineComponent) line.getComponent(LineComponent.class)).addMachine(machine);
        ((FactoryComponent) factory.getComponent(FactoryComponent.class)).addLine(line);
    }
}