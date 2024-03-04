package com.springsecurity.project.member;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface MemberService {
    UserDetailsService userDetailsService();
}
