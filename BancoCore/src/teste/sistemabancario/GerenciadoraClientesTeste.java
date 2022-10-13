package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import sistemabancario.GerenciadoraClientes;

public class GerenciadoraClientesTeste {
	@Test
	public void testePesquisaCliente() {
		/*criando clientes para instaciar no caso de Teste*/
		
		int idCliente1 = 1;
		int idCliente2 = 2;
		//instanciando clientes.
		Cliente cliente01 = new Cliente(idCliente1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		Cliente cliente02 = new Cliente(idCliente2, "Maria", 10, "maria@gmail.com", 2 ,true);
		
		List <Cliente> clientes = new ArrayList<>();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
	
		/*até esta linha nós só criamos e preparamos o nosso ambiente de Teste.*/
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		/*O Assert that dá uma expectativa de item que retornará ao teste que você deseja realizar */
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("clayton@gmail.com"));
		assertThat(cliente.getNome(), is("Clayton"));
		
		Cliente cliente2 = gerClientes.pesquisaCliente(2);
		
		assertThat(cliente2.getId(), is(2));
		assertThat(cliente2.getEmail(), is("maria@gmail.com"));
		assertThat(cliente2.getNome(), is("Maria"));
		
	}
	/*esse método não deve rtornar nenhum objeto. deve ser um void */
	@Test 
	public void testeAdicionaCliente() {
		
		List <Cliente> clientes = new ArrayList<>();
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		Cliente cliente01 = new Cliente(1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		gerClientes.adicionaCliente(cliente01);
		
		Cliente cliente02 = new Cliente(2, "José Roberto", 30, "parente.25@gmail.com", 1, true);
		gerClientes.adicionaCliente(cliente02);
		
	}
	/*Criar um google docs para os Caso de Teste e um google docs com o Plano de Teste
	 * (este documento mdede a cobertura dos seus testes como um todo)*/
	

	@Test
	public void testeRemoveCliente() {
		//Montagem do cenário
		int idCliente3 = 3;
		int idCliente5 = 5;
		
		Cliente cliente03 = new Cliente(idCliente3, "João Simões", 21, "joaos@gmail.com", 3 , true);
		Cliente cliente5 = new Cliente (idCliente5, "Ana Carolina", 26, "carolana@gmail.com", 5, true);
		List <Cliente> clientes = new ArrayList<>();
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		gerClientes.adicionaCliente(cliente03);
		gerClientes.adicionaCliente(cliente5);
		gerClientes.pesquisaCliente(3);
		
		//execução do teste
		boolean clienteRemovido = gerClientes.removeCliente(idCliente3);
		boolean clienteRemovido2 = gerClientes.removeCliente(4);
		gerClientes.adicionaCliente(cliente5);
		
		
		//análise da remoção esperada.
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(2));
		assertNull(gerClientes.pesquisaCliente(3));
		assertThat(clienteRemovido2, is(false));
		//teste do método remover. Para assegurar que removemos com sucesso um cliente, adicionamos e pesquisamos ele só em caso, pois o método remoção precisa de clientes adicionados
	}
	
	@Test
	public void testeIsAtivo() {
		List <Cliente> clientes = new ArrayList<>();
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		Cliente cliente04 = new Cliente(4, "Caio", 18, "caio@gmail.com", 4, true);
		Cliente cliente05 = new Cliente(5, "Ricardo Carvalho", 62, "ricardo@gmail.com", 5, false);
		gerClientes.clienteAtivo(4);
		gerClientes.clienteAtivo(5);
		
		//o método cliente Ativo testa se um determinado clietne está ativo ou não. Buscammos o cliente por ID, verificamos se o metodo clienteAtivo é igual a true, e retornamos o cliente ativo. Para prepararmos o ambiente de teste, adicionamos dois clientes: um com valor booleano true e outro com false.
	}
	
}