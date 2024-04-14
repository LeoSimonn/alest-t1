public class QueueOfInteger {
    private DoubleLinkedListOfInteger list;

    public QueueOfInteger() {
        list = new DoubleLinkedListOfInteger();
    }

    public Integer enqueue(Integer element) {
        list.add(element); // Adiciona no final da lista
        return element;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeByIndex(0); // Remove do começo da lista
    }

    public Integer head() {
        if (isEmpty()) {
            return null;
        }
        return list.get(0); // Pega o primeiro elemento
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public void enqueuePriority(Integer element) {
        if (isEmpty() || element.compareTo(head()) >= 0) {
            enqueue(element); // Insere normalmente se a fila está vazia ou se o elemento é maior ou igual ao primeiro
        } else {
            // Procura a posição correta para inserir
            int i = 0;
            while (i < size() && element.compareTo(list.get(i)) < 0) {
                i++;
            }
            list.add(i, element); // Insere o elemento na posição correta
        }
    }
}
