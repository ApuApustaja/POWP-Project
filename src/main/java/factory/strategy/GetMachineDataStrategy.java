package factory.strategy;

import factory.entities.components.EntityComponent;
import factory.entities.components.LineComponent;
import factory.entities.components.MachineComponent;
import factory.entities.factories.Entity;
import factory.entities.manager.EntityManager;

import java.util.ArrayList;
import java.util.List;

public class GetMachineDataStrategy implements GetStrategy {
  @Override
  public List<EntityComponent> getById(long id) {
    List<EntityComponent> resultList = new ArrayList<>();
    for (EntityComponent entityComponent: EntityManager.getInstance().getEntitiesComponent(LineComponent.class)){
      if (((LineComponent)entityComponent).getId() == id){
        for(Entity entity:((LineComponent) entityComponent).getMachines()){
          resultList.add(entity.getComponent(MachineComponent.class));
        }
      }
    }
    return resultList;
  }

  @Override
  public List<EntityComponent> get() {
    return EntityManager.getInstance().getEntitiesComponent(MachineComponent.class);
  }
}
