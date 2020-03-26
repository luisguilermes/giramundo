open module  br.com.techipster.giramundo.core {
	requires static lombok;
	
	requires javax.inject;
    requires java.validation;
    
    exports br.com.techipster.giramundo.core.domain;
    exports br.com.techipster.giramundo.core.persistence;
}