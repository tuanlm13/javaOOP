package JavaOOP.common;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;


    public Constants(String browser, boolean report, boolean headless) {
        this.browser = browser;
        this.report = report;
        this.headless = headless;
    }

    public static String getBrowser() {
        return browser;
    }

    public static boolean getReport() {
        return report;
    }

    public static boolean getHeadless() {
        return headless;
    }
}
