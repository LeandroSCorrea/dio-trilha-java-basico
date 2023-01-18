public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >=7 )
            System.out.println("Aprovado");
        
        else if (nota >= 5 && nota < 7)
        System.out.println("Prova Recuperação"); 
        
        else
            System.out.println("Reprovado");

        int nota1 = 5;

        String resultado = nota1 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        int nota2 = 6;

        String resultado1 = nota2 >= 7 ? "Aprovado" : nota2 >=5 && nota2 < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado1);
    }
}
