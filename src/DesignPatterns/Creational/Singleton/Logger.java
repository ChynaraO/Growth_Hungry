package DesignPatterns.Creational.Singleton;

/*
This pattern is used for:

Database connection

Logger

Configuration reader

Caching

Thread pools
 */
//Goal: Ensure only one instance of a class exists in the entire application.
public class Logger {

    //Step 1: Create a private static instance (the ONLY instance)
    private static Logger instance;

    //Step 2: Make the constructor private so no one can instantiate the class
    private Logger(){}

    //Step 3: Provide a public method to get the only instance
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger(); //Lazy initialization
        }
        return instance;
    }

    //Example method
    public void log(String message){
        System.out.println("[LOG]: " + message);
    }

}


