package factory.entities.factories;

import factory.entities.components.FactoryComponent;
import factory.entities.factories.builder.EntityBuilder;

public class FactoryFactory implements EntityFactory {

  public Entity create(String name, long id) {
    Entity newFactory = EntityBuilder.builder()
            .addComponent(new FactoryComponent(name, id))
            .build();
    return newFactory;
  }
}
