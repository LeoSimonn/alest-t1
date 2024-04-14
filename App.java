public class App {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();

        // Adiciona elementos na pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Usando os métodos da pilha
        System.out.println("\n");
        System.out.println("Demonstração dos métodos da classe StackOfInteger:");
        System.out.println("Elemento no topo da pilha: " + stack.top()); // Deve mostrar 30
        System.out.println("Elemento removido: " + stack.pop()); // Deve remover e mostrar 30
        System.out.println("Tamanho atual da pilha: " + stack.size()); // Deve mostrar 2
        System.out.println("A pilha está vazia? " + stack.isEmpty()); // Deve mostrar false
        stack.clear();
        System.out.println("A pilha está vazia após limpar? " + stack.isEmpty()); // Deve mostrar true

        // Demonstração do método reverseArrayUsingStack
        int[] array = { 1, 2, 3, 4, 5 };
        int[] reversedArray = reverseArrayUsingStack(array);
        System.out.print("Array invertido: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }

        /*****************************************************************************************/

        QueueOfInteger queue = new QueueOfInteger();

        // Adicionando elementos na fila
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Demonstração dos métodos da fila
        System.out.println("\n");
        System.out.println("Demonstração dos métodos da classe QueueOfInteger: ");
        System.out.println("Head da fila: " + queue.head()); // Deve mostrar 10
        System.out.println("Removido da fila: " + queue.dequeue()); // Deve remover e mostrar 10
        System.out.println("Tamanho atual da fila: " + queue.size()); // Deve mostrar 2
        System.out.println("A fila está vazia? " + queue.isEmpty()); // Deve mostrar false
        queue.clear();
        System.out.println("A fila está vazia após limpar? " + queue.isEmpty()); // Deve mostrar true

        // Demonstração do método enqueuePriority
        queue.enqueuePriority(50);
        queue.enqueuePriority(40);
        queue.enqueuePriority(60);
        queue.enqueuePriority(45);
        System.out.println("Fila após inserções prioritárias: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " "); // Deve imprimir os elementos em ordem: 40, 45, 50, 60
        }

    }

    public static int[] reverseArrayUsingStack(int[] array) {
        StackOfInteger stack = new StackOfInteger();
        for (int item : array) {
            stack.push(item);
        }
        int[] reversedArray = new int[array.length];
        int index = 0;
        while (!stack.isEmpty()) {
            reversedArray[index++] = stack.pop();
        }
        return reversedArray;
    }

}