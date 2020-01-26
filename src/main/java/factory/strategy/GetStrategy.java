package factory.strategy;

import factory.entities.components.EntityComponent;

import java.util.List;

public interface GetStrategy {
  public List<EntityComponent> getById(long id);
  public List<EntityComponent> get();
}
