public class ArrayReversal {

    /**
     * Inverte a ordem dos elementos de um vetor de caracteres de forma recursiva.
     *
     * @param arr O vetor a ser invertido.
     */
    public static void reverseArray(char[] arr) {
        reverseArrayHelper(arr, 0, arr.length - 1);
    }

    /**
     * Método auxiliar recursivo que realiza a inversão do vetor.
     *
     * @param arr O vetor a ser invertido.
     * @param start O índice inicial.
     * @param end O índice final.
     */
    private static void reverseArrayHelper(char[] arr, int start, int end) {
        // Caso base: se os índices se cruzarem, pare a recursão
        if (start >= end) {
            return;
        }

        // Troca os elementos nas posições start e end
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Chama recursivamente para os próximos elementos
        reverseArrayHelper(arr, start + 1, end - 1);
    }

    /**
     * Método principal para testar a inversão do vetor.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'd'};
        System.out.println("Vetor original: " + java.util.Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Vetor invertido: " + java.util.Arrays.toString(arr));
    }
}
