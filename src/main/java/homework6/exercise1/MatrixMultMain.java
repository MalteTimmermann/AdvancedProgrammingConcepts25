package homework6.exercise1;

public class MatrixMultMain {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] result = new MatrixMultMain().multiplyMatrices(matrixA, matrixB);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];
        DotProductThread[][] threads = new DotProductThread[rowsA][colsB];

        for( int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int[] row = matrixA[i];

                int[] col = new int[rowsB];
                for( int c = 0; c < rowsB; c++) {
                    col[c] = matrixB[c][j];
                }

                threads[i][j] = new DotProductThread(row, col);
                threads[i][j].start();
            }
        }

        for( int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                result[i][j] = threads[i][j].getDot();
            }
        }

        return result;
    }
}

/*
    Mit run() würde ebenfalls die Methode in der Klasse DotProductThread aufgerufen werden, jedoch im klassischen Sinne (Synchron im selben Thread). Mit run() wird die Methode in einem
    neuen Thread asynchron aufgerufen (echte Parallelität)

    Das ist ein gutes Beispiel um Threads zu benutzen, da jede Ergebniszelle unabhängig und parallel berechnet werden kann. Vorteile erlangt man jedoch erst bei sehr großen Matrizen. Bis dahin
    ist der Overhead der Threaderstellung höher als die Zeitersparnis durch die Parallelität.
 */
