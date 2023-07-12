package day32_stringBuilder;

public class C04_SubSequence {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Kayra");
        sb.substring(0,3);
        // Bu method String dondurdugu icin StringBuilder'in eski halini degisstiremez
        System.out.println(sb.substring(0, 3));
        System.out.println(sb);
        System.out.println(sb.subSequence(0, 3));
        System.out.println(sb);
    }
}
