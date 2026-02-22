package academy.guih.poo.javacore.classes.herança.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereço: " + endereço.getRua() + " " + endereço.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
}
