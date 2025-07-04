package com.j8;

interface MethodFactory {

    default void aapKuchKahiye() {
        System.out.println("Ae Bhutkun, 2 cup chai lagao! kadak..");
    }

    void aapKuchMtKahiye();

    static void utilityMeth(String msg) {
        System.out.println(msg);
    }
}

public class DefautMeth implements MethodFactory {
    @Override
    public void aapKuchMtKahiye() {
        System.out.println("Now you can say anything..");
    }

    public static void main(String[] args) {
        DefautMeth defautMeth = new DefautMeth();
        defautMeth.aapKuchKahiye();    //calling default
        defautMeth.aapKuchMtKahiye();   //abstract
        MethodFactory.utilityMeth("Hello! Ozair");
    }
}
