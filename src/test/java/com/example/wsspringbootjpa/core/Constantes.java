package com.example.wsspringbootjpa.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String APP_BASE_URL_USER = "http://localhost";
    Integer APP_PORT = 8080;
    String APP_BASE_PATH = "";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIMEOUT = 5000L;

}
