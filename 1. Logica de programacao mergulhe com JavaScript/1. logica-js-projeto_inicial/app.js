alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 5
console.log(numeroSecreto)
let chute = prompt('Escolha um número secreto entre 1 a 10');

// enquanto



//se o chute for = ao número secreto, exibe mensagem de parabéns
if (chute == numeroSecreto) {
    alert(`Parabéns! Você acertou o número secreto ${numeroSecreto}!`);
} else {
    if (chute > numeroSecreto) {
        alert(`O número secreto é menor que ${chute}`);
    } else {
        alert(`O número secreto é maior que ${chute}`);
    }
    alert('Que pena! O número escolhido foi ' + numeroSecreto);
}