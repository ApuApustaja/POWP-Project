package factory.command;

import factory.entities.components.EntityComponent;

import java.util.List;

public interface IGetCommand {
  public List<EntityComponent> execute();
}
