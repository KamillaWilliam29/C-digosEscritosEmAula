//Encontrar um  número dado como argumento em uma
//sequencia linear de 1000 numeros usando o fork()
//para distribuir a busca entre varios processos.
//
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>

#define TAMANHO 100 //tamanho da Sequencia
#define numfil 5
int sequencia[TAMANHO]; //cria o vetor para inicializar a sequencia de 								//números;

void process (int numero) 
{
	int i, procura;
	int stat;
	pid_t pid[5];
	
	for (i=0; i<5; i++)	//cria 5 processos filhos
	{
	//se for o processo filho, executa o bloco a seguir.
	    if ((pid[i] = fork() ==0))
	    {
  	        for (procura=(TAMANHO/numfil)*i; 
                    procura<=(TAMANHO/numfil)*(i+1)-1; 
                    procura++) {

	            if (sequencia[procura] == numero) {
		    printf("Encontrou o número %d na posicao %d\n",numero, procura);
		    exit(i+1); 
	        }
            }
            
            exit(0);
     }
}
//Código executado pelo processo pai
//Usando waitpid() e esperando informação do término dos Processos Filhos
//usando os macros(WIFEXITED etc) com o status
//
       for (i=0; i<5; i++)
       {
           pid_t cpid = waitpid(pid[i], &stat, 0);
	   if (WIFEXITED(stat)) {
               if (WEXITSTATUS(stat) > 0)
	       printf("Filho %d encontrou o número!\n", WEXITSTATUS(stat));
	   }
	   else if (WIFSIGNALED(stat))
		psignal(WTERMSIG(stat), "Sinal recebido!\n");
           }
       }  
//
//Main: recebe o número, inicializa o vetor e chama o process()
//
int main(int argc, char *argv[] )
{
	int i, num;
	
	//Recebe o número através dos argumentos do programa
	if (argc != 2) {
		printf("Uso: %s numero\n", argv[0] );
		exit(0);
	}
	
	//atoi converte string para integer
	num = atoi(argv[1]);
	if (num < 0) {
		printf("Entre um número positivo: %d\n", num);
		exit(0);
	}
	
	//iniciliza a sequencia com números entre 0 e TAMANHO-1
	for (i=0; i<TAMANHO; i++)
		sequencia[i] = i;
	
	process(num);
	return 0;
	//fechando a main
}
