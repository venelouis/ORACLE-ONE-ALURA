//O principal objetivo deste desafio é fortalecer suas habilidades em lógica de programação. 
// Aqui você deverá desenvolver a lógica para resolver o problema.

// Desafio
// O amigo secreto é uma brincadeira muito comum entre amigos e familiares.
// Neste desafio, você deverá criar um algoritmo que sorteia um amigo secreto para um grupo de pessoas
// O seu programa deverá receber um array com o nome de todas as pessoas que irão participar do amigo secreto e sortear a pessoa para cada uma delas.  
// Cada pessoa deve tirar um amigo secreto e não pode tirar ela mesma. 
// Ao final o programa deve exibir quem deve presentear quem.

// Entrada

// Saída

// Exemplos
// Entrada Saída
// ["A", "B", "C", "D"]
// A deve presentear C
// B deve presentear D
// C deve presentear B
// D deve presentear A

let amigos = [];

function adicionarAmigo() {
    const input = document.getElementById('amigo');
    const nomeAmigo = input.value.trim();

    if (nomeAmigo !== '' && !amigos.includes(nomeAmigo)) {
        amigos.push(nomeAmigo);
        atualizarListaAmigos();
        input.value = '';
        input.focus();
    } else if (amigos.includes(nomeAmigo)) {
        alert('Este nome já foi adicionado.');
    }
}

function atualizarListaAmigos() {
    const listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = '';

    amigos.forEach((amigo) => {
        const li = document.createElement('li');
        li.textContent = amigo;
        li.className = 'name-item';
        listaAmigos.appendChild(li);
    });
}

function sortearAmigo() {
    if (amigos.length < 2) {
        alert('Adicione pelo menos dois amigos para sortear.');
        return;
    }

    const resultado = document.getElementById('resultado');
    resultado.innerHTML = '';

    let amigosSorteados;
    let sorteio;
    let valid = false;

    while (!valid) {
        amigosSorteados = [...amigos];
        sorteio = [];

        while (amigosSorteados.length > 0) {
            const indice = Math.floor(Math.random() * amigosSorteados.length);
            const amigo = amigosSorteados.splice(indice, 1)[0];
            sorteio.push(amigo);
        }

        valid = sorteio.every((amigo, index) => amigo !== amigos[index]);
    }

    sorteio.forEach((amigo, index) => {
        const li = document.createElement('li');
        li.textContent = `${amigos[index]} tirou ${amigo}`;
        li.className = 'result-item';
        resultado.appendChild(li);
    });
}