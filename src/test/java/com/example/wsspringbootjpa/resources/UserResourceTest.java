package com.example.wsspringbootjpa.resources;

import com.example.wsspringbootjpa.entities.User;
import com.example.wsspringbootjpa.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class UserResourceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserResource resource;

    @BeforeEach
    public void setup() {
       MockitoAnnotations.openMocks(this);

    }

    //informar via restassured
    @Test
    public void shouldSaveUserWithSucess() {

        User user = new User();

        user.setName("Rafael");
        user.setEmail("eu@eu.com");
        user.setPassword("234");
        user.setPhone("5151515");
        resource.insert(user);
        Mockito.verify(repository).save(user);

    }

    @Test
    public void shouldNameEquals() {
        User user = new User(3L, "Rafael", "e@email.com", "2039022", "234");

        Assertions.assertEquals("Rafael", user.getName());
    }
}
