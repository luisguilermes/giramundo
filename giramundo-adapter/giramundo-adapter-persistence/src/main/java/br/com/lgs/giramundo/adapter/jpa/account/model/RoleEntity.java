package br.com.lgs.giramundo.adapter.jpa.account.model;


import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
