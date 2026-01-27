package com.j8;

interface DemoInterface {
    void say();
}

public class OnStaticMeth {
    public static void main(String[] args) {
        OnStaticMeth onStaticMeth = new OnStaticMeth();
        DemoInterface demo = onStaticMeth::saySomething;
        demo.say();

        //Referring non-static method using anonymous object
        DemoInterface demo1 = new OnStaticMeth()::saySomething;
        demo1.say();

    }

    public void saySomething() {
        System.out.println("Hello, I am non-static method");
    }

}
