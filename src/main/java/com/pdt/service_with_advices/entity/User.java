package com.pdt.service_with_advices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USR_ID")
    private Long id;
    @NotEmpty
    @Size(max = 50, message = "Name can have up to 50 signs")
    @Column(name = "USR_NAME")
    private String username;
    @NotEmpty
    @Column(name = "USR_EMAIL")
    private String email;
    @NotEmpty
    @Column(name = "USR_PASSWORD")
    private String password;
}
