package Singleton;

public class Client {
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfigImpl.getInstance();

        appConfig1.setConfig("1","1");
        appConfig1.getConfig("1");

        AppConfig appConfig2 = AppConfigImpl.getInstance();
        appConfig2.getConfig("1");
       appConfig2.getConfig("aaa");


    }
}
