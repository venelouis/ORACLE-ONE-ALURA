// Exibe uma mensagem de boas-vindas ao jogador
alert('Boas vindas ao jogo do número secreto');
let numeroMaximo = 100; // número máximo para o número secreto
let numeroSecreto = parseInt(Math.random() * 100 + 1); // número aleatório entre 1 e 100
console.log(numeroSecreto); // exibe o número secreto no console
let chute; // variável para armazenar o chute do jogador
let tentativas = 1; // variável para armazenar o número de tentativas

// enquanto chute não for igual ao n.s.
while (chute != numeroSecreto) { // enquanto a condição for verdadeira
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`); // solicita um número ao jogador e armazena na variável chute 
    // se chute for igual ao número secreto
    if (chute == numeroSecreto) { // se a condição for verdadeira
        break; // interrompe o loop
    } else { // se a condição for falsa
        if (chute > numeroSecreto) { // se a condição for verdadeira
            alert(`O número secreto é menor que ${chute}`); // exibe uma mensagem
        } else { 
            alert(`O número secreto é maior que ${chute}`); // exibe uma mensagem
        }
        // tentativas = tentativas + 1;
        tentativas++; // incrementa a variável tentativas
    }
}

let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa'; 
// operador ternário para verificar o número de tentativas e exibir a mensagem correta

alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}.`); 
// exibe uma mensagem com o número secreto e o número de tentativas

// if (tentativas > 1) {
//     alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas.`);
// } else {
//     alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativa.`);
// }