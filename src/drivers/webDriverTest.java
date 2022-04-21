package drivers;

public class webDriverTest {
    public static void main(String[] args) {

        chromeDriver chrome = new chromeDriver();
        chrome.get();
        chrome.findElementBy();;

        System.out.println("\n");

        firefoxDriver firefox = new firefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }

}
