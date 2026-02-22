package academy.guih.poo.javacore.classes.herança.dominio;

public class Funcionario extends Pessoa {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + getSalario());
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void relatorioPagamento(){
        System.out.println("Eu + " + this.nome + " Recebi o salario de: " + this.salario);
    }
}
