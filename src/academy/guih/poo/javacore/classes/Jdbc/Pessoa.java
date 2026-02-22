package academy.guih.poo.javacore.classes.Jdbc;

public class Pessoa {
    private Integer id;
    private String nome;
    private String profissao;
    private String sexo;
    private double altura;
    private double peso;
    private String nascimento;
    private String nacionalidade;



    public Pessoa(String nome, String profissao, String sexo, double altura, double peso, String nascimento, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public double getPeso() {
        return peso;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
