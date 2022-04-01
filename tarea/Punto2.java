class punto2 {
    public static void main(String[] args) {
        int i, posAct, posSig, longitudArreglo, comparador = 0;// buffer;
        boolean HayOrden = false;

        int[] arreglo = new int[6];
        posAct = 0;
        posSig = 0;
        longitudArreglo = arreglo.length;
        for (i = 0; i < longitudArreglo - 1; i++) {
            arreglo[i] = (int) (Math.random() * 10);

        }

        while (HayOrden == false) {
            for (i = 0; i < longitudArreglo - 1; i++) {
                posAct = arreglo[i];
                if (i != longitudArreglo - 1) {
                    posSig = arreglo[i + 1];
                    // buffer = posAct;
                    if (posAct >= posSig) {
                        arreglo[i] = posSig;
                        arreglo[i + 1] = posAct;

                    }
                }

            }
            for (i = 0; i < longitudArreglo - 1; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    comparador++;
                    break;
                } else {
                    break;
                }
            }
            if (comparador == longitudArreglo - 1) {
                HayOrden = true;
            }
        }
        if (HayOrden == true) {
            System.out.println("Los numeros ordenados son: ");
            for (i = 0; i < longitudArreglo; i++) {
                System.out.println(arreglo[i]);
            }
        }

    }
}
