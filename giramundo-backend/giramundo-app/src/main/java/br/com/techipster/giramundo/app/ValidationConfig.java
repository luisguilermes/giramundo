package br.com.techipster.giramundo.app;


import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import br.com.techipster.giramundo.core.domain.Validated;

@Configuration
class ValidationConfig {
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor(
			@Value("${spring.aop.proxy-target-class:true}") final boolean proxyTargetClass, final Validator validator) {
		final MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
		processor.setProxyTargetClass(proxyTargetClass);
		processor.setValidator(validator);
		processor.setValidatedAnnotationType(Validated.class);
		return processor;
	}
}
