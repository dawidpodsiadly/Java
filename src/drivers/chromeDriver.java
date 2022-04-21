package drivers;

public class chromeDriver implements  webDriver{
    @Override
    public void get() {
        System.out.println("Chrome has been opened");
    }

    @Override
    public void findElementBy() {
        System.out.println("Element has been found by Chrome");
    }
}
