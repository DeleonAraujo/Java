let input = document.querySelector('input[name=tarefa]');

let btn = document.querySelector('#botao');

let lista = document.querySelector('#lista');

let card = document.querySelector('#card');

let tarefas = JSON.parse(localStorage.getItem('tarefas')) || [];

function renderizarTarefas(){
    lista.innerHTML='';

    for(tarefa of tarefas){
        let itemLista = document.createElement('li');
        itemLista.setAttribute('class', 'list-group-item list-group-item-action');
        itemLista.onclick = function(){
            deletarTarefas(this);
        }

        let itemTexto = document.createTextNode(tarefa);
        itemLista.appendChild(itemTexto);
        lista.appendChild(itemLista);
    }
}

renderizarTarefas();

btn.onclick = function(){
    let novaTarefa = input.value;
    if(novaTarefa !== ""){
        tarefas.push(novaTarefa);

        renderizarTarefas();

        input.value = '';

        this.removerSpans();

        salvarDadosNoStorage();
    } else {
        removerSpans();

        let span = document.createElement('spans');

        span.setAttribute('class', 'alert alert-warning');

        let mensagem = document.createTextNode('Você precisa digitar a tarefa que deseja registrar!');

        span.appendChild(mensagem);

        card.appendChild(span);
    }
}

function removerSpans(){
    let spans = document.querySelectorAll('span');

    for(let i=0; i<spans.length; i++){
        card.removeChild(spans[i]);
    }
}

function deletarTarefas(tar){
    tarefas.splice(tarefas.indexOf(tar.textContent),1);

    renderizarTarefas();

    salvarDadosNoStorage();
}

function salvarDadosNoStorage(){
    localStorage.setItem('tarefas', JSON.stringify(tarefas));
}