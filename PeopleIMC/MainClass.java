
public class MainClass {
    public static void main(String[] args) {

        People people01 = new People();

        people01.setName("Cruz");
        people01.setAge(39);
        people01.setHeight(1.86);
        people01.setPound(105.5);

        People people02 = new People("Flor", 1, 0.75, 8.5 );

        System.out.println("------------");

        System.out.println( people02.presentation() + "Imc da " + people02.getName() + " é " + people02.calcularImc() + " - IMC Classific.   " + people02.classificaImc());
        System.out.println( people01.presentation() + "Imc da " + people01.getName() + " é " + people01.calcularImc() + " - IMC Classisic.   " + people01.classificaImc());
    }
}