//Exercise how constructors work during inheritance
package appExtend;

public class appChecker {
    public static void main(String[] args) {
        androidApp android = new androidApp("Calculator");
        android.appInfo();
        android.runAdroidApp();
        System.out.println("\n");
        iosApp ios = new iosApp("Flappy bird");
        ios.appInfo();
        ios.runIphoneApp();
    }
}
