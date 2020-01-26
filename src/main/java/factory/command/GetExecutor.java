package factory.command;

import factory.entities.components.EntityComponent;

import java.util.ArrayList;
import java.util.List;

public class GetExecutor {
  private IGetCommand command;
  private final List<IGetCommand> commands = new ArrayList<>();
  public void setCommand(IGetCommand command){
    this.command = command;
  }
  public List<EntityComponent> executeGet(){
    commands.add(command);
    return command.execute();
  }
}
