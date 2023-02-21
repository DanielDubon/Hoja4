package model;

public class StackFactory {
    private static StackFactory instance;

    private StackFactory() {}

    public static StackFactory getInstance() {
        if (instance == null) {
            instance = new StackFactory();
        }
        return instance;
    }

    public Stack createStack(String type) {
        switch (type) {
            case "arrayList":
                return new ArrayListStack();
            case "vector":
                return new VectorStack();
            case "linked":
                return new LinkedStack();
            default:
                throw new IllegalArgumentException("Invalid stack type: " + type);
        }
    }
}
