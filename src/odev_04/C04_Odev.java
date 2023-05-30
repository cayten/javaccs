package odev_04;

public class C04_Odev {
    public static void main(String[] args) {
        /*
   Problem tanımı :
   Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
   Test Data:
   input: "aabbcccccddddaaa"
   output: abcd
*/

        birDefa("aabbcccccddddaaa");


    }
    public static void birDefa(String yazi){

        String bosluk="";
        for (int i = 0; i <yazi.length() ; i++) {

            if (!bosluk.contains(yazi.substring(i,i+1))){
                bosluk+=yazi.substring(i,i+1);

            }

        }

        System.out.println(bosluk);
    }

    }

