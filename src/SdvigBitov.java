import java.io.IOException;

public class SdvigBitov {
        public static void main(String[] args) throws IOException {
            System.out.println(SdvigBitov.flipBit(0,1));
        }

    public static int flipBit(int value, int bitIndex) {
        return bitIndex ^ 0 << value;// put your implementation here
    }
}
