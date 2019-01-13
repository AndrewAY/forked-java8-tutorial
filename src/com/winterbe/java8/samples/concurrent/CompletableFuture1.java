package com.winterbe.java8.samples.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author Benjamin Winterberg
 updated comment
 */
public class CompletableFuture1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();

        future.complete("42");

        future
                .thenAccept(System.out::println)
                .thenAccept(v -> System.out.println("done"));

    }

    
    public String process() {
    	return "Hey dude, where's my car?";
    }

 
 //a 3rd comment


}
