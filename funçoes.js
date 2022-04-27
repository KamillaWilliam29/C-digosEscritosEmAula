//Declarando funções:

function square(numero){
    return numero*numero
}
//Expressão de função;
var square = function(numero){return numero*numero}
var x = square(4) 
// var x recebe o valor de 16 

//As seguintes variáveis são definidas no escopo global
var num1 = 20
var num2= 3
//Esta função é chamada no escopo global
function multiplica(){
    return num1*num2
}

//crie uma função chamada de multiplicar() e passe dois paraâmetros: um retorno na tela para finalizar.

function multiplicar(a,b){
    return a*b
}

var x = multiplicar(3,6)

console.log(x)

//crie uma funçaão chamada experiência na qual avalie se em 2 anos, a pessoa seja considerada iniciante;
// 3 anos um Intermediário; 6 anos, um avançado; nehuma das anteriores, seja conmsiderada uma expert.

function experiencia(anos){
    if (anos <= 2){
        console.log('usuário iniciante')
    }
    else if (anos > 2 && anos<= 3){
        console.log('usuário Intermediário')
    }
    else if (anos > 3 && anos<= 6){
        console.log('usuário Avançado')
    }
    else {
        console.log('usuário expert!')
    }
}
//defina uma função para fazer a soam de elementos de um array declarado.

function nova(...argumentos){
    console.log(argumentos);
}

//equivale a escrever :
//function display(){
// for (x = 0; x < nomes.length; x++){}
//soma = soma + argumentos[x];
//}

//display.apply(this, nomes);
nova(2,5,7,8,3);


function arraySomado(...argumentos){
    var soma = 0
    for(var x = 0; x < argumentos.length; x++)
    soma = soma + argumentos[x]

    return soma;
}

//faça uma funçao que reverta uma letra minúscula em uma letra maiúscula;
// Atenção: serão 3 nomes, e apenas a primeira letra de cada letra será revertida para maiúscula.

var nomes= ['pedro', 'andré', 'tiago'];
var listaEmMaiucula = nomes.map(converter);
//a função map pega cada item de um array, em javascript.
console.log('Array original: ' + nomes)
console.log('Array retornado pelo método map()' + listaEmMaiuscula)
function converter(){
    return nomes[i].charAt(0).toLocaleUpperCase() + nomes[i].slice(1);
}
//nesta função, ustilizamos o método charAt(0) para recolher a primeira letra de cada nome(nomes[i]), daí por diante, temos:
//toLocalUpperCase para aumentar as letras para a fonte maiúscula;
// o slice(1) para pegar a parte restante de cada palavra('edro', 'ndré' e 'iago', respectivamente)
//a função .map literalmente ajuda a mapear os elementos de cada array, percorrendoós um a um. Daí, ela chama a nossa função converter e torna os elementos como
//o exercício pede, com a primeira letra em maiúscula.

//faça uma funçao que filtre(filter) os nomes com mais de 5 letras de um array.

var NewNomes= ['Pedro','André','Tiago','Filipe','Jõao', 'Bartolomeu', 'Tomé', 'Judas','Mateus','Thiago','Simão','Matias']
    var apostolos = newNomes.filter(nomes[i].length > 5)
    console.log(apostolos)

    //a variável apostolos receberá, através do filter, nomes com extensão maior que cinco letras: neste caso, os nomes de Filipe, Bartolomeu, Mateus, Thiago e Matias.
