import Manipulacao;


public class RemoverNomeDaLista {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.print("\nDigite o nome que deseja remover: ");
        String nomeRemover = scanner.nextLine();

        if (nomes.contains(nomeRemover)) {
            nomes.remove(nomeRemover);
            System.out.println("\nNome removido com sucesso.");
        } else {
            System.out.println("\nNome não encontrado na lista.");
        }

        System.out.println("\nLista atualizada de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
