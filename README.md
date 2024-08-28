<h1>Automação de teste de API  - Java - usando Rest Assured, bibliotecas Cucumber e BDD</h1>

Este projeto implementa a automação de testes de uma API que realiza operações CRUD (Create, Read, Update, Delete) para gerenciar produtos nas seguintes categorias:
<ul>
<li>Eletrônicos</li>
<li>Jóias</li>
<li>Roupas Masculinas</li>
<li>Roupas Femininas</li>

</ul>

<h2>Tecnologias Utilizadas</h2>

<ul>
<li>Java 11+: Linguagem de programação. </li>
<li>Rest Assured: Framework para testes de APIs REST.</li>
<li> Cucumber: Framework para testes baseados em BDD (Behavior-Driven Development).</li>
<li> JUnit: Framework de testes unitários para Java.</li>
<li> Maven: Gerenciamento de dependências e build.</li>
</ul>

<h2>Estrutura do Projeto</h2>

<img src="Captura de tela 2024-08-28 165729.png">

<h2>Configuração do Cucumber</h2>

Os cenários de teste são escritos em arquivos .feature utilizando a linguagem Gherkin. Os passos (step definitions) são implementados em Java, utilizando o framework Rest Assured para interagir com a API.

Exemplo de Cenário Gherkin:

<img src="Captura de tela 2024-08-28 175536.png">

<h2>Executando os Testes</h2>

Para executar todos os testes execute a classe CukeRunner que está localizada dentro do package runner

<img src="Captura de tela 2024-08-28 180035.png">

<h2>Relatório</h2>
Os resultados dos testes serão exibidos no console e um relatório será gerado na pasta target.

<img src="Captura de tela 2024-08-28 174839.png">