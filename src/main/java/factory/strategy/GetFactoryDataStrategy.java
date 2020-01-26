package factory.strategy;

import factory.entities.components.EntityComponent;
import factory.entities.components.FactoryComponent;
import factory.entities.manager.EntityManager;

import java.util.ArrayList;
import java.util.List;

public class GetFactoryDataStrategy implements GetStrategy {
  @Override
  public List<EntityComponent> getById(long id) {
    List<EntityComponent> resultSet = new ArrayList<>();
    List<EntityComponent> factories = EntityManager.getInstance().getEntitiesComponent(FactoryComponent.class);
    for(EntityComponent entityComponent:factories){
      if(((FactoryComponent)entityComponent).getId() == id) {
        resultSet.add(entityComponent);
        return resultSet;
      }
    }
    return resultSet;
  }

  @Override
  public List<EntityComponent> get() {
    return EntityManager.getInstance().getEntitiesComponent(FactoryComponent.class);
  }
}
