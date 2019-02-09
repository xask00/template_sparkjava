package com.xask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

import static spark.Spark.get;
import static spark.Spark.port;

public class App {

    final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        port(8080);

        log.info("Starting App");
        get("/hello", (req, res) -> "Hello World");
    }
}
