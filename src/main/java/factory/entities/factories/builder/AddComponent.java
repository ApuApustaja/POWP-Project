package factory.entities.factories.builder;

import factory.entities.components.EntityComponent;
import factory.entities.factories.Entity;

public interface AddComponent extends BuilderStep {
  AddComponent addComponent(EntityComponent component);
  Entity build();
}
