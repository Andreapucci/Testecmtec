public class Questao1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        inverterDiagonais(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inverterDiagonais(int[][] matriz) {
        int tamanho = matriz.length;


        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[tamanho - 1 - i][tamanho - 1 - i];
            matriz[tamanho - 1 - i][tamanho - 1 - i] = temp;
        }


        for (int i = 0; i < tamanho / 2; i++) {
            int temp = matriz[i][tamanho - 1 - i];
            matriz[i][tamanho - 1 - i] = matriz[tamanho - 1 - i][i];
            matriz[tamanho - 1 - i][i] = temp;
        }
    }
}