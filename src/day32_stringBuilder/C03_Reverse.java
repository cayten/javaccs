package day32_stringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun
        System.out.println(tersineCevir("ne gunlerdi o gunler for loop kullanirdik tersine cevirmek icin"));
    }
    public static String tersineCevir(String input){
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();
    }
}
