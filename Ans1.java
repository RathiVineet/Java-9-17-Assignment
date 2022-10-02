interface Calculation{

    private static float division(float a, float b){
        return a/b;
    }

    static void calculate(float a,float b){
        System.out.println(division(a,b));

    }
}

public class Ans1 {
    public static void main(String[] args) {
        Calculation.calculate(12.0f,3.0f);
    }

}
