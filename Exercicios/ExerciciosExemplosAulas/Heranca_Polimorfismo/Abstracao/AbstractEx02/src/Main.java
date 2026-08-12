import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantifyEmployees = sc.nextInt();
        List<Pessoa> pessoaList = new ArrayList<>();
        for (int i = 0; i < quantifyEmployees; i++) {
            System.out.println("Tax payer #"+(i+1)+" data:");

            System.out.print("Individual or company? ");
            char typePerson = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (typePerson=='i'||typePerson=='I'){
                System.out.print("Health expedintures: ");
                Double healthExpedintures = sc.nextDouble();
                Pessoa pessoa = new PessoaFisica(name, anualIncome,healthExpedintures);
                pessoaList.add(pessoa);
            }
            if (typePerson == 'c' || typePerson == 'C') {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                Pessoa pessoa = new PessoaJuridica(name, anualIncome, numberEmployees);
                pessoaList.add(pessoa);
            }
        }
        double sum = 0;
        System.out.println("TAXES PAID:");
        for (Pessoa pessoa : pessoaList){
            System.out.println(pessoa.getName()+": $ "+pessoa.tax());
            sum += pessoa.tax();
        }
        System.out.println("TOTAL TAXES: $ "+sum);
        sc.close();
    }
}