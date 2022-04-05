import java.*;
import java.util.HashMap;
import java.uti.Map;

public class MyMap {

    static void ImprimirMap(HashMap<Integer, String> mapaTrabajo) {

        for (HashMap.Entry<Integer, String> set : mapaTrabajo.entrySet()) {

            System.out.println("El Id de la persona es " + set.getKey() + " y su nombre es " + set.getValue());
        }

    }

    static void EliminarNombre(HashMap<Integer, String> mapaTrabajo, String nombre) {
        mapaTrabajo.values().remove(nombre);
        System.out.println("El mapa queda así: ");
        MyMap.ImprimirMap(mapaTrabajo);
    }

    static void EliminarKey(HashMap<Integer, String> mapaTrabajo, Integer key) {
        mapaTrabajo.remove(key);
        System.out.println("El mapa queda así: ");
        MyMap.ImprimirMap(mapaTrabajo);

    }

    static void InsertarNombre(HashMap<Integer, String> mapaTrabajo, String nombre) {
        boolean keyEstaOcupada = true;
        int key = 1;

        while (keyEstaOcupada == true) {
            keyEstaOcupada = mapaTrabajo.containsKey(key);

            if (keyEstaOcupada == true) {
                key++;
            }

            else {
                mapaTrabajo.put(key, nombre);
                System.out.println("El mapa queda así: ");
                MyMap.ImprimirMap(mapaTrabajo);
            }

        }
    }

    static void EliminarRepetidos(HashMap<Integer, String> mapaTrabajo) {
        int HashMapSize = mapaTrabajo.size();
        for (HashMap.Entry<Integer, String> set : mapaTrabajo.entrySet()) {
            for (int i = 1; i < HashMapSize; i++) {
                if (set.getKey() != i && set.getValue() == mapaTrabajo.get(i)) {
                    mapaTrabajo.remove(i);
                }
            }
        }
        System.out.println("El mapa queda así: ");
        MyMap.ImprimirMap(mapaTrabajo);

    }

    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();

        mapa.put(1, "Caroline");
        mapa.put(2, "Jill");
        mapa.put(3, "Nathan");
        mapa.put(4, "Crash");
        // mapa.put(5, "Crash");

        // MyMap.ImprimirMap(mapa);

        // MyMap.EliminarNombre(mapa, "Nathan");

        // MyMap.EliminarKey(mapa, 2);

        // MyMap.InsertarNombre(mapa, "Jaun");

        MyMap.EliminarRepetidos(mapa);

    }

}