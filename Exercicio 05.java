import Manipulacao;


public class OrdenarLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite números inteiros (digite -1 para parar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("\nLista ordenada em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
