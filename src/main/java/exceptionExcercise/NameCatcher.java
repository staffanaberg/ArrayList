package exceptionExcercise;

import java.util.Scanner;

public class NameCatcher {

    public static void main(String[] args) {

        //Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};
        //

        //1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen. Fånga eventuella exceptions
        //Uppdatera ditt program så att det fångar exceptions vid olika tillfällen (inläsning av tal respektive utskrift av namn)
        System.out.println("Please enter a number from 1 to 3 to receive either Ada, Beda or Cålle");
        Scanner scan = new Scanner(System.in);

        String[] names = {"Ada", "Beda", "Cålle"};


        try {
            int number = Integer.parseInt(scan.nextLine());
            System.out.println(names[number - 1]);
        } catch (Exception e) {
            System.out.println("Something else went wrong!");
        }

    }
}
