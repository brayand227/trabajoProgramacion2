package tareaprogramacion.uno;

/*su vehículo el cual es clasificado acorde a 
  tamaño, por lo que de cada vehículo se registra la placa, modelo, marca y color. Adicionalmente si el vehículo
   es de carga se debe indicar la capacidad de carga y el número de ejes del vehículo. En caso de que el vehículo 
   sea un vehículo de pasajeros se debe indicar el número máximo de pasajeros que puede transportar.  */

public class vehiucloCarga extends vehiculo {

    private int caapacidadDeCarga;
    private int numeroEjes;

    public vehiucloCarga(String placa, String marca, String color, int caapacidadDeCarga, int numeroEjes) {
        super(placa, marca, color);
        this.caapacidadDeCarga = caapacidadDeCarga;
        this.numeroEjes = numeroEjes;
    }

    public int getCaapacidadDeCarga() {
        return caapacidadDeCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

}
