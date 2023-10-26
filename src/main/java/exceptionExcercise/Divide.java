package exceptionExcercise;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        //3. Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan dem (dvs. utför division mellan de två talen)
        //4. Fånga felen och skriv ut ett felmeddelande
        //5. Uppdatera så att meddelandet i Exception e även kommer med
        //6. Uppdatera programmet så att det fångar olika fel beroende på vilket felmeddelande man får
        //7. Uppdatera programmet så att inläsning upprepas till dess att man har korrekta värden
        //8. Uppdatera programmet så att man enbart behöver läsa in det värde som inte är korrekt (om enbart ett av dem är inkorrekt)
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers and I will provide the division of them");
        int first = 0;
        boolean incorrectNumbers1 = true;
        while (incorrectNumbers1) {
            try {
                first = Integer.parseInt(scan.nextLine());
                incorrectNumbers1 = false;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        boolean incorrectNumbers2 = true;
        while (incorrectNumbers2) {
            try {
                int second = Integer.parseInt(scan.nextLine());
                System.out.println(first / second);
                incorrectNumbers2 = false;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }


    }
}
