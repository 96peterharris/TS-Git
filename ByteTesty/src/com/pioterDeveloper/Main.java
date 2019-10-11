package com.pioterDeveloper;

import java.nio.ByteBuffer;

public class Main {

    public static void main(String[] args) {
        Integer num = 64;


        byte[] bytes = ByteBuffer.allocate(32).putInt(num).array();

        byte[] bytes1 = Integer.toBinaryString(64).getBytes();

//        for(int i = 0; i < bytes1.length; i++){
//            System.out.write(i);
//        }

        byte[] bytes3 = ByteBuffer.allocate(4).putInt(7).array();

        String newBits = String.format("%32s", Integer.toBinaryString(12)).replace(' ', '0');
        System.out.println(newBits);

//        for (byte b : bytes1) {
//            System.out.format("|%020d|", b);
//        }
        //System.out.println(lefInteger.toBinaryString(64), 32, '0');



       // System.out.println( org.apache.commons.lang.StringUtils.leftPad(Integer.toBinaryString(25), 32, '0'));




        //String byteString = org.apache.commons.lang3.StringUtils.leftPad(Integer.toBinaryString(25), 32, '0');


       // String leadingZero = org.apache.commons.lang.StringUtils.leftPad("" +8, 7, "#");
        //System.out.println(bytes1);

        //String paddedString = org.apache.commons.lang3.StringUtils.leftPad("129018", 10, "0");
       // System.out.println(paddedString);


    }




}
