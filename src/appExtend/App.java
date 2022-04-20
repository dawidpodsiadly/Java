package appExtend;

public class App {
    public String name;

    public App(String name){
        this.name = name;
    }
    public void appInfo(){
        System.out.println("Running app named " + name);
    }
}
