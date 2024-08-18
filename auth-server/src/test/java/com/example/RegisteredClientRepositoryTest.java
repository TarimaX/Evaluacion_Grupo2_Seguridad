package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;

@SpringBootTest
public class RegisteredClientRepositoryTest {

    @Autowired
    private RegisteredClientRepository registeredClientRepository;

    @Test
    public void testRegisteredClient() {
        RegisteredClient client = registeredClientRepository.findByClientId("client-app");

        assertThat(client).isNotNull();
        assertThat(client.getClientId()).isEqualTo("client-app");
        assertThat(client.getClientSecret()).isEqualTo("{noop}12345");
    }
}

