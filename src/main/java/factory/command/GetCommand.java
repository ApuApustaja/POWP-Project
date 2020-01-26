package factory.command;

import factory.entities.components.EntityComponent;
import factory.strategy.GetStrategy;

import java.util.List;

public class GetCommand implements IGetCommand {
  GetStrategy strategy;
  Long idForSelect;

  public GetCommand(GetStrategy strategy, Long idForSelect) {
    this.strategy = strategy;
    this.idForSelect = idForSelect;
  }

  public GetCommand(GetStrategy strategy) {
    this.strategy = strategy;
  }

  @Override
  public List<EntityComponent> execute() {
    if (idForSelect == null) return strategy.get();
    return strategy.getById(idForSelect);
  }
}
