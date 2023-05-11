package JavaOOP.common;

public class BaseTest {

    public void createDriver(){
        Constants ct=new Constants("Chrome",true,true);
        System.out.println(ct.getBrowser());
        System.out.println(ct.getReport());
        System.out.println(ct.getHeadless());

    }

    public void closeDriver(String browser){
        System.out.println("Closed browser: " + browser);
    }




}
