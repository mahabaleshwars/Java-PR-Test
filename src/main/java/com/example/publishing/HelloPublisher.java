package com.example.publishing;

public class HelloPublisher {
    public String getMessage() {
        return "Hello from Java Publisher!";
    }
    
    public static void main(String[] args) {
        System.out.println(new HelloPublisher().getMessage());
        System.out.println("Current Date and Time (UTC - YYYY-MM-DD HH:MM:SS formatted): 2025-07-18 10:49:19");
        System.out.println("Current User's Login: mahabaleshwars");
    }
}
