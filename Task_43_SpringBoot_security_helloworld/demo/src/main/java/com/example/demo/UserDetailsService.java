package com.example.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

// Интерфейс для работы с деталями пользователя
public interface UserDetailsService {

    // Метод, который загружает пользователя по его имени
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

