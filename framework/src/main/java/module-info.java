module loan.management.framework {
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    exports core.application;
    exports core.specification;
    exports model.aggregate;
    exports model.entity;
    exports model.event;
    exports model.value_object;
    exports spring_boot;
}
