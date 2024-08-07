import entities.Company;
import entities.Individual;
import entities.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));

            } else if (ch == 'c') {
                System.out.println("Number the employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayers taxPayers: list){
            System.out.println(taxPayers.getName() + " $ " + taxPayers.tax());
        }

        double soma = 0.0;
        for (TaxPayers taxPayers: list){
            soma += taxPayers.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ "+ soma);

    }
}