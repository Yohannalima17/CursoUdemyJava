package fundamentos;

public class Aula190822 {
    public static void main(String[] args) {

        // Transformar um 'DOUBLE' em 'FLOAT'
        float a = 1.0F;
        System.out.println(a);

        float b = (float) 1.0;
        System.out.println(b);

        // Integer -> String
        Integer c = 10;
        System.out.println(c.toString());

        int d = 100;
        System.out.println(Integer.toString(d));

        // String -> Número
        String e = "18";
        int f = Integer.parseInt(e);
        System.out.println(f);

    }
}
