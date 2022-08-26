package sistemabancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteSistemaBancario {
	public static void main(String[] args) {
		inicializaSistemaBancario(); //inicializar dados de Contas e de Clientes
		
		
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		while(continua){
			printMenu();
			
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o Id do cliente: ");
				int idCliente = sc.nextInt();
				Cliente cliente = gerClientes.pesquisaCliente(idCliente);
				
				if(cliente !=null) {
					System.out.println(cliente.toString());
				}else {
					System.out.println("CLiente Não encontrado!");
				}
				break;
				
			case 2:
				System.out.println("Digite o Id da Conta: ");
			
				int idConta = sc.nextInt();
				ContaCorrente conta = gerContas.pesquisaConta(idConta);
				
				if(conta !=null) {
					System.out.println(conta.toString());
				}else {
					System.out.println("Conta Corrente Não encontrada!");
				}
				break;
		
			case 3:
				System.out.println("Digite o Id do cliente: ");
				int idCliente2 = sc.nextInt();
				Cliente cliente2 = gerClientes.pesquisaCliente(idCliente2);
				
				if (cliente2 != null){
					cliente2.setAtivo(true);
					System.out.println("Cliente ativado com sucesso");
				}
				else {
					System.out.println("Cliente não encontrado!");
				}
				
			case 4:
				System.out.println("Digite o Id do cliente: ");
				int idCliente3 = sc.nextInt();
				Cliente cliente3 = gerClientes.pesquisaCliente(idCliente3);
				
				if (cliente3 != null){
					cliente3.setAtivo(false);
					System.out.println("Cliente ativado com sucesso");
				}
				else {
					System.out.println("Cliente não encontrado!");
				}
			
			case 5:
				continua = false;
				System.out.println("=====bye bye !! ======");
				break;
				
				default:
					System.out.println();
					break;
			}
			
		}
		sc.close();
	}

	private static void printMenu() {
	 System.out.println("Qual operação você deseja executar?\n");
	 System.out.println("1) Consultar por um Cliente");
	 System.out.println("2) Consultar por uma conta Corrente");
	 System.out.println("3) Ativar um cliente");
	 System.out.println("4) Desativar um cliente");
	 System.out.println("5)Sair");
	 System.out.println();
		
	}

	static GerenciadoraClientes gerClientes;
	static GerenciadoraContas gerContas;
	
	private static void inicializaSistemaBancario() {
		// criar Lista vazia de Contas e de Clientes:
		List <ContaCorrente> contasDobanco = new ArrayList<>();
		List <Cliente> clientesDoBanco = new ArrayList<>();
		
		//criar e inserir duas contas correntes:
		
		ContaCorrente conta01 = new ContaCorrente(1, 0, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		contasDobanco.add(conta01);
		contasDobanco.add(conta02);
		
		Cliente cliente01 = new Cliente(1, "Guilheme",30, "guilherme@gmail.com", conta01.getId(), true);
		Cliente cliente02 = new Cliente(2, "Gabriel",22, "gabriel@gmail.com", conta02.getId(), true);
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);

		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		gerContas = new GerenciadoraContas(contasDobanco);
	}
	
	
}
