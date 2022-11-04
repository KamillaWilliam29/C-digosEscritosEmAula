package mocklabjava;

import static org.mockito.Mockito.*;

public class MockPessoa2 {



	public static void main(String[] args) {
		IPessoa p2 = (IPessoa) mock(Pessoa2.class);
		p2.falar();
		
		when(p2.getIdade()).thenReturn(25);
	}

}