package com.springsecurity.project.service;

import com.springsecurity.project.dao.JwtAuthenticationResponse;
import com.springsecurity.project.dao.request.Signin;
import com.springsecurity.project.dao.request.Signup;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(Signup request);
    JwtAuthenticationResponse signin(Signin request);
}
