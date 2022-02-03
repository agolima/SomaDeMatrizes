public class SomaMatrizes {
	public static void main(String[] args) throws Exception {

		int matriz1[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
		int matriz2[][] = { { 4, 5, 6 }, { 6, 5, 4 } };

		int total = soma(matriz1, matriz2);

		System.out.println(total);

	}

	public static int soma(int matriz1[][], int matriz2[][]) throws Exception {
		int soma = 0;

		int tamanho1 = tamanhoArray(matriz1);
		int tamanho2 = tamanhoArray(matriz2);

		if (tamanho1 > tamanho2 || tamanho2 > tamanho1) {
			throw new Exception("Matrizes com dimensões diferentes não podem ser somadas.");

		} else {

			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					soma += matriz1[i][j] + matriz2[i][j];
				}
			}
		}

		return soma;

	}

	public static int tamanhoArray(int matriz[][]) {
		int tamanho = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				tamanho++;

			}
		}

		return tamanho;

	}
}