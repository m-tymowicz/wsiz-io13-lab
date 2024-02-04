package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30));
        company.add(new Employee("Anna", "Nowak", (byte) 28));
        company.add(new Employee("Piotr", "Nowak", (byte) 32));

        int operationNumber = 0;

        while (operationNumber != 9) {
            System.out.println("\nLista operacji:\n");

            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj pracownika");
            System.out.println("3 - usuń pracownika");
            System.out.println("9 - zakończ program\n");

            System.out.print("Podaj numer operacji: ");
            operationNumber = scanner.nextInt();
            System.out.println();

            if (operationNumber == 1) {
                company.printEmployees();
            } else if (operationNumber == 2) {
                company.add();
            } else if (operationNumber == 3) {
                System.out.print("Podaj numer pracownika do usunięcia: ");
                int employeeNumber = scanner.nextInt();

                company.removeEmployee(employeeNumber);
            } else if (operationNumber != 9) {
                System.out.print("Operacja o podanym numerze nie istnieje!");
            }
        }
    }
}
