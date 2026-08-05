import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int quantidadeFuncionarios = sc.nextInt();

        List<Funcionario> funcionariosList = new ArrayList<Funcionario>();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Employee #"+(i+1));

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Salary: R$");
            Double salario = sc.nextDouble();

            System.out.println();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionariosList.add(funcionario);
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        Integer idReferente = sc.nextInt();

        Integer posicion = hasId(funcionariosList, idReferente);

        if (posicion == null) {
            System.out.println("This id does not exist! ");
        }
        else {
            System.out.println("Enter the percentage: ");
            double value = sc.nextDouble();
            funcionariosList.get(posicion).increaseSalary(value);
        }


        System.out.println("List of employees:");
        for (Funcionario funcionario : funcionariosList){
            System.out.println(funcionario);
        }

    }
    public static Integer hasId(List<Funcionario> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }
}