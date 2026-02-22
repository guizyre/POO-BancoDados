package academy.guih.poo.javacore.classes.Jdbc;

public class TestConex {
    public static void main(String[] args) {
        //Criar o objeto Pessoa para que assim eu possa alocar dentro do BD
        Pessoa p = new Pessoa("meuAmor","namorada", "f", 1.65, 63.0, "2006-05-15", "Brasil");

        //Chama o repositório para salvar no banco
        PessoaRepository repo = new PessoaRepository();
        repo.salvar(p);
    }
}
