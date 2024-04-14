public class StackOfInteger {
    private DoubleLinkedListOfInteger list;

    public StackOfInteger() {
        list = new DoubleLinkedListOfInteger();
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeByIndex(list.size() - 1);
    }

    public Integer push(Integer element) {
        list.add(element);
        return element;
    }

    public Integer top() {
        if (isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
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
}
