package com.springsecurity.project.dao.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Signup {
    private String name;
    private String email;
    private String password;
    private long mobile;
    private String wing;
    private String flat;
    private String role;
}
