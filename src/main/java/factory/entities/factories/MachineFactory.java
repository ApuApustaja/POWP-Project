package factory.entities.factories;

import factory.entities.components.MachineComponent;
import factory.entities.factories.builder.EntityBuilder;

public class MachineFactory implements EntityFactory {
  @Override
  public Entity create(String name, long id) {
    Entity newMachine = EntityBuilder.builder()
            .addComponent(new MachineComponent(name, id))
            .build();
    return newMachine;
  }
}
