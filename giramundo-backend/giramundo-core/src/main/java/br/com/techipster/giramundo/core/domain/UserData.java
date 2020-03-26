package br.com.techipster.giramundo.core.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UserData {
	@NotBlank
	private final String id;
	@NotBlank
	private final String name;
}
