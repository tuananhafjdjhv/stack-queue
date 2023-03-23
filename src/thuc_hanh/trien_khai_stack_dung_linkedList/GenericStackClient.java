package thuc_hanh.trien_khai_stack_dung_linkedList;

public class GenericStackClient {
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size sau khi push: "+ stack.size());
        System.out.println("1.2. Các phần tử pop từ stack : ");
        while (! stack.isEmpty()){
            System.out.println(" %s "+ stack.pop());
        }
        System.out.println("\n 1.3. Size sau khi pop từ stack : "+ stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size sau khi push"+ stack.size());
        System.out.println("2.1 Các phần tử pop từ stack");
        while (! stack.isEmpty()){
            System.out.println(" %d " +stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : "+ stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }

}
