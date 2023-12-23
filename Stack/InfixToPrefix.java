public class InfixPrefix {
    private char stack[];
    private int tos;
    private int maxSize;

    // Constructor to initialize the stack
    public InfixPrefix(int size) {
        stack = new char[size];
        maxSize = size;
        tos = -1;
    }

    private void push(char e) {
        if (!isFull()) {
            tos++;
            stack[tos] = e;
        } else {
            System.out.println("Stack overflow");
        }
    }

    private char pop() {
        if (!isEmpty()) {
            char temp = stack[tos];
            tos--;
            return temp;
        } else {
            System.out.println("Stack underflow");
            return '\0'; // Return a default value in case of underflow
        }
    }

    private char peek() {
        if (!isEmpty()) {
            return stack[tos];
        } else {
            System.out.println("Stack is empty");
            return '\0'; // Return a default value for an empty stack
        }
    }

    private boolean isFull() {
        return tos == maxSize - 1;
    }

    private boolean isEmpty() {
        return tos == -1;
    }

    private void printStack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression:");
        String exp = sc.next();
        int size = exp.length();
        InfixPrefix obj = new InfixPrefix(size);
        String res = "";
        int flag = 0;

        for (int i = size - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                res = res + ch;
            } else {
                switch (ch) {
                    case ')':
                        obj.push(')');
                        break;
                    case '(':
                        while (obj.peek() != ')') {
                            res = res + obj.pop();
                        }
                        obj.pop(); // Pop '('
                        break;
                    case '+':
                    case '-':
                        flag = 1;
                        obj.push(ch);
                        break;
                    case '*':
                    case '/':
                        if (flag <= 2) {
                            obj.push(ch);
                        }
                        flag = 2;
                        break;
                }
            }
        }

        // Pop remaining operators from stack
        while (!obj.isEmpty()) {
            res = res + obj.pop();
        }

        // Reverse the result to get the correct prefix expression
        StringBuilder prefix = new StringBuilder(res);
        prefix.reverse();

        System.out.println("Prefix Expression: " + prefix.toString());

        // Close the scanner
        sc.close();
    }
}
