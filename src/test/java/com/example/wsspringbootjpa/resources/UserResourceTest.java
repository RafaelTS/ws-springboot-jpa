package com.example.wsspringbootjpa.resources;

import com.example.wsspringbootjpa.config.TestConfig;
import com.example.wsspringbootjpa.core.BaseTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.restassured.*;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;
import sun.net.www.protocol.http.AuthenticationInfo;

@Testcontainers
public class UserResourceTest extends BaseTest {

//    private TestConfig underTest;
//
//    @Container
//    public GenericContainer postgres = new GenericContainer(DockerImageName.parse("postgres:14.2-alpine"))
//            .withExposedPorts(6379);
//
//    @BeforeEach
//    public void setUp() {
//        String address = redis.getHost();
//        Integer port = redis.getPort();
//
//        // Now we have an address and port for Redis, no matter where it is running
//        underTest = new TestConfig(address, port);
//    }


    @Test
    public void ShouldNameEquals() {

        RestAssured.given()
                .when()
                    .get("/users")
                .then()
                    .statusCode(200);
    }

}
