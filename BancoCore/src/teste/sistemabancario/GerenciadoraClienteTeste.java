package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClienteTeste {
	@Test
	public void testePesquisaCliente() {
		/*criando clientes para instaciar no caso de Teste*/
		
		Cliente cliente01 = new Cliente(1, "Clayton", 47, "clayton@gmail.com", 1 ,true);
		Cliente cliente02 = new Cliente(2, "Maria", 10, "maria@gmail.com", 1 ,true);
		
		List <Cliente> clientes = new ArrayList();
		clientes.add(cliente01);
		clientes.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientes);
	
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("clayton@gmail.com"));
	}
	
}
