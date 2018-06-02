package br.com.fsg.desafioalgoritmo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as
 * seguintes regras:
 * 
 * - O primeiro número de C é o primeiro número de A;
 * 
 * - O segundo número de C é o primeiro número de B;
 * 
 * - O terceiro número de C é o segundo número de A;
 * 
 * - O quarto número de C é o segundo número de B;
 * 
 * Assim sucessivamente...
 * 
 * - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o
 * restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser
 * 15012256.
 * 
 * - Caso C seja maior que 1.000.000, retornar -1
 * 
 * @author Fernando-Godoy
 *
 */
public class NumberGenerator {

	public Integer run(Integer valorA, Integer valorB) {
		validate(valorA);
		validate(valorB);
		List<String> valoresA = Arrays.asList(valorA.toString().split(""));
		List<String> valoresB = Arrays.asList(valorB.toString().split(""));
		StringBuilder sb = concat(valoresA, valoresB);
		Integer C = Integer.valueOf(sb.toString());
		return C > 1000000 ? -1 : C;
	}

	private StringBuilder concat(List<String> valoresA, List<String> valoresB) {
		List<String> diff = getExcedentes(valoresA, valoresB);
		Integer index = getMaxIndex(valoresA, valoresB);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < index; i++) {
			sb.append(valoresA.get(i));
			sb.append(valoresB.get(i));
		}
		for (String item : diff) {
			sb.append(item);
		}
		return sb;
	}

	private Integer getMaxIndex(List<String> valoresA, List<String> valoresB) {
		return valoresA.size() < valoresB.size() ? valoresA.size() : valoresB.size();
	}

	private List<String> getExcedentes(List<String> valoresA, List<String> valoresB) {
		Integer minIndex = getMaxIndex(valoresA, valoresB);
		if (valoresA.size() > valoresB.size()) {
			return valoresA.subList(minIndex, valoresA.size());
		}
		return valoresB.subList(minIndex, valoresB.size());
	}

	private void validate(Integer valor) {
		Optional.ofNullable(valor).orElseThrow(() -> new IllegalArgumentException("Não é permitido valor null"));
	}

}
