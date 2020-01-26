package factory.api;

import factory.api.cqrs.IEntityQueryService;
import factory.command.GetCommand;
import factory.command.GetExecutor;
import factory.entities.components.EntityComponent;
import factory.entities.components.LineComponent;
import factory.entities.components.MachineComponent;
import factory.entities.factories.Entity;
import factory.entities.manager.EntityManager;
import factory.strategy.GetFactoryDataStrategy;
import factory.strategy.GetLineDataStrategy;
import factory.strategy.GetMachineDataStrategy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/linemachines")
public class MachineQueryApi implements IEntityQueryService {

  public MachineQueryApi() {
  }
  @CrossOrigin

  @GetMapping("/all")
  public List<EntityComponent>getAll() {
    GetExecutor commandExecutor = new GetExecutor();
    commandExecutor.setCommand(new GetCommand(new GetMachineDataStrategy()));
    return commandExecutor.executeGet();

  }
  @CrossOrigin

  @GetMapping("/id")
  public List<EntityComponent> getById(@RequestParam long id){
    GetExecutor commandExecutor = new GetExecutor();
    commandExecutor.setCommand(new GetCommand(new GetFactoryDataStrategy(),id));
    return commandExecutor.executeGet();
  }
}