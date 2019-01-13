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

     //5th comment

     //ext impt comment
    	return "Hey my man";


    }

 
 //a 3rd comment
 
 
 //4th comment


}
