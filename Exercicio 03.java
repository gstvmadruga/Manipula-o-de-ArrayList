import Manipulacao;


public class SomaEMedia {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números (digite -1 para parar):");

        while (true) {
            System.out.print("Número: ");
            double numero = scanner.nextDouble();

            if (numero == -1) {
                break;
            }

            numeros.add(numero);
        }

        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }

        double media = 0;
        if (!numeros.isEmpty()) {
            media = soma / numeros.size();
        }

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
