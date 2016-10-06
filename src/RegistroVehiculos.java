/**
 * Created by usu26 on 03/10/2016.
 */

import java.util.*;

public class RegistroVehiculos {

    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }
    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7

    public Coche obtenerVehiculo(String matricula) {
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
        /*
        return coches.stream()
                .filter(coche -> coche.getMatricula().equals(matricula))
                .findFirst().get();
        */
    }

    public void eliminarVehiculo(String matricula) {
        Coche aux = null;
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                aux = coche;
            }
        }
        if (aux != null) {
            coches.remove(aux);
        }

        // coches.removeIf(coche -> coche.getMatricula().equals(matricula));

    }


    public Coche obtenerVehiculoPrecioMax() {
        Coche max = null;
        for (Coche coche : coches) {
            if (max == null) {
                max = coche;
            } else if (coche.getPrecio() > max.getPrecio()) {
                max = coche;
            }
        }
        return max;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> aux = new ArrayList<>();
        for (Coche coche : coches) {
            if (coche.getMarca().equals(marca)) {
                aux.add(coche);
            }
        }
        return aux;

    }

    public List<Coche> obtenerTodos() {
        List<Coche> aux = new ArrayList<>(coches);

        return aux;
    }
}