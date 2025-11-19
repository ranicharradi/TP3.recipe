package com.fsb.soap;

import javax.xml.ws.Endpoint;

public class ServerPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/recipes";
        System.out.println("Server started at: " + url);
        Endpoint.publish(url, new RecipeServiceImpl());
    }
}