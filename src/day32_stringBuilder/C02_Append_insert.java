package day32_stringBuilder;

public class C02_Append_insert {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        System.out.println(sb);//Java daha ne yapsin?
        sb.append(true);
        System.out.println(sb);//Java daha ne yapsin?true
        sb.append(5);
        System.out.println(sb);//Java daha ne yapsin?true5
        sb.append("canan",2,5);
        System.out.println(sb);//Java daha ne yapsin?true5nan
        System.out.println("cananayten "+sb);//canan Java daha ne yapsin?true5nan
        sb.insert(0,"canan",0,5);
        System.out.println(sb);//
        sb.insert( 5,"ile cuneyt",0,10);
        System.out.println(sb);//
    }
}
