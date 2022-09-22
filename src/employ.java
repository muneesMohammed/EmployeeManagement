import java.util.ArrayList;

import java.util.Scanner;

public class employ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> empl = new ArrayList<String>();

        while (true){

            System.out.println("1 - Add an employee");

            System.out.println("2 - Search an employee");

            System.out.println("3 - Remove an employee");

            System.out.println("4 - View all employees");

            System.out.println("5 - Exit");

            System.out.println("Please select an option :");

            int option = sc.nextInt();

            switch (option){

                default:

                    System.out.println("Invalid Option");

                case 1:

                    System.out.println("Enter the name of the employee");

                    String name = sc.next();

                    empl.add(name);

                    break;

                case 2:

                    System.out.println("Enter the name to be searched:");

                    String nam= sc.next();

                    boolean res = empl.contains(nam);

                    if (res){

                        System.out.println("Employee found.");

                    }

                    else {

                        System.out.println("Employee not found.");

                    }

                case 3:

                    System.out.println("Enter the employee to be removed:");

                    String rm = sc.next();

                    empl.remove(rm);

                    System.out.println("Employee removed successfully");

                case 4:

                    System.out.println(empl);

                    break;

                case 5:

                    System.out.println("Exiting!!!!");

                    break;

            }

        }

    }

}