package jmock.jmock2;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.junit.jupiter.api.Assertions;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

	@Mock
	private List <String> letras;
	
	@Test
	void adicionarItemNaLista() {
		
		Mockito.when(letras.get(0)).thenReturn("B");
		
		Assertions.assertEquals("B", letras.get(0));
		
	}
}
