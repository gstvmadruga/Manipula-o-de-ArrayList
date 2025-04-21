import Manipulacao;

public class AdicionarExibirNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("Deseja adicionar outro número? (s/n): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
