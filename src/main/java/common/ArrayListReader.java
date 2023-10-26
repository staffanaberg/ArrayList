package common;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReader {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name, and write stop to Stop");
        ArrayList<String> nameList = new ArrayList<>();

        String name = scan.nextLine();
        nameList.add(name);

        while (!name.equals("stop")) {
            name = scan.nextLine();
            nameList.add(name);
        }

        System.out.println("Enter a name to replace the first name with");

        nameList.set(0, scan.nextLine());

        String tempNameFirst = nameList.get(0);
        //nameList.size() = 11-2 = 3
        //1Petra -index:0
        //2Johanna -index:1
        //3Joanna-index:2
        //4Anna-index:3
        //5stop-index:4
        String tempNameLast = nameList.get(nameList.size()-2);
        nameList.set(0, tempNameLast);
        nameList.set(nameList.size()-2, tempNameFirst);

        for(int i=0;i<nameList.size()-1;i++) {
            System.out.println(nameList.get(i));
        }




    }

}
