package factory.entities.factories;

import factory.entities.factories.builder.BuilderStep;

public interface EntityFactory {
  public Entity create(String name, long id);
}
