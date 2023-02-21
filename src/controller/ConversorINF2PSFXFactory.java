package controller;

import model.*;

import java.util.List;

public class ConversorINF2PSFXFactory {

        public static ConversorINF2PSFXFactory getConversor(String stackType, String listType) {
            Stack stack;
            List<Character> list;

            if (stackType.equals("array")) {
                stack = new ArrayListStack<>();
            } else if (stackType.equals("vector")) {
                stack = new VectorStack<>();
            } else {
                throw new IllegalArgumentException("Invalid stack type");
            }

            if (listType.equals("singly")) {
                list = new SinglyLinkedList<>();
            } else if (listType.equals("doubly")) {
                list = new DoublyLinkedList<>();
            } else {
                throw new IllegalArgumentException("Invalid list type");
            }

            stack = StackFactory.getInstance().createStack(stackType);

            ConversorINF2PSFXFactory factory = new ConversorINF2PSFXFactory(stack);
            ConversorINF2PSFX conversor = factory.getConversor();
            conversor.setList(list);
            return conversor;
        }


}
