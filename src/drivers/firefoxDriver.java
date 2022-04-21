package drivers;

public class firefoxDriver implements webDriver{
    @Override
    public void get() {
        System.out.println("Firefox has been opened");
    }

    @Override
    public void findElementBy() {
        System.out.println("Element has been found by Firefox");
    }
}
