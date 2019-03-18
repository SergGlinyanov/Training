public class SlogenieNaturalnwhChisel {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        return a*10 + b*10 == c*10;
    }

}
