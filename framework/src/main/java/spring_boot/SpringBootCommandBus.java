package spring_boot;

import core.application.ICommand;
import core.application.ICommandBus;
import core.application.ICommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

@Component
public class SpringBootCommandBus implements ICommandBus {
    private final ApplicationContext ctx;

    @Autowired
    public SpringBootCommandBus(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public <T extends ICommand> void dispatch(T command, Class<T> clazz) {
        ResolvableType resolvableType =
                ResolvableType.forClassWithGenerics(ICommandHandler.class, clazz);

        String[] beans = ctx.getBeanNamesForType(resolvableType);

        for (String bean : beans) {
            ICommandHandler<T> handler = (ICommandHandler<T>) ctx.getBean(bean);
            handler.handle(command).join();
        }
    }
}
