package Ordenação;

public class Pessoas {

    public Pessoas(String name, int age, double altura) {
        this.name = name;
        this.age = age;
        this.altura = altura;

    }

    String name;

    @Override
    public String toString() {
        return "Pessoas{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", altura=" + altura +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAltura() {
        return altura;
    }

    int age;

    double altura;


}
