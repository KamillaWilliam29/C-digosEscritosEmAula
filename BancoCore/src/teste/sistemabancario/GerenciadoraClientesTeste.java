package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import sistemabancario.GerenciadoraClientes;

public class GerenciadoraClientesTeste {
	@Test
	public void testePesquisaCliente() {
		/*criando clientes para instaciar no caso de Teste*/
		
		Cliente cliente01 = new Cliente(1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		Cliente cliente02 = new Cliente(2, "Maria", 10, "maria@gmail.com", 1 ,true);
		
		List <Cliente> clientes = new ArrayList();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
	
		/*até esta linha nós só criamos e preparamos o nosso ambiente de Teste.*/
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		/*O Assert that dá uma expectativa de item que retornará ao teste que você deseja realizar */
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("clayton@gmail.com"));
		
		Cliente cliente2 = gerClientes.pesquisaCliente(2);
		
		assertThat(cliente2.getId(), is(2));
		assertThat(cliente2.getEmail(), is("maria@gmail.com"));
		
	}
	/*esse método não deve rtornar nenhum objeto. deve ser um void */
	@Test 
	public void testeAdicionaCliente() {
		
		List <Cliente> clientes = new ArrayList();
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
		Cliente cliente01 = new Cliente(1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		gerClientes.adicionaCliente(cliente01);
		
		Cliente cliente02 = new Cliente(2, "José Roberto", 30, "parente.25@gmail.com", 1, true);
		gerClientes.adicionaCliente(cliente02);
		
	}
	/*Criar um google docs para os Caso de Teste e um google docs com o Plano de Teste
	 * (este documento mdede a cobertura dos seus testes como um todo)*/
}