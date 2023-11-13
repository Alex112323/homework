package edu.hw5;

public class Task8 {

    public boolean checkNumber1(String string) {
        return string.matches("[0|1]([0|1]{2})*");
    }

    public boolean checkNumber2(String string) {
        return string.matches("(0([0|1]{2})*)|(1[0|1]([1|0]{2}))");
    }

    public boolean checkNumber3(String string) {
        return string.matches("1*((01*){3})");
    }

    public boolean checkNumber5(String string) {
        return string.matches("01([01]1)*|([0|1]1)*[0|1]");
    }




}
