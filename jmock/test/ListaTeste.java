package jmock.jmock2;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {
	
	@Mock
	private List <String> letras;
	
	@Test
	void adicionarItemNalista() {
		Mockito.when(letras.get(0)).thenReturn("C");
		
		Assertions.assertEquals("C",letras.get(0));
	
	}

}