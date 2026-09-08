public class Sistema {

    private static final double mediaMinima = 7;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double provaN1 = 8;
        double provaN2 = 7;

        double media = calcularMedia(provaN1, provaN2);
        String situacao = verificarSituacao(media);

        apresentarResultado(nomeAluno, media, situacao);
    }

    private static double calcularMedia(double provaN1, double provaN2) {
        return (provaN1 + provaN2) / 2;
    }

    private static String verificarSituacao(double media) {
        if (media >= mediaMinima) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    private static void apresentarResultado(String nomeAluno, double media, String situacao) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}