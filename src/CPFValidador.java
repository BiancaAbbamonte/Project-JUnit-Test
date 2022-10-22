import static org.junit.Assert.*;

import org.junit.Test;

public class CPFValidador {

	// teste pra verificar se o cpf � v�lido (usando o cpf v�lido que estava na
	// explica��o)
	@Test
	public void CPFTeste() {
		String cpf = "11144477735";
		Boolean resultadoEsperado = true;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf � v�lido (usando o cpf inv�lido que estava na
	// explica��o)
	@Test
	public void CPFTeste1() {
		String cpf = "11144477701";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf � v�lido (usando um outro cpf v�lido pego no
	// link: https://www.4devs.com.br/gerador_de_cpf)
	@Test
	public void CPFTeste2() {
		String cpf = "27531218852";
		Boolean resultadoEsperado = true;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf � v�lido (usando um outro cpf v�lido pego no
	// link: https://www.4devs.com.br/gerador_de_cpf)
	// O cpf v�lido seria esse: 72895887209
	@Test
	public void CPFTeste3() {
		String cpf = "72895887234";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se os caracteres especiais est�o sendo removidos
	@Test
	public void CaracterTeste() {
		String cpf = "632.820.720-40";
		String resultadoEsperado = "63282072040";
		CodigoPessoaFisica removeCaracteresEspeciais = new CodigoPessoaFisica();
		String resultadoReal = removeCaracteresEspeciais.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// segundo teste pra verificar se os caracteres especiais est�o sendo removidos
	@Test
	public void CaracterTeste2() {
		String cpf = "315.456.436-52";
		String resultadoEsperado = "31545643652";
		CodigoPessoaFisica removeCaracteresEspeciais = new CodigoPessoaFisica();
		String resultadoReal = removeCaracteresEspeciais.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// extra: teste pra verificar se os numeros s�o repetidos
	@Test
	public void CPFTesteNumRepetido() {
		String cpf = "000000000";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
	// extra: teste pra verificar se os numeros s�o repetidos
		@Test
		public void CPFTesteNumeroAMais() {
			String cpf = "1234567891234";
			Boolean resultadoEsperado = false;
			CodigoPessoaFisica CPF = new CodigoPessoaFisica();
			Boolean resultadoReal = CPF.validaCPF(cpf);
			assertEquals(resultadoEsperado, resultadoReal);

		}

}
