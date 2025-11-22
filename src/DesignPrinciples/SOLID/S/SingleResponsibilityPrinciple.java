package DesignPrinciples.SOLID.S;

public class SingleResponsibilityPrinciple {
    /*a module should be responsible to one,
    and only one, actor.
     */

    /*bag example: a User class that handles both user properties
    and database logic
     */

    class UserBadExample {
        String name;
        String email;
        void saveUserToDatabase(){} //Reason to change #1
        void sendWelcomeEmail(){}//Reason to change #2
    }

    class User {
        String name;
        String email;
    }
    class UserRepository {
        void save(User user){} //Only handles database
    }
    class EmailService{
        void sendWelcome(){} //Only handles email
    }

}
