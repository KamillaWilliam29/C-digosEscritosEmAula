package jmock.jmock2;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

	@Mock
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;
	
	@Test
	void validarDadosCadastro() {
		
		DadosLocalizacao endereco = new DadosLocalizaçao("RJ", "Rio de Janeiro", "Rua 15 nº 2", "Apto 1321", "Madureira");
		Mockito.when(apiDosCorreios.buscaNaBaseDosCorreios("25210505")).thenReturn(DadosLocalizacao);
		Pessoa pèssoa = cadastrarPessoa.cadastrarPessoa("Miguel", "12345678", LocalDate.now(), "25210505");
		
		Assertions.assertEquals("Miguel", pèssoa.getNome());
		Assertions.assertEquals("12345678", pèssoa.getDocumento());
		Assertions.assertEquals("Madureira", pèssoa.getEndereco().getBairro());
	}
}
