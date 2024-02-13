package tareaprogramacion.uno;

/*Tarea Repaso Clases - HerenciaElabore un diagrama de clases para la empresa de transporte 
“La carreta” específicamente del módulo de asociados, donde cada asociado al suscribirse proporciona su nombre,
 número de identificación, email, número de celular y los datos de su vehículo el cual es clasificado acorde a 
  tamaño, por lo que de cada vehículo se registra la placa, modelo, marca y color. Adicionalmente si el vehículo
   es de carga se debe indicar la capacidad de carga y el número de ejes del vehículo. En caso de que el vehículo 
   sea un vehículo de pasajeros se debe indicar el número máximo de pasajeros que puede transportar.      */
public class asociado {

    private String nombre;
    private String numerodIdentificacion;
    private String email;
    private String numeroDecel;
    private vehiculo vehiculo;

    public asociado(String nombre, String numerodIdentificacion, String email, String numeroDecel, vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.nombre = nombre;
        this.numerodIdentificacion = numerodIdentificacion;
        this.email = email;
        this.numeroDecel = numeroDecel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setNumeroDecel(String numeroDecel) {
        this.numeroDecel = numeroDecel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumerodIdentificacion() {
        return numerodIdentificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroDecel() {
        return numeroDecel;
    }

}
