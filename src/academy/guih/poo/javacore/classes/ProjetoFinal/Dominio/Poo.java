package academy.guih.poo.javacore.classes.ProjetoFinal.Dominio;

public @interface Poo {
    //1. Visão geral
    //No projeto final, cada aluno (ou dupla) irá desenvolver uma aplicação com tema livre, desde que o sistema:
    //
    //tenha um domínio minimamente rico (não pode ser só uma calculadora ou script trivial);
    //
    //permita aplicar, na prática, os fundamentos de POO trabalhados na disciplina.
    //
    //O foco principal da avaliação será a qualidade da modelagem orientada a objetos, e não a sofisticação da interface.
    //
    //No final da especificação será apresentado um Projeto de Exemplo - POO (Sistema de Chamados de Suporte Técnico) que atende a todos os requisitos. Esse projeto serve apenas como exemplo de estilo: não deve ser copiado.
    //
    //2. Requisitos de POO
    //Seu projeto deve, obrigatoriamente, conter:
    //
    //2.1 Estrutura de classes e objetos
    //Pelo menos 6 classes de domínio (não contar exceções, interfaces, etc.).
    //
    //Atributos privados e métodos de acesso adequados (encapsulamento).
    //
    //Métodos com nomes claros que representem ações de negócio.
    //
    //2.2 Composição e coleções
    //Pelo menos uma relação de composição/agregação (por exemplo: Turma-Aluno, Pedido-ItemPedido).
    //
    //Uso de pelo menos uma coleção (List, ArrayList, etc.) para manter vários objetos relacionados.
    //
    //Métodos para adicionar, remover e listar elementos dessa coleção.
    //
    //2.3 Herança, sobreposição e polimorfismo
    //Pelo menos uma hierarquia com herança (superclasse + subclasses).
    //
    //Uso de classe abstrata ou método abstrato.
    //
    //Pelo menos um método sobrescrito (@Override).
    //
    //Algum ponto do código usando polimorfismo:
    //
    //variável, parâmetro ou coleção do tipo da superclasse/interface contendo objetos de subclasses diferentes.
    //
    //2.4 Interface e polimorfismo de interface
    //Pelo menos uma interface representando um contrato (ex: Notificavel, Autenticavel, MetodoPagamento).
    //
    //Pelo menos duas classes diferentes implementando essa interface.
    //
    //Algum ponto do sistema usando a interface como tipo (ex: Notificavel n = new NotificacaoEmail(...)).
    //
    //2.5 Sobrecarga
    //Pelo menos um exemplo de sobrecarga de métodos (mesmo nome, parâmetros diferentes), com sentido no domínio. Exemplos de ideia:
    //
    //listarChamados() e listarChamados(boolean apenasAbertos);
    //
    //cadastrarCliente(String nome) e cadastrarCliente(String nome, String email).
    //
    //2.6 Organização e main
    //Uma classe com public static void main(String[] args) que funciona como ponto de entrada do sistema.
    //
    //A classe main deve:
    //
    //Criar os objetos principais do sistema (por exemplo, um controlador ou gerenciador).
    //
    //Mostrar um menu simples, ler a opção e chamar métodos das outras classes.
    //
    //Tratar exceções de alto nível, exibindo mensagens amigáveis.
    //
    //A classe main não deve:
    //
    //concentrar as regras de negócio (cálculos, validações, etc.);
    //
    //manipular diretamente detalhes internos de outras classes (listas internas, por exemplo);
    //
    //virar um método enorme que "faz tudo".
    //
    //Pense na main como um maestro: ela organiza quem toca, mas não toca todos os instrumentos.
    //
    //3. Entregáveis
    //Cada grupo deverá entregar:
    //
    //Código-fonte completo do projeto.
    //
    //Um documento curto contendo (veja um exemplo Relatório de Projeto - POO):
    //
    //descrição do tema e do problema que o sistema resolve;
    //
    //principais funcionalidades;
    //
    //principais classes e responsabilidades;
    //
    //uma seção indicando claramente:
    //
    //onde aparece herança;
    //
    //onde aparece polimorfismo; 2028589241 numero de 
    //
    //onde aparece interface;
    //
    //onde aparece composição;
    //
    //onde aparecem sobrecarga e exceções.
    //
    //4. Projeto de referência
    //Aqui está um projeto exemplo chamado Sistema de Chamados de Suporte Técnico, que:
    //
    //implementa todos os requisitos listados acima;
    //
    //possui uma main simples que apenas orquestra o fluxo;
}
