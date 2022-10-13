package sistemabancario;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTeste2 {
	
	private GerenciadoraContas gerContas;
	
	@Test
	public void tranfereValor() {
		int idConta01 = 1;
		int idConta02 = 2;
		//montagem de cenário: criação de contas
		ContaCorrente conta01 = new ContaCorrente(idConta01, 100, true); 
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);

		List <ContaCorrente> contaDoBanco = new ArrayList();
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contaDoBanco);
		
		//Execução do teste de transferência
		
		boolean sucesso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		// Verificação e Análise de Resultados
		assertThat(conta01.getSaldo(), is(-100.0));
		assertThat(conta02.getSaldo(), is(200.0));
	}
}
