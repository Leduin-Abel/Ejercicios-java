class punto3 {
    public static void main(String[] args) {
        int i = 0;
        int[] arreglo = { 1, 2, 3, 4 };
        int longitudArreglo;

        longitudArreglo = arreglo.length;

        for (i = longitudArreglo - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);

        }

    }
}