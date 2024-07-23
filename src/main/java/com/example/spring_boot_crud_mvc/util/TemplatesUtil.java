package com.example.spring_boot_crud_mvc.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class TemplatesUtil {

    public String getRolesStringFromAuthorities(Collection<? extends GrantedAuthority> authorities) {
        return authorities.stream().map(s -> s.getAuthority().replace("ROLE_", "")).collect(Collectors.joining(", "));
    }
}
