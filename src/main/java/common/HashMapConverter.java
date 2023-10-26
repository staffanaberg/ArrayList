package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapConverter {

    public static void main(String[] args) {

        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

        HashMap<Character, String> converter = new HashMap<>();

        for(int i=0;i<alfabet.length();i++) {
            converter.put(alfabet.charAt(i), String.valueOf(symbols.charAt(i)));
        }

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        for(int i=0;i<text.length();i++) {
            System.out.print(converter.get(text.charAt(i)));
        }


    }
}
