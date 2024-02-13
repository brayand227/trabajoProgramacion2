package tareaprogramacion.uno;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        vehiculoPasajero vehiculoPasajero = new vehiculoPasajero("str345", "Toyota", "Rojo", 25);
        asociado asociado = new asociado("Brayan", "1127766", "brgfbf", "33434", vehiculoPasajero);

        System.out.println(asociado.getVehiculo().getMarca());
    }
}
