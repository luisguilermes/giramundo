open module  br.com.techipster.giramundo.app {
    requires br.com.techipster.giramundo.core;
    requires br.com.techipster.giramundo.adapter.mysql;
    requires br.com.techipster.giramundo.adapter.restv1;

    requires java.sql;
    requires java.instrument;
    requires java.validation;
    requires javax.inject;

    requires slf4j.api;

    requires org.hibernate.validator;

    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
}