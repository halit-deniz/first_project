public class odev4a {

    public static double[][] matrisToplam(double[][] A, double[][] B) {
        double[][] sonuc = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sonuc[i][j] = A[i][j] + B[i][j];
            }
        }
        return sonuc;
    }

    public static double[][] matrisCarpim(double[][] A, double[][] B) {
        double[][] sonuc = new double[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                sonuc[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    sonuc[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return sonuc;
    }

    public static double[][] matrisTranspoz(double[][] A) {
        double[][] sonuc = new double[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sonuc[j][i] = A[i][j];
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        double[][] A = {
            {4, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        double[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        double[][] toplam = matrisToplam(A, B);
        System.out.println("Matris Toplamı:");
        matrisYazdir(toplam);

        double[][] carpim = matrisCarpim(A, B);
        System.out.println("Matris Çarpımı:");
        matrisYazdir(carpim);

        double[][] transpoz = matrisTranspoz(A);
        System.out.println("Matris Transpozu:");
        matrisYazdir(transpoz);
    }

    public static void matrisYazdir(double[][] matris) {
        for (double[] satır : matris) {
            for (double eleman : satır) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
