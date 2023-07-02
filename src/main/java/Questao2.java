public class Questao2 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 4, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {4, 4, 4, 4}
        };

        int[][] submatrizB = {
                {4, 4},
                {4, 4}
        };

        int count = contarSubmatriz(matrizA, submatrizB);
        System.out.println("A submatriz B ocorre " + count + " vezes na matriz A.");
    }

    public static int contarSubmatriz(int[][] matrizA, int[][] submatrizB) {
        int count = 0;
        int rowsA = matrizA.length;
        int colsA = matrizA[0].length;
        int rowsB = submatrizB.length;
        int colsB = submatrizB[0].length;

        for (int i = 0; i <= rowsA - rowsB; i++) {
            for (int j = 0; j <= colsA - colsB; j++) {
                if (verificarSubmatriz(matrizA, submatrizB, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean verificarSubmatriz(int[][] matrizA, int[][] submatrizB, int startRow, int startCol) {
        int rowsB = submatrizB.length;
        int colsB = submatrizB[0].length;

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                if (matrizA[i + startRow][j + startCol] != submatrizB[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}