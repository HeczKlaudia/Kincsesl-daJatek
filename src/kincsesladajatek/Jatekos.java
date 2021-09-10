package kincsesladajatek;

import java.util.Scanner;

public class Jatekos {
    public Scanner sc = new Scanner(System.in);
    Jatekos j1;
    int tipp;
    
    void tippel(){
        j1 = new Jatekos();
        
        System.out.println("A tipped: " + tipp);
        tipp = sc.nextInt();
        
    }
}
