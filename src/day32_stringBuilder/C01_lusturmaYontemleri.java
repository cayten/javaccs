package day32_stringBuilder;

public class C01_lusturmaYontemleri {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java candir");
        StringBuilder sb3=new StringBuilder(10);
        System.out.println(sb.length());//
        System.out.println(sb.capacity());//
        System.out.println(sb2.length());//
        System.out.println(sb2.capacity());//
        System.out.println(sb2.append(" inanin"));//
        System.out.println(sb3.length());//
        System.out.println(sb3.capacity());//
        sb3.append("iyi yasa");
        System.out.println(sb3);
    }
}
