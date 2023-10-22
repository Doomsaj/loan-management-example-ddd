module loan.management.scoring {
    requires loan.management.framework;
    requires spring.context;
    requires lombok;
    requires spring.kafka;
    requires kafka.clients;
    requires spring.beans;
    requires javafaker;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    exports ir.doomsaj.loan_management.scoring.helpers.builders;
    exports ir.doomsaj.loan_management.scoring.helpers.directors;
    exports ir.doomsaj.loan_management.scoring.domain.model.rule;
    exports ir.doomsaj.loan_management.scoring.domain.model.rule.criterias;
    exports ir.doomsaj.loan_management.scoring.domain.model.rule.enums;
}
