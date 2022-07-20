package org.dalyba;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManger {

    public String[] askForInp(){

        int a = insertDigit(" Pirmo:");
        int b = insertDigit(" Antro");

        //String[] skaiciai = new String[]{String.valueOf(a), String.valueOf(b)};
        return new String[]{String.valueOf(a), String.valueOf(b)};

    }


    private int insertDigit (String parametras){

        Scanner scanner = new Scanner(System.in);

        int ivestasSk = 0;
        boolean arIvesSk;

        do {

            try {
                System.out.println("Ivesk"+ parametras +" sk. reiskme: ");
                ivestasSk = scanner.nextInt();
                arIvesSk = true;
            } catch (InputMismatchException e) {

                System.out.println("Ivyko Klaida, neteisinga reiksme!");
                scanner.nextLine();
                arIvesSk = false;
            } catch (Exception e) {
                System.out.println("Nezinoma klaida");
                arIvesSk = true;
            }

        }while (!arIvesSk);

return ivestasSk;

    }

}
