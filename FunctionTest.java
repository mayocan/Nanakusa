import java.util.Scanner;

class FunctionTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float X;
        float Y;
        X = sc.nextFloat();
        Y = sc.nextFloat();
        float M = Squer(X, Y);
        System.out.println("The answer is " + M);
    }
    static float Squer(float x, float y){
        float s = x * y;

        return s ;
    }
    
}

