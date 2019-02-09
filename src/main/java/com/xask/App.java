package com.xask;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

import static spark.Spark.get;
import static spark.Spark.port;

public class App {

    final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {

        Gson gson = new Gson();

        log.info("Starting App");

        port(8080);
        get("/hello", "application/json", (req, res) -> {
            res.type("application/json");
            return  ImmutableMap.of("test", ImmutableList.of("1", "2", "3"));
        }, gson::toJson);
    }
}
