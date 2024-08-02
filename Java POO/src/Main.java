//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutomovilEjemplo auto = new AutomovilEjemplo("Ford","Fiesta","Amarillo", 150, 30);

        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerarFrenar(3000));
        System.out.println("Kilometros por litro: " + auto.calcularConsumo(40, 0.7f));
        System.out.println("Kilometros por litro: " + auto.calcularConsumo(40, 70));

        //Cambiandole el valor al atributo estatica
        AutomovilEjemplo.setMotor("RX-190");

        String objString = auto.toString();
        System.out.println("objString = " + objString);

        AutomovilEjemplo nissan = new AutomovilEjemplo("Nissan", "Tsuru", "Gris", 100, 25);
        System.out.println(nissan.verDetalle());

        AutomovilEjemplo chevrolet = new AutomovilEjemplo("Chevrolet", "Chevy", "Negro", 120, 20);
        System.out.println(chevrolet.verDetalle());
    }
}