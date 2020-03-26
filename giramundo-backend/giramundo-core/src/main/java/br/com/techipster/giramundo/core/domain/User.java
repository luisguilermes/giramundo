package br.com.techipster.giramundo.core.domain;

import lombok.Data;

@Data
public final class User {
	private Long id;
	private String name;
	private String email;
}
