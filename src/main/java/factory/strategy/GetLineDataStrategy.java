package factory.strategy;

import factory.entities.components.EntityComponent;
import factory.entities.components.FactoryComponent;
import factory.entities.components.LineComponent;
import factory.entities.factories.Entity;
import factory.entities.manager.EntityManager;

import java.util.ArrayList;
import java.util.List;

public class GetLineDataStrategy implements GetStrategy {
  @Override
  public List<EntityComponent> getById(long id) {
    List<EntityComponent> resultList = new ArrayList<>();
    for (EntityComponent entityComponent: EntityManager.getInstance().getEntitiesComponent(FactoryComponent.class)){
      if (((FactoryComponent)entityComponent).getId() == id){
        for(Entity entity:((FactoryComponent) entityComponent).getLines()){
          resultList.add(entity.getComponent(LineComponent.class));
        }
      }
    }
    return resultList;
  }

  @Override
  public List<EntityComponent> get() {
    return EntityManager.getInstance().getEntitiesComponent(LineComponent.class);
  }
}
