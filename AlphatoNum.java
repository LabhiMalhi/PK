package com.Malhi;

import java.util.Locale;
import java.util.Scanner;

public class AlphatoNum {
    public static void main(String[] args) {
        System.out.print("Enter a number in words --> ");
        Scanner pp = new Scanner(System.in);
        String s = pp.next().toLowerCase(Locale.ROOT);

        long a = 0;
        //switch case from 1 to 100
        switch(s)
        {
            case "one" : a = 1;
                break;
            case "two" : a = 2;
                break;
            case "three" : a = 3;
                break;
            case "four" : a = 4;
                break;
            case "five" : a = 5;
                break;
            case "six" : a = 6;
                break;
            case "seven" : a = 7;
                break;
            case "eight" : a = 8;
                break;
            case "nine" : a = 9;
                break;
            case "ten" : a = 10;
                break;
            case "eleven" : a = 11;
                break;
            case "twelve" : a = 12;
                break;
            case "thirteen" : a = 13;
                break;
            case "fourteen" : a = 14;
                break;
            case "fifteen" : a = 15;
                break;
            case "sixteen" : a = 16;
                break;
            case "seventeen" : a = 17;
                break;
            case "eighteen" : a = 18;
                break;
            case "ninteen" : a = 19;
                break;
            case "twenty" : a = 20;
                break;
            case "twentyone" : a = 21;
                break;
            case "twentytwo" : a = 22;
                break;
            case "twentythree" : a = 23;
                break;
            case "twentyfour" : a = 24;
                break;
            case "twentyfive" : a = 25;
                break;
            case "twentysix" : a = 26;
                break;
            case "twentyseven" : a = 27;
                break;
            case "twentyeight" : a = 28;
                break;
            case "twentynine" : a = 29;
                break;
            case "thirty" : a = 30;
                break;
            case "thirtyone" : a = 31;
                break;
            case "thirtytwo" : a = 32;
                break;
            case "thirtythree" : a = 33;
                break;
            case "thirtyfour" : a = 34;
                break;
            case "thirtyfive" : a = 35;
                break;
            case "thirtysix" : a = 36;
                break;
            case "thirtyseven" : a = 37;
                break;
            case "thirtyeight" : a = 38;
                break;
            case "thirtynine" : a = 39;
                break;
            case "fourty" : a = 40;
                break;
            case "fourtyone" : a = 41;
                break;
            case "fourtytwo" : a = 42;
                break;
            case "fourtythree" : a = 43;
                break;
            case "fourtyfour" : a = 44;
                break;
            case "fourtyfive" : a = 45;
                break;
            case "fourtysix" : a = 46;
                break;
            case "fourtyseven" : a = 47;
                break;
            case "fourtyeight" : a = 48;
                break;
            case "fourtynine" : a = 49;
                break;
            case "fifty" : a = 50;
                break;
            case "fiftyone" : a = 51;
                break;
            case "fiftytwo" : a = 52;
                break;
            case "fiftythree" : a = 53;
                break;
            case "fiftyfour" : a = 54;
                break;
            case "fiftyfive" : a = 55;
                break;
            case "fiftysix" : a = 56;
                break;
            case "fiftyseven" : a = 57;
                break;
            case "fiftyeight" : a = 58;
                break;
            case "fiftynine" : a = 59;
                break;
            case "sixty" : a = 60;
                break;
            case "sixtyone" : a = 61;
                break;
            case "sixtytwo" : a = 62;
                break;
            case "sixtythree" : a = 63;
                break;
            case "sixtyfour" : a = 64;
                break;
            case "sixtyfive" : a = 65;
                break;
            case "sixtysix" : a = 66;
                break;
            case "sixtyseven" : a = 67;
                break;
            case "sixtyeight" : a = 68;
                break;
            case "sixtynine" : a = 69;
                break;
            case "seventy" : a = 70;
                break;
            case "seventyone" : a = 71;
                break;
            case "seventytwo" : a = 72;
                break;
            case "seventythree" : a = 73;
                break;
            case "seventyfour" : a = 74;
                break;
            case "seventyfive" : a = 75;
                break;
            case "seventysix" : a = 76;
                break;
            case "seventyseven" : a = 77;
                break;
            case "seventyeight" : a = 78;
                break;
            case "seventynine" : a = 79;
                break;
            case "eighty" : a = 80;
                break;
            case "eightyone" : a = 81;
                break;
            case "eightytwo" : a = 82;
                break;
            case "eightythree" : a = 83;
                break;
            case "eightyfour" : a = 84;
                break;
            case "eightyfive" : a = 85;
                break;
            case "eightysix" : a = 86;
                break;
            case "eightyseven" : a = 87;
                break;
            case "eightyeight" : a = 88;
                break;
            case "eightynine" : a = 89;
                break;
            case "ninety" : a = 90;
                break;
            case "ninetyone" : a = 91;
                break;
            case "ninetytwo" : a = 92;
                break;
            case "ninetythree" : a = 93;
                break;
            case "ninetyfour" : a = 94;
                break;
            case "ninetyfive" : a = 95;
                break;
            case "ninetysix" : a = 96;
                break;
            case "ninetyseven" : a = 97;
                break;
            case "ninetyeight" : a = 98;
                break;
            case "ninetynine" : a = 99;
                break;
            case "hundred" : a = 100;
                break;

            default :   System.out.println("Invalid");
                break;
        }
        System.out.println("Number => " + a);

    }
}
