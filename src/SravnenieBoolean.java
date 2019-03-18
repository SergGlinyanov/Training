        import java.security.MessageDigest;

        public class SravnenieBoolean {

            public static void main(String[] args) throws Exception {
                boolean ffff = booleanExpression(false, false, false, false);
                boolean ffft = booleanExpression(false, false, false, true);
                boolean fftf = booleanExpression(false, false, true, false);
                boolean fftt  = booleanExpression(false, false, true, true); //Searching for this

                boolean ftff = booleanExpression(false, true, false, false);
                boolean ftft = booleanExpression(false, true, false, true); //Searching for this
                boolean fttf = booleanExpression(false, true, true, false); //Searching for this
                boolean fttt = booleanExpression(false, true, true, true);

                boolean tfff = booleanExpression(true, false, false, false);
                boolean tfft = booleanExpression(true, false, false, true); //Searching for this
                boolean tftf = booleanExpression(true, false, true, false); //Searching for this
                boolean tftt = booleanExpression(true, false, true, true);

                boolean ttff = booleanExpression(true, true, false, false); //Searching for this
                boolean ttft = booleanExpression(true, true, false, true);
                boolean tttf = booleanExpression(true, true, true, false);
                boolean tttt = booleanExpression(true, true, true, true);

                System.out.println("ffff " + ffff);
                System.out.println("ffft " + ffft);
                System.out.println("fftf " + fftf);
                System.out.println("fftt " + fftt + " <- ");

                System.out.println("ftff " + ftff);
                System.out.println("ftft " + ftft + " <- ");
                System.out.println("fttf " + fttf + " <- ");
                System.out.println("fttt " + fttt);

                System.out.println("tfff " + tfff);
                System.out.println("tfft " + tfft + " <- ");
                System.out.println("tftf " + tftf + " <- ");
                System.out.println("tftt " + tftt);

                System.out.println("ttff " + ttff + " <- ");
                System.out.println("ttft " + ttft);
                System.out.println("tttf " + tttf);
                System.out.println("tttt " + tttt);

            }
            public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
                if (a==true && b==true && c==false && d==false) return true;
                if (a==true && b==false && c==true && d==false) return true;
                if (a==true && b==false && c==false && d==true) return true;
                if (a==false && b==true && c==true && d==false) return true;
                if (a==false && b==true && c==false && d==true) return true;
                if (a==false && b==false && c==true && d==true) return true;
                else return false;
            }
        }
