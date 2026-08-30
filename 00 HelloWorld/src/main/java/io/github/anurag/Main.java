package io.github.anurag;
// this is a package name a unique identifier

public class Main {
// this is main class everything in java is class
// class name will alway match the class file name 
// example - 
// Sum.java class file name will have class name - public class Sum

    public static void main(String[] args){
//        this is main method (or function in other languages) every java program execute the main method
        String greeting = "Hello World!";
//        string in java is not a primitve data type but a class
        System.out.println(greeting);

//        print start for each character underneath
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("*");
        }
    }
}