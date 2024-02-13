package tareaprogramacion.uno;

/*  su vehículo el cual es clasificado acorde a 
  tamaño, por lo que de cada vehículo se registra la placa, modelo, marca y color. Adicionalmente si el vehículo
   es de carga se debe indicar la capacidad de carga y el número de ejes del vehículo. En caso de que el vehículo 
   sea un vehículo de pasajeros se debe indicar el número máximo de pasajeros que puede transportar.  */

public abstract class vehiculo {
    private String placa;
    private String marca;
    private String color;

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public vehiculo(String placa, String marca, String color) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
