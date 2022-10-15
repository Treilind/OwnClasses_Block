public class Bank {

    public static void main(String[] args) {
        Gehaltskonto konto1 = new Gehaltskonto("Thorsten", "AT123456789", "BAWATWW");
        Gehaltskonto konto2 = new Gehaltskonto("Max", "AT987654321", "EASYYY");
        Gehaltskonto konto3 = new Gehaltskonto("Hubert", "AT456789123", "RAIFAI");

        Gehaltskonto konto4 = new Gehaltskonto("John Doe", "iban", "bic");
        
        Gehaltskonto[] konten = new Gehaltskonto[4];
        
        konten[0] = konto1;
        konten[1] = konto2;
        konten[2] = konto3;
        konten[3] = konto4;

        konto1.aufbuchen(600);
        konto2.aufbuchen(1000);
        konto3.aufbuchen(1500);

        for (int i = 0; i < konten.length; i++) {
            System.out.println("Konto" + (i+1) + ": " + konten[i].toString());
            
        }
        
        //übungen mit static
        System.out.println("Gehaltskonto.counter = " + Gehaltskonto.counter);
        
        
        
    }
}
