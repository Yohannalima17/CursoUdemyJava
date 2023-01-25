package fundamentos;

public class Aula220822 {
    public static void main(String[] args) {

        // Desafio operadores binários
        int a = 6 * (3+2);
        int b = (int) Math.pow(a, 2);
        int c = b / (3*2);

        int d = (1-5) * (2-7);
        int e = (int) Math.pow((d/2), 2);

        int f = (int) Math.pow((c-e), 3);
        int g = (int) Math.pow(10, 3);

        int resultado = f / g;

        System.out.println(resultado);

        // Operadores lógicos
        boolean cond01 = true;
        boolean cond02 = false;

        // && = AND
        System.out.println(cond01 && cond02);
        // || = OR
        System.out.println(cond01 || cond02);
        // ^ = XOR
        System.out.println(cond01 ^ cond02);

        // Desafio operadores lógicos
        boolean trabalho01 = false;
        boolean trabalho02 =  false;

        if (trabalho01 && trabalho02) {
            System.out.println("TV 50'");
        }else if(trabalho01 ^ trabalho02) {
            System.out.println("TV 32'");
        }else {
            System.out.println("Sem TV");
        }

        // Operador ternários
        double media = 6.5;
        String result = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(result);
    }
}
