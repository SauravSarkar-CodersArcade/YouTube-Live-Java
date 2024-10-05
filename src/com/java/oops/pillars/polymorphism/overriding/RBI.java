package com.java.oops.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 6.5;
    }
}
class SBI extends RBI{
    @Override
    double rateOfInterest() {
        return 6.1;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest() {
        return 6.9;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest() {
        return 6.4;
    }
}
class OverRiding {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        HDFC hdfc = new HDFC();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        System.out.println("The rate of interest of RBI: "+rbi.rateOfInterest() + "%");
        System.out.println("The rate of interest of SBI: "+sbi.rateOfInterest()+ "%");
        System.out.println("The rate of interest of ICICI: "+icici.rateOfInterest()+ "%");
        System.out.println("The rate of interest of HDFC: "+hdfc.rateOfInterest()+ "%");
    }
}