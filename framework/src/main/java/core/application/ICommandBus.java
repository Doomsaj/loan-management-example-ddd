package core.application;

public interface ICommandBus {
  <T extends ICommand> void dispatch(T command, Class<T> clazz);
}
