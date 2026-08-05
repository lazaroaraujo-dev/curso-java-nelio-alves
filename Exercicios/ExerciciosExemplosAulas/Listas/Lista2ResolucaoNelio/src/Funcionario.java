public class Funcionario {
    private final Integer id;
    private String name;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario){
        this.id = id;
        this.name = nome;
        this.salario = salario;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void increaseSalary(double percentual){
        this.salario = salario + salario * (percentual/100);
    }

    @Override
    public String toString() {
        return  id + ", " + name + ", " + String.format("%.2f", salario);
    }
}
