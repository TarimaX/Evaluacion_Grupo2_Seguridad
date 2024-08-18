package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.KeyPair;

import com.example.auth.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RsaKeyGenerationTest {

    @Autowired
    private SecurityConfig securityConfig;

    @Test
    public void testGenerateRsaKey() {
        KeyPair keyPair = securityConfig.generateRsaKey();

        assertThat(keyPair).isNotNull();
        assertThat(keyPair.getPublic()).isNotNull();
        assertThat(keyPair.getPrivate()).isNotNull();
    }
}

