package core.application;

import java.util.concurrent.CompletableFuture;

public interface ICommandHandler<T extends ICommand> {
  CompletableFuture<Object> handle(T command);
}
