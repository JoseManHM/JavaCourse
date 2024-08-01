public class AutomovilEjemplo {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 30;

    public AutomovilEjemplo(){

    }

    public AutomovilEjemplo(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque){
        //Llamamos otro constructor
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante: " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpms";
    }

    public String frenar(){
        return "El auto " + this.fabricante + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + " " + frenar;
    }

    public float calcularConsumo(int km, float litrosGasolina){
        return km/(this.capacidadTanque * litrosGasolina);
    }

    public float calcularConsumo(int km, int litrosGasolina){
        return km/(this.capacidadTanque *(litrosGasolina/100f));
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "AutomovilEjemplo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
