package academy.guih.poo.javacore.classes.herança.test;

import academy.guih.poo.javacore.classes.herança.dominio.Endereço;
import academy.guih.poo.javacore.classes.herança.dominio.Funcionario;
import academy.guih.poo.javacore.classes.herança.dominio.Pessoa;

public class herançatest1 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 1");
        endereço.setCep("12345");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("guilherme");
        pessoa.setCpf("1234567890");
        pessoa.setEndereço(endereço);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("guilherme");
        funcionario.setCpf("1234567890");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(2000.25);
        System.out.println("__________________________________________________________________--");
        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}
