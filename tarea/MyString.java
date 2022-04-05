import java.*;
import java.util.ArrayList;

import org.jcp.xml.dsig.internal.dom.XmlWriter.ToMarshal;

public class MyString {

    String contenido = "Esto es una prueba";

    static void Reverse(String frase) {

        int i = 0;

        int longitudFrase = frase.length();
        char[] destino = new char[longitudFrase + 1];

        frase.getChars(0, longitudFrase, destino, 0);

        for (i = longitudFrase - 1; i >= 0; i--) {

            System.out.print(destino[i]);
        }

    }

    static void ReverseIndividual(String frase) {
        int i = 0;
        String[] fraseSeparada = frase.split("\\s+");
        int longitudFraseSeparada = fraseSeparada.length;

        for (i = 0; i < longitudFraseSeparada; i++) {
            MyString.Reverse(fraseSeparada[i]);
        }

    }

    static void EncontrarPalabra(String frase, String palabra) {
        int i = 0;
        boolean encontrar = false;

        encontrar = frase.contains(palabra);

        if (encontrar == true) {
            System.out.println("La palabra está en la frase");
        } else {
            System.out.println("La palabra no está en la frase");
        }

    }

    static void ContarLetrasyEspacios(String frase) {
        int letras = 0;
        int espacios = 0;

        for (char iteradorLetras : frase.toCharArray()) {
            if (iteradorLetras != ' ') {
                letras++;
            }
        }

        for (char iteradorEspacios : frase.toCharArray()) {
            if (iteradorEspacios == ' ') {
                espacios++;
            }

        }

        System.out.println("Hay " + letras + " letras " + " y " + espacios + " espacios");

    }

    static void ContarPalabras(String frase) {
        String[] palabras = frase.split("\\s+");

        int cuantasPalabras = palabras.length;

        System.out.println("Hay " + cuantasPalabras + " palabras");

    }

    static void EliminarDuplicados(String frase) {
        String[] fraseSeparada = frase.split("\\s+");

        int longitudFraseSeparada = fraseSeparada.length;

        String[] fraseSinDuplicados = new String[longitudFraseSeparada];

        int i = 0, j = 0;

        for (i = 0; i < longitudFraseSeparada; i++) {
            for (j = i + 1; j < longitudFraseSeparada; j++) {
                if (fraseSeparada[i].equals(fraseSeparada[j])) {
                    fraseSeparada[i] = "eliminame";

                }

            }

        }

        for (i = 0; i < longitudFraseSeparada; i++) {
            if (fraseSeparada[i].equals("eliminame")) {
                fraseSinDuplicados[i] = " ";
            } else {
                fraseSinDuplicados[i] = fraseSeparada[i];
            }

        }

        for (i = 0; i < longitudFraseSeparada; i++) {
            System.out.print(fraseSinDuplicados[i] + " ");
        }

    }

    public static void main(String[] args) {
        MyString str = new MyString();
        // String substr1 = "Hola";
        // String substr2 = "Adios";

        str.contenido = "Hola Hola esto es es una prueba prueba";

        // MyString.Reverse(str.contenido);

        // MyString.ReverseIndividual(str.contenido);

        // MyString.EncontrarPalabra(str.contenido, substr1);
        // MyString.EncontrarPalabra(str.contenido, substr2);

        // MyString.ContarLetrasyEspacios(str.contenido);

        // MyString.ContarPalabras(str.contenido);

        MyString.EliminarDuplicados(str.contenido);

    }
}