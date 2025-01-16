package com.j8;

import java.util.Base64;

public class Base64BasicEncryptionExample {
    public static void main(String[] args) {
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        String name=urlEncoder.encodeToString("OzairKhan".getBytes());
        System.out.println("Encoded : "+name);

        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        String decodeStr = new String(urlDecoder.decode(name));
        System.out.println("Decoded : "+decodeStr);

       // MIME Encoding and Decoding
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, \nYou are informed regarding your inconsistency of work";

        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: "+eStr);

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded message: "+dStr);
    }
}
