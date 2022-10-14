package sistemabancario;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest2 {
	
	private GerenciadoraContas gerContas;
	
	@Test
	public void testTransfereValor1() {
		//************* Montar o cenário *************//
		int idConta01 = 1;
		int idConta02 = 2;
		
		ContaCorrente conta01 = new ContaCorrente(idConta01, 200, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		List<ContaCorrente> contaDoBanco = new ArrayList<>();
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contaDoBanco);
		
		//************* Execução do negócio selecionado para o Teste *************//
		boolean succeso = gerContas.transfereValor(idConta01, 100, idConta02);
		
		//************* Verificações e Análise *************//
		assertTrue(succeso);
		assertThat(conta01.getSaldo(), is(100.0));
		assertThat(conta02.getSaldo(), is(100.0));	
	}
	
	@Test
	public void testTransfereValor2() {
		//Teste quando o saldo é insuficiente, entrando no cheque especial
		//************* Montar o cenário *************//
		int idConta01 = 1;
		int idConta02 = 2;
		
		ContaCorrente conta01 = new ContaCorrente(idConta01, 100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		List<ContaCorrente> contaDoBanco = new ArrayList<>();
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contaDoBanco);
		
		//************* Execução do negócio selecionado para o Teste *************//
		boolean succeso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		//************* Verificações e Análise *************//
		assertTrue(succeso);
		assertThat(conta01.getSaldo(), is(-100.0));
		assertThat(conta02.getSaldo(), is(200.0));	
	}
	
	@Test
	public void testTransfereValor3() {
		//Teste quando o saldo é insuficiente, entrando no cheque especial
		//************* Montar o cenário *************//
		int idConta01 = 1;
		int idConta02 = 2;
		
		ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);
		
		List<ContaCorrente> contaDoBanco = new ArrayList<>();
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contaDoBanco);
		
		//************* Execução do negócio selecionado para o Teste *************//
		boolean succeso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		//************* Verificações e Análise *************//
		assertTrue(succeso);
		assertThat(conta01.getSaldo(), is(-300.0));
		assertThat(conta02.getSaldo(), is(200.0));	
	}
	
	@Test
	public void testTransfereValor4() {
		//Teste quando o saldo é insuficiente, entrando no cheque especial
		//************* Montar o cenário *************//
		int idConta01 = 1;
		int idConta02 = 2;
		
		ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true);
		ContaCorrente conta02 = new ContaCorrente(idConta02, -100, true);
		
		List<ContaCorrente> contaDoBanco = new ArrayList<>();
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contaDoBanco);
		
		//************* Execução do negócio selecionado para o Teste *************//
		boolean succeso = gerContas.transfereValor(idConta01, 200, idConta02);
		
		//************* Verificações e Análise *************//
		assertTrue(succeso);
		assertThat(conta01.getSaldo(), is(-300.0));
		assertThat(conta02.getSaldo(), is(100.0));	
	}


	@Test
	public void LimitaValorTransferido_1(){
		//public void tranfereValor_SaldoInsuficiente(){
			//teste quando o saldo é insuficiente entrando no cheque especial
			int idConta01 = 1;
			int idConta02 = 2;
			//montagem de cenário: criação de contas
			ContaCorrente conta01 = new ContaCorrente(idConta01, -100, true); 
			ContaCorrente conta02 = new ContaCorrente(idConta02, -100, true);

			List <ContaCorrente> contaDoBanco = new ArrayList();
			contaDoBanco.add(conta01);
			contaDoBanco.add(conta02);
			
			gerContas = new GerenciadoraContas(contaDoBanco);
			
			//Execução do teste de transferência
			
			boolean sucesso = gerContas.LimitaValorTransferido(idConta02, 200.0, idConta01);
			
			// Verificação e Análise de Resultados
			assertTrue(sucesso);
			assertThat(conta01.getSaldo(), is(-300.0));
			assertThat(conta02.getSaldo(), is(100.0));
		}
	@Test
	public void LimitaValorTransferido_2(){
		//public void tranfereValor_SaldoInsuficiente(){
			//teste quando o saldo é insuficiente entrando no cheque especial
			int idConta01 = 1;
			int idConta02 = 2;
			//montagem de cenário: criação de contas
			ContaCorrente conta01 = new ContaCorrente(idConta01, 300, true); 
			ContaCorrente conta02 = new ContaCorrente(idConta02, 0, true);

			List <ContaCorrente> contaDoBanco = new ArrayList();
			contaDoBanco.add(conta01);
			contaDoBanco.add(conta02);
			
			gerContas = new GerenciadoraContas(contaDoBanco);
			
			//Execução do teste de transferência
			
			boolean sucesso = gerContas.LimitaValorTransferido(idConta02, 500.0, idConta01);
			
			// Verificação e Análise de Resultados
			assertTrue(sucesso);
			assertThat(conta01.getSaldo(), is(-200.0));
			assertThat(conta02.getSaldo(), is(500.0));
		}

}
