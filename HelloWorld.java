import java.util.Scanner;

import util.*;

public class HelloWorld {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name: ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
