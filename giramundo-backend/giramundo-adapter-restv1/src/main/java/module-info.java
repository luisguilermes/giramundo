open module br.com.techipster.giramundo.adapter.restv1 {
    requires static lombok;
    requires java.validation;
    
    requires transitive br.com.techipster.giramundo.core;
    
    requires spring.web;
    requires spring.webmvc;
}
