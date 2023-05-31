package day10_stringManipulation;

public class C07_IndexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        //  System.out.println(str.indexOf("e",2));


// yukaridaki str da 2.ve 3.e nin indexlerini bulun
        //2. e yi bulabilmek için 1. e nin index ine ihtiyacim var
        int ilkE=str.indexOf("e");
        int ikinciE=str.indexOf("e",ilkE+1);
        System.out.println(ilkE);
        System.out.println(ikinciE);

        //eger 2. e varsa 3. e nin olup olmadigini
        // ve varsa index ini yazdiralim


        if (ikinciE==-1){
            System.out.println("satirda 2.e yoktur");
        } else  {
            int ucuncuE=str.indexOf("e",ikinciE+1);
            if (ucuncuE==-1){
                System.out.println("satirda 3.e yoktur");
            }else System.out.println("3.e nin index i : "+ucuncuE);
        }
    }
}
