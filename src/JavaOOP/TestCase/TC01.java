package JavaOOP.TestCase;

import JavaOOP.common.BaseTest;

public class TC01 {
    public static void main(String[] args) {
        BaseTest bt=new BaseTest();
        bt.createDriver();
        System.out.println("TC01 is starting");
        System.out.println("TC01 processing");
        System.out.println("\tStep 1");
        System.out.println("\tStep 2");
        System.out.println("\tStep 3");
        System.out.println("\tStep 4");
        System.out.println("\tStep 5");
        System.out.println("TC01 is ending");
        System.out.println("generating report");

        bt.closeDriver("Chrome");
    }


}
