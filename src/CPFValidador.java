import static org.junit.Assert.*;

import org.junit.Test;

public class CPFValidador {

	// teste pra verificar se o cpf é válido (usando o cpf válido que estava na
	// explicação)
	@Test
	public void CPFTeste() {
		String cpf = "11144477735";
		Boolean resultadoEsperado = true;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf é válido (usando o cpf inválido que estava na
	// explicação)
	@Test
	public void CPFTeste1() {
		String cpf = "11144477701";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf é válido (usando um outro cpf válido pego no
	// link: https://www.4devs.com.br/gerador_de_cpf)
	@Test
	public void CPFTeste2() {
		String cpf = "27531218852";
		Boolean resultadoEsperado = true;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se o cpf é válido (usando um outro cpf válido pego no
	// link: https://www.4devs.com.br/gerador_de_cpf)
	// O cpf válido seria esse: 72895887209
	@Test
	public void CPFTeste3() {
		String cpf = "72895887234";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// teste pra verificar se os caracteres especiais estão sendo removidos
	@Test
	public void CaracterTeste() {
		String cpf = "632.820.720-40";
		String resultadoEsperado = "63282072040";
		CodigoPessoaFisica removeCaracteresEspeciais = new CodigoPessoaFisica();
		String resultadoReal = removeCaracteresEspeciais.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// segundo teste pra verificar se os caracteres especiais estão sendo removidos
	@Test
	public void CaracterTeste2() {
		String cpf = "315.456.436-52";
		String resultadoEsperado = "31545643652";
		CodigoPessoaFisica removeCaracteresEspeciais = new CodigoPessoaFisica();
		String resultadoReal = removeCaracteresEspeciais.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// extra: teste pra verificar se os numeros são repetidos
	@Test
	public void CPFTesteNumRepetido() {
		String cpf = "000000000";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica CPF = new CodigoPessoaFisica();
		Boolean resultadoReal = CPF.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);

	}
	
	// extra: teste pra verificar se os numeros são repetidos
		@Test
		public void CPFTesteNumeroAMais() {
			String cpf = "1234567891234";
			Boolean resultadoEsperado = false;
			CodigoPessoaFisica CPF = new CodigoPessoaFisica();
			Boolean resultadoReal = CPF.validaCPF(cpf);
			assertEquals(resultadoEsperado, resultadoReal);

		}

}
