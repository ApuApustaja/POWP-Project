package factory.api;

import factory.api.cqrs.IEntityQueryService;
import factory.command.GetCommand;
import factory.command.GetExecutor;
import factory.entities.components.EntityComponent;
import factory.strategy.GetFactoryDataStrategy;
import factory.strategy.GetLineDataStrategy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factorylines")
public class FactoryQueryLinesApi implements IEntityQueryService {

  public FactoryQueryLinesApi() {
  }
  @CrossOrigin
  @GetMapping("/all")
  public List<EntityComponent> getAll() {
    GetExecutor commandExecutor = new GetExecutor();
    commandExecutor.setCommand(new GetCommand(new GetLineDataStrategy()));
    return commandExecutor.executeGet();

  }
  @CrossOrigin

  @GetMapping("/id")
  public List<EntityComponent> getById(@RequestParam long id) {
    GetExecutor commandExecutor = new GetExecutor();
    commandExecutor.setCommand(new GetCommand(new GetFactoryDataStrategy(), id));
    return commandExecutor.executeGet();
  }
}
