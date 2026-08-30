package io.github.anurag;
// this is a package if you enable package then your program should contain the package name

public class Main {
//    this is main class everything in java is class

    public static void main(String[] args){
//        this is main method or function every java program execute the main method
        String greeting = "Hello World!";
//        string in java is not a data type but a class
        System.out.println(greeting);

//        print start for each character underneath
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("*");
        }
    }
}