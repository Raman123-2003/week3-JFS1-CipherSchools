interface MathX {
    void add(int n1, int n2);
void substract(int n1,int n2);
}

class ProgramOne implements MathX {
    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

public class Test3 {
    public static void main(String[] args) {
        // Case 1
        ProgramOne obj1 = new ProgramOne();
        obj1.add(10, 20);

        // Case 2
        MathX obj2 = (int x, int y) -> {
            System.out.println(x + y);
        };
        obj2.add(10, 20);
    }
}
