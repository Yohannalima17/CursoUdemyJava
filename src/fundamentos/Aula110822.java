package fundamentos;

public class Aula110822 {
    public static void main(String[] args) {

        String s = "Boa noite!";
        //.toUpperCase 01
        System.out.println(s.toUpperCase());
        //.toUpperCase 02
        System.out.println("Boa noite!".toUpperCase());


        //.replace
        String x = "Boa noite!".replace("noite", "tarde");
        System.out.println(x);


        //.charAt
        System.out.println("Olá!".charAt(2));


        //.equals
        String y = "Boa tarde!";
        System.out.println(y.equals("boa tarde!"));
        //.equalsIgnoreCase
        System.out.println(y.equalsIgnoreCase("boa tarde!"));


        String nome = "Yohanna";
        String sobrenome = "Lima";
        int idade = 20;
        // %s - string
        // %d - int
        // %f - float
        System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d", nome, sobrenome, idade);
    }
}
