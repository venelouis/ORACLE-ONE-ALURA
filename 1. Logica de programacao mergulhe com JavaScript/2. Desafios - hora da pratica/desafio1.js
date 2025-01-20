/*
Praticar a lógica de programação, incluindo conceitos como variáveis, condicionais (if), alert, prompt, é essencial para seu desenvolvimento. Esses fundamentos fornecem a base para resolver problemas de forma estruturada, tomar decisões no código, criar interações controladas e interagir eficazmente com as pessoas.

Compreender esses conceitos não apenas facilita o aprendizado de novas linguagens e tecnologias, mas também capacita você a criar soluções inovadoras, depurar eficientemente e manter a qualidade ao longo do ciclo de vida do software. Portanto, investir tempo nesses princípios desde cedo é fundamental para construir uma trajetória bem-sucedida no campo da programação.

Pensando nisso, criamos uma lista de atividades (não obrigatórias) focada em prática para melhorar ainda mais sua experiência de aprendizagem.

Esses exercícios são mais focados em programação, então você continuará trabalhando apenas no arquivo app.js. Porém, para conseguir executar seus programas, você precisa de um HTML para visualizar as páginas. Por isso, no link a seguir você pode baixar um projeto básico com HTML e CSS para executar o projeto com sucesso. Download do projeto do desafio

Bora praticar então?

Desafios
1. Mostre um alerta com a mensagem "Boas vindas ao nosso site!".

2. Declare uma variável chamada nome e atribua a ela o valor "Lua".

3. Crie uma variável chamada idade e atribua a ela o valor 25.

4. Defina uma variável numeroDeVendas e atribua a ela o valor 50.

5. Defina uma variável saldoDisponivel e atribua a ela o valor 1000.

6. Exiba um alerta com o texto "Erro! Preencha todos os campos"

7. Declare uma variável chamada mensagemDeErro e atribua a ela o valor "Erro! Preencha todos os campos" Agora exiba um alerta com o valor da variável mensagemDeErro.

8. Use um prompt para perguntar o nome do usuário e armazená-lo na variável nome.

9. Peça ao usuário para digitar sua idade usando um prompt e armazene-a na variável idade.

10. Agora, caso a idade seja maior ou igual que 18, exiba um alerta com a mensagem "Pode tirar a habilitação!".
*/

// Resolução do desafio
// Desafio 1
alert("Boas vindas ao nosso site!");

// Desafio 2
let nome = "Lua";

// Desafio 3
let idade = 25;

// Desafio 4
let numeroDeVendas = 50;

// Desafio 5
let saldoDisponivel = 1000;

// Desafio 6
alert("Erro! Preencha todos os campos");

// Desafio 7
let mensagemDeErro = "Erro! Preencha todos os campos";
alert(mensagemDeErro);

// Desafio 8
nome = prompt("Qual é o seu nome?");
console.log(nome);

// Desafio 9
idade = prompt("Qual é a sua idade?");
console.log(idade);

// Desafio 10
let idade = prompt("Qual é a sua idade?");
if (idade >= 18) {
  alert("Pode tirar a habilitação!");
}
