package mocklabjava;


import static org.mockito.Mockito.*;

public class MockPessoa {
	public static void main(String[] args) {
		Pessoa p1 = mock(Pessoa.class);
		p1.falar();
	}
}