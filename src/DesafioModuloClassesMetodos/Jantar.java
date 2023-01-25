package DesafioModuloClassesMetodos;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Yohanna", 65);
        Comida c1 = new Comida("Arroz", 0.3);
        Comida c2 = new Comida("Feijão", 0.5);

        System.out.println("Peso anterior: "+ p.peso);
        p.comer(c1);
        System.out.println("Peso atual 01: "+ p.peso);
        p.comer(c2);
        System.out.println("Peso atual 02: "+ p.peso);
    }
}
