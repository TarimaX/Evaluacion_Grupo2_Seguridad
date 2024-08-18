package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootTest
class UserDetailsServiceTest {

    @Autowired
    private UserDetailsService userDetailsService;

    @Test
    public void testLoadUserByUsername() {
        UserDetails userDetails = userDetailsService.loadUserByUsername("juan");

        assertThat(userDetails).isNotNull();
        assertThat(userDetails.getUsername()).isEqualTo("juan");
        assertThat(userDetails.getPassword()).isEqualTo("{noop}12345");
    }
}
