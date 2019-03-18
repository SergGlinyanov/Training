import java.util.Arrays;

public class SortirovkaMassiva {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int[] r = new int[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));
    }
}
