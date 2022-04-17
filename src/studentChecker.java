// Program prints students stored in array.

public class studentChecker {
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

        public static void main(String[] args) {

            studentChecker Dawid = new studentChecker();
            Dawid.name = "Dawid";
            Dawid.surname = "Podsiadly";
            Dawid.nick = "Dawson";
            Dawid.index = "123456";
            Dawid.email = "test1@gmail.com";

            studentChecker Ania = new studentChecker();
            Ania.name = "Ania";
            Ania.surname = "Kowalska";
            Ania.nick = "AniaK";
            Ania.index = "123457";
            Ania.email = "test2@gmail.com";

            studentChecker Zosia = new studentChecker();
            Zosia.name = "Zosia";
            Zosia.surname = "Kowalska";
            Zosia.nick = "ZosiaK";
            Zosia.index = "123458";
            Zosia.email = "test3@gmail.com";

            studentChecker[] students = new studentChecker[3];

            students[0] = Dawid;
            students[1] = Ania;
            students[2] = Zosia;

            for (int i = 0; i < 3; i++) {
                students[i].introduce();
                students[i].logIn();
                students[i].indexNumber();
                students[i].getEmail();
                System.out.println("\n");
            }
    }
}
