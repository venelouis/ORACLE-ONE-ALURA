alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 5

let chute = prompt('Escolha um número secreto entre 1 a 10');

if (chute == numeroSecreto) {
    console.log('Parabéns! Você acertou!');
} else {
    alert('Que pena! O número escolhido foi ' + numeroSecreto);
}