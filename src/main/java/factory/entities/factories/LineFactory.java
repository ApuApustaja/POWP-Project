package factory.entities.factories;

import factory.entities.components.FactoryComponent;
import factory.entities.components.LineComponent;
import factory.entities.factories.builder.EntityBuilder;

public class LineFactory implements EntityFactory {
  @Override
  public Entity create(String name, long id) {
    Entity newLine = EntityBuilder.builder()
            .addComponent(new LineComponent(name, id))
            .build();
    return newLine;
  }
}
