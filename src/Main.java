import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         class AsciiCharSequence implements CharSequence/* extends/implements */ {
             private ArrayList<Byte> _charSequence = new ArrayList<Byte>();

             public AsciiCharSequence(byte[] bytes) {
                 for (int i = 0; i < bytes.length; i++) {
                     _charSequence.add(bytes[i]);
                 }

             }

             @Override
             public String toString() {
                 StringBuilder sb = new StringBuilder();
                 for (int i = 0; i < _charSequence.size(); i++) {
                     sb.append(this.charAt(i));
                 }
                 return sb.toString();
             }

             @Override
             public int length() {

                 return _charSequence.size();
             }

             @Override
             public char charAt(int index) {
                 return (char)(byte)_charSequence.get(index);
             }

             @Override
             public CharSequence subSequence(int start, int end) {
                 byte[] tempArrayByte = new byte[end-start];
                 for (int i = 0; i < tempArrayByte.length; i++) {
                     tempArrayByte[i] = this._charSequence.get(start+i);
                 }
                 return new AsciiCharSequence(tempArrayByte);
             }
         }
    }
}