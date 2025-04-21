import Manipulacao;

public class ContarOcorrencias {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.print("\nDigite um número para contar as ocorrências: ");
        int numeroBusca = scanner.nextInt();

        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBusca) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroBusca + " aparece " + contador + " vez(es) na lista.");

        scanner.close();
    }
}
