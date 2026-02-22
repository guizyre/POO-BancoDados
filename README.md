<div align="center">
  <h1>☕ POO & Banco de Dados (JDBC)</h1>

  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java Badge">
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL Badge">
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ Badge">

  <br><br>
  
  <p>
    <i>"A ponte entre a Orientação a Objetos e a Persistência de Dados."</i>
  </p>
</div>

<hr>

<h2>🚀 Sobre o Projeto</h2>

<p>
  Este projeto foi desenvolvido com o objetivo de criar uma dinâmica prática integrando os conceitos fundamentais da 
  <b>Programação Orientada a Objetos (POO)</b> com a persistência de dados em um banco relacional.
</p>

<p>
  A aplicação simula um sistema de gerenciamento de pessoas, onde o código Java se comunica diretamente com um banco de dados 
  criado e modelado através do <b>MySQL Workbench</b>, utilizando o padrão JDBC (Java Database Connectivity).
</p>

<hr>

<h2>🛠 Tecnologias Utilizadas</h2>

<ul>
  <li><b>Java 17+</b>: Linguagem principal para a lógica de negócios e estruturação de objetos.</li>
  <li><b>MySQL Workbench</b>: Utilizado para modelagem e script do banco de dados.</li>
  <li><b>JDBC</b>: API padrão para conexão e execução de comandos SQL via Java.</li>
  <li><b>IntelliJ IDEA</b>: IDE utilizada para o desenvolvimento.</li>
  <li><b>Git & GitHub</b>: Versionamento e documentação do código.</li>
</ul>

<hr>

<h2>📂 Estrutura do Código</h2>

<table align="center">
  <tr>
    <th>Classe</th>
    <th>Responsabilidade</th>
  </tr>
  <tr>
    <td><code>ConnectionFactory</code></td>
    <td>Responsável por criar e encerrar a conexão com o banco de dados MySQL, garantindo que a aplicação se conecte de forma segura.</td>
  </tr>
  <tr>
    <td><code>Pessoa</code></td>
    <td>Classe de <b>Domínio (Model)</b>. Representa a entidade "Pessoa" na POO, com atributos mapeados para as colunas da tabela no banco.</td>
  </tr>
  <tr>
    <td><code>PessoaRepository</code></td>
    <td>Implementa o padrão <b>DAO/Repository</b>. É aqui que o Java "fala" SQL (INSERT, DELETE, UPDATE, SELECT) para manipular os dados.</td>
  </tr>
  <tr>
    <td><code>TestConex</code></td>
    <td>Classe principal para execução e testes das funcionalidades de conexão e CRUD.</td>
  </tr>
</table>

<hr>

<h2>💾 Banco de Dados (SQL)</h2>

<p>O banco de dados foi modelado para receber as informações da classe <code>Pessoa</code>. Exemplo da estrutura utilizada:</p>

<pre>
CREATE TABLE pessoa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    profissao VARCHAR(100),
    altura DOUBLE,
    peso DOUBLE,
    nascimento DATE,
    sexo VARCHAR(1),
    nacionalidade VARCHAR(50)
);
</pre>

<hr>

<div align="center">
  <h3>Desenvolvido por <a href="https://github.com/guizyre">Guizyre</a></h3>
  <p>Estudante de Desenvolvimento de Software | Focado em Java & Backend</p>
  
  <a href="https://github.com/guizyre">
    <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
  </a>
</div>
