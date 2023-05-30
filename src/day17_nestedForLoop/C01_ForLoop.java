package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri

        // tekrarsiz olarak yazdirip

        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz


        String tekerleme="bir berber bir berbere gel beraber bir berber dukkani acalim demis";

        tekrarsizHarf(tekerleme);
    }

    public static void tekrarsizHarf(String deger) {

        String tekrarsizHarfler="";

        String bosluksuzTekerleme=deger.replaceAll("\\W","");

        for (int i = 0; i <bosluksuzTekerleme.length() ; i++) {
            if (!(tekrarsizHarfler.contains(bosluksuzTekerleme.substring(i,i+1)))){
                tekrarsizHarfler+=bosluksuzTekerleme.substring(i,i+1);
            }
        }
        System.out.println("tekrarsizHarfler = " + tekrarsizHarfler);
        System.out.println("tekrarsizHarflerin sayisi = " + tekrarsizHarfler.length());
    }
}

