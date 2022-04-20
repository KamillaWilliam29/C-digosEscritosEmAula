name: Exercícios.js;
exercicios.js;

    //verificar se a é maior que b e b é divisível por 2,
    var a = 100;
    var b = 200;

    if (a > b ){
    console.log('a  é maior que b.')
    }
    else{
        console.log('a não é maior que b.')
    }
    if (b %2 === 0){
    console.log('porém o resto da divisão de b por 2 é igual a 0.')
}      
    else {
        console.log('o resto da divisão de b por 2 não é igual a 0.')
    }
    //verificar se b é maior ou igual que a
    //ou b dividido por 2 o resultado é igual a 2. 

    a = 1000;
    b = 800;

    if (b >= a||b/2 ===2){
        console .log('b é maior ou igual a 1000, e a divisão de b por 2 é igual a 2.')
    }
    else{
        console.log('b é menor do que '+a ,'e a divisão de b por 2 não é igual a 2 .')

    }
    //verificar se a é maior que b e b maior ou igual a 5
    if (a > b && b >= 5){
        console.log('a tem maior valor que b, e b é maior ou igual a cinco')
    }

    //verificar se b é par ou ímpar com ternário
    (b %2 === 0 ||b % 2===1) ? 'b é um número par ' :'b é um número impar';

    // (a > b && b%2 ===0 ? 'a mé maior que b ', b é divisível por 2 ')

    //utilize a variável abaixo e retire
    //a palavra criptomoeda da frase
    //var frase = 'Eu ganho dinheiro com criptomoeda'

    var frase = 'Eu ganho dinheiro com criptomoeda'
        frase.search('criptomoeda')
        frase = frase.slice(0, 21)
        console.log(frase)

    
    //acrescente no final da frase da variável
    //acima a palavra mini-indice

    frase.concat = 'Eu ganho dinheiro com criptomoeda' + 'mini-indice'    //InputDeviceInfo
    console.log(frase.push('mini-indice'))

    //defina um array de 6 posicões com valores de carros
    //e mude o valor da posição 5 para um nome
    //de um carro que não existe no array

    var ValoresCarro = [29990, 40800, 62900, 36900, 63900, 50900]
    var Carros = ['Celta', 'Gol', 'Peugeot', 'Honda', 'Kia', 'Crossfox']
    Carros[5].replace=['Renault']

    //defina um array com nomes de cidaes
    //e identifique a cidade com o maior nome
    var cidades = ['Rio de Janeiro', 'Niteroi', 'São Paulo','Leopoldina']
	var cidade = 'Rio de Janeiro'
    for (i =0; i < cidades.length; i++){
        cidades[i].length < cidades[i+1].length ? console.log('a cidade menor está do lado'):console.log('esta não é a cidade menor')
	cidade = cidades[i]
    }
    var menorNome = cidade
    console.log(menorNome)


    // defina um array com sete números
    //informe o menor valor do array
	var arrayNumeros = [1,7,9,6,42,5,8]
	var menorValor= 0
	for(i = 0; i <= arrayNumeros.length; i++){
		if (arrayNumeros[i]< arrayNumeros[i+1]){
			menorValor = arrayNumeros[i]
		}
        else{ 
            menorValor =arrayNumeros[i+1]
        }
    };
	console.log(menorValor)
    

    //defina um array de 8 numeros 
	var numeros =[3, 4, 5, 6, 7, 78, 9, 10]
    
    //acrescente mais um número no array
	numeros.push(2)

    //retire a posição 3 e 5 do array
	numeros.slice(3,4)
	numeros.slice(5,6)

    //retire a última posição do array
	numeros.reverse
	numeros.shift
	
	//alternativamente,
	//numeros.pop
	

    //acrescente um item na primeira posição do array.
	numeros.reverse
	newNumero=[45]
	newNumero.join(numeros)
	
	//alternativamente,
	//numeros. unshift(20)

    //faça um array com todos os meses do ano, 
    //faça 4 arrays que cotrrespondam a cada trimestre
        var meses=['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto'
        ,'Setembro','Outubro','Novembro', 'Dezembro'];
       trimestre1 = meses.slice(0,3);
       trimestre2 = meses.slice(3,6);
       trimestre3 = meses.slice(6,9);
       trimestre4 = meses.slice(9,11);
	   
	   //também é possível resolver este exercícios com .filter. Assim:
	   // var primeiroTri = meses.filter(i <= 2){
		 //  console.log(primeitroTri)
	   //}
		//var segundoTri = meses.filter(i > 2 && i <= 5){
		//	console.log(segundoTri)
		//}
		//var terceiroTri = meses.filter(i > 5 && I <= 8 ){
			//console.log(terceiroTri)
		//}
		//var ultimoTri = meses.filter(i > 8 && i <= 11){
				//consosle.log(ultimoTri)
		//}
