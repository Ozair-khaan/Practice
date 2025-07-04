package com.j8;

import java.util.function.Function;

interface Messageable{
    Message getMessage(String msg);
}

class Message{
    Message(String msg)
    {
        System.out.println(msg);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable msg = Message::new;
        msg.getMessage("Hello! Ozair.");
    }
}
