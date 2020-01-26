package factory.api;

import factory.api.cqrs.IEntityQueryService;
import factory.command.GetCommand;
import factory.command.GetExecutor;
import factory.entities.components.EntityComponent;
import factory.strategy.GetFactoryDataStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/factory")
public class FactoryQueryApi implements IEntityQueryService {

  public FactoryQueryApi() {
  }

  @CrossOrigin
  @GetMapping("/all")
  public List<EntityComponent> getAll() {
    GetExecutor commandExecutor = new GetExecutor();
    commandExecutor.setCommand(new GetCommand(new GetFactoryDataStrategy()));
    return commandExecutor.executeGet();
  }

  @Override
  public List<EntityComponent> getById(long id) {
    return null;
  }

}
