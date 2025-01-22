alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 5;
console.log(numeroSecreto);
let chute;
let tentativas = 1;


// enquanto
while (chute != numeroSecreto) {
    alert('Você deve digitar um número entre 1 e 10');
    chute = prompt('Escolha um número secreto entre 1 a 10');
    //se o chute for = ao número secreto
    if (chute == numeroSecreto) {
        alert(`Parabéns! Você acertou o número secreto ${numeroSecreto} com ${tentativas} tentativas!`);
    } else {
        if (chute > numeroSecreto) {
            alert(`O número secreto é menor que ${chute}`);
        } else {
            alert(`O número secreto é maior que ${chute}`);
        }
    }
}