package org.dalyba;

public class IntDevider {

    public int divide (String[] skaiciai) throws ArgZerroException {
        int a = Integer.parseInt(skaiciai[0]);
        int b = Integer.parseInt(skaiciai[1]);

        if (a==0 || b==0) {throw new ArgZerroException();}
        return a / b;
    }


}
