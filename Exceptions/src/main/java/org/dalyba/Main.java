package org.dalyba;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        InputManger inputManger = new InputManger();
        IntDevider intDevider = new IntDevider();

        String[] skaiciai = inputManger.askForInp();

        try {
            int rezultatas = intDevider.divide(skaiciai);
            System.out.println(skaiciai[0] + " / " + skaiciai[1] + " = "+ rezultatas);
        } catch (ArgZerroException e) {
            System.out.println(e);
            System.out.println("Dalyba is nulio negalima!");
        }

        // System.out.println(Arrays.toString(inputManger.askForInp()));

    }

}