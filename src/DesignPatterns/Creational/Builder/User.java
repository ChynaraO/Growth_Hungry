package DesignPatterns.Creational.Builder;

//Builds complex objects step by step.
/*
Builder is a creational design pattern that lets you construct
complex objects step by step.
The pattern allows you to produce different types
and representations of an object using the same construction code.
 */

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // Not prefereble, it will force to provide all info even it is not required
    //Some fields are optional
//    public User(String firstName, String lastName, int age, String email){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.email = email;
//    }
    //Private constructor (only Builder can call it)
    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
    }
    //Static Builder class
    public static class Builder{
        private String firstName;
        private String lastName;
        private  int age;
        private String email;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        //Final step
        public User build(){
            return new User(this);
        }
    }
    public String toString(){
        return firstName + " " + lastName + ", " + age + " (" + email + ")";
    }
}
