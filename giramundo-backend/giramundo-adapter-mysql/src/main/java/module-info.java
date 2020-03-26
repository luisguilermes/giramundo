open module br.com.techipster.giramundo.adapter.mysql {
	requires static lombok;
	requires javax.inject;

	requires transitive br.com.techipster.giramundo.core;

	requires spring.aop;
	requires spring.context;
	requires spring.data.commons;
	requires spring.data.jpa;
	requires spring.tx;

	exports br.com.techipster.giramundo.adapter.mysql;
}