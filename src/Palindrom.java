public class Palindrom {
    public static void main(String[] args) {
        String text = "Madam, I'm Adam!";
        String text1 = text.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(text1);
        StringBuffer buffer = new StringBuffer(text1);
        buffer.reverse();
        if (text1.equalsIgnoreCase(buffer.toString())) System.out.println(buffer);
        else System.out.println(buffer);;
    }
}
