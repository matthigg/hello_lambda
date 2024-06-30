package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public String handleRequest(String name) {
        return "Hello, " + name + ", from AWS Lambda!";
    }
}
