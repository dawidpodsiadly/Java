package studentChecker;

public class studentChecker {
    public static void main(String[] args) {

        Student Dawid = new Student();
        Dawid.name = "Dawid";
        Dawid.surname = "Podsiadly";
        Dawid.nick = "Dawson";
        Dawid.index = "123456";
        Dawid.email = "test1@gmail.com";

        Student Ania = new Student();
        Ania.name = "Ania";
        Ania.surname = "Kowalska";
        Ania.nick = "AniaK";
        Ania.index = "123457";
        Ania.email = "test2@gmail.com";

        Student Zosia = new Student();
        Zosia.name = "Zosia";
        Zosia.surname = "Kowalska";
        Zosia.nick = "ZosiaK";
        Zosia.index = "123458";
        Zosia.email = "test3@gmail.com";

        Student[] students = new Student[3];

        students[0] = Dawid;
        students[1] = Ania;
        students[2] = Zosia;

        for(int i = 0; i < 3; i++) {
            students[i].introduce();
            students[i].logIn();
            students[i].indexNumber();
            students[i].getEmail();
            System.out.println("\n");
        }
    }
}
