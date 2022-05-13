package com.example.wsspringbootjpa.resources;

import com.example.wsspringbootjpa.core.BaseTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import io.restassured.*;

public class UserResourceTest extends BaseTest {

    @Test
    public void ShouldNameEquals() {

        RestAssured.given()
                .when()
                    .get("/users")
                .then()
                    .statusCode(200);
    }

}
