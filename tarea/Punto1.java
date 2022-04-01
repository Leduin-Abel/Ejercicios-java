import java.util.*;

class punto1 {

    public static void main(String[] args) {
        int longitudArreglo, i, posAct, posSig;
        int[] arreglo = { 1, 3, 2, 4, 5, 6 };
        boolean EsAscendente = true;
        longitudArreglo = arreglo.length;
        for (i = 0; i < longitudArreglo - 1; i++) {
            posAct = arreglo[i];
            posSig = arreglo[i + 1];
            if (posAct > posSig) {
                System.out.println("El array no es ascendente\n");
                EsAscendente = false;
                break;

            }
        }
        if (EsAscendente == true) {

            System.out.println("El array es ascendente");
        }
    }
}