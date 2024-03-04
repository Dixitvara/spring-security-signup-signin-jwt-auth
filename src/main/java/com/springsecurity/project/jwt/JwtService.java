package com.springsecurity.project.jwt;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractEmail(String token);
    String generateToken(UserDetails userDetails);
    boolean isValidToken(String token, UserDetails userDetails);

}
