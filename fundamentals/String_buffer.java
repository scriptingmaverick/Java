public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        sb.setLength(15);

        sb.insert(5, ",");
        System.out.println("After insertion: " + sb);

        sb.delete(5, 6);
        System.out.println("After deletion: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replacement: " + sb);

        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
