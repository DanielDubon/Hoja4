package controller;

public class ConversorINF2PSFXFactory {

    public ConversorINF2PSFXFactory getInfixToPostfix(String type) {
        if (type.equalsIgnoreCase("arrayList")) {
            return new ConversorINF2PSFXFactory(new StackArrayList());
        } else if (type.equalsIgnoreCase("vector")) {
            return new ConversorINF2PSFXFactory(new StackVector());
        } else if (type.equalsIgnoreCase("linked")) {
            return new ConversorINF2PSFXFactory(new StackLinkedList());
        } else {
            throw new IllegalArgumentException("Invalid stack type");
        }
    }
}
