package day32_stringBuilder;

public class C07_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman guzel");
        sb.delete(8,9);
        System.out.println(sb);// Java herzaman guzel
        sb.deleteCharAt(8);
        System.out.println(sb);// Java heraman guzel
        // bastan baslayarak her loop'da ilk harfi silip kalani yazdiralim
        int son= sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }






}
