public class People {
    // Atributes
    private String name;
    private int age;
    private double height;
    private double pound;

    public People() {
        this.name = "no name";
        this.age = 0;
        this.height = 0.0;
        this.pound = 0.0;

    }
    // Construction with atributes
    public People(String name, int age, double height, double pound) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.pound = pound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPound() {
        return pound;
    }

    public void setPound(double pound) {
        this.pound = pound;
    }
// Methods

    public double calcularImc() {
        return pound / (height * height);
    }

    public String classificaImc() {
        double imc = calcularImc();

        if (imc < 18.00) return " Low pound";
        if (imc < 25.00) return " normal pound";
        if (imc < 30.00) return " Over pound";
        return " Fat Or Muscle :-)  ";
    }

    public String presentation() {
        return "Hello, my name is; " + name + ", i am " + age + " age, and pound " + pound + " Kg, and hight " + height ;
    }

}
