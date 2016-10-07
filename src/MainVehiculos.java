import java.util.ArrayList;
import java.util.List;

/**
 * Created by usu26 on 03/10/2016.
 */
public class MainVehiculos {
    public static void main(String[] args) {
        Coche Jaguar = new Coche("1234ENG", "Jaguar", "TheRoadIsYours", 200000);
        Coche BMW = new Coche("9065AME", "BMW", "LoveAtFirstDrive", 60000);
        Coche Lexus = new Coche("5638DDD", "Lexus", "FastAndGlorious", 120000);
        Coche Austin = new Coche("3564GER", "Austin", "BeLikeBond", 150000);
        Coche RomeoAlfaJulietta = new Coche("4749JAV", "RomeoAlfaJulietta", "DramaMasterpiece", 12000);

        RegistroVehiculos registro = new RegistroVehiculos();
        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Austin);
        registro.registrarVehiculo(RomeoAlfaJulietta);
        // Debes comprobar que el HashSet no permite duplicados
        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println(registro.obtenerTodos());

        Coche coche = registro.obtenerVehiculo("4749JAV");
        if (coche != null) {
            System.out.println("Coche con matrícula: " + coche);
        }


        List<Coche> coche_marca_list = new ArrayList<>(registro.obtenerVehiculosMarca("Lexus"));

        for(Coche coche_marca : coche_marca_list){
            System.out.println("Coche con marca Lexus: "+ coche_marca);

        }
//        registro
//                .obtenerVehiculosMarca("Lexus")
//                // esto es un bucle tradicional expresado con Java 8
//                .forEach(
//                        coche -> System.out.println(coche)
//                );

        Coche max = registro.obtenerVehiculoPrecioMax();
        if (max != null) {
            System.out.println("Coche Max precio: " + max);
        }

        System.out.println("Eliminando coche con matricula 1234ENG");
        registro
                .eliminarVehiculo("1234ENG");

        System.out.println(registro.obtenerTodos());

    }
}