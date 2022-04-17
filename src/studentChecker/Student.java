package studentChecker;

public class Student {
    public String name;
    public String surname;
    public String nick;
    public String index;
    public String email;

    public void introduce() {
        System.out.println("My name is: " + name + " " + surname);
    }

    public void logIn() {
        System.out.println("Log in with your nick: " + nick);
    }

    public void indexNumber() {
        System.out.println("Number of index: " + index);
    }

    public void getEmail() {
        System.out.println("Your email is: " + email);
    }
}


