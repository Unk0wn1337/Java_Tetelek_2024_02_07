
package tombnelkul;

import java.util.Scanner;




public class ElemiProgTetelek {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("szám: ");
        int s = sc.nextInt();
        System.out.println("S = "+ (s + 3));
        osszegzes();
        megszamlalas();
        szelsoErtekMin();
    
    }

    private static void osszegzes() {
        int n = -1;
        while(n < 0){
            System.out.print("n=");
            n = sc.nextInt();
        }
        
        int osszeg = 0;
        for (int i = 0; i < n+1; i++) {
            osszeg+=i;
        }
        System.out.printf("Az első %d db szám összege : %d\n",n,osszeg);
        
    }

    private static void megszamlalas() {
        int db = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 == 0){
                db ++;
            }
        }
        System.out.printf("ennyi páros szám van: %d\n",db);   
             
    }

    private static void szelsoErtekMin() {
        final int VEGE = 0;
        int db = 0;
        int min = Integer.MAX_VALUE;
        int szam;
        //VEGE = -1;
        System.out.println(VEGE+"-ra/re kilép:");
        while ((szam = sc.nextInt())!=VEGE ){
            if (szam < min){
                min = szam;
            }
            db++;     
           
        }
        System.out.printf("%d számból a legkisebb %d\n",db,min);    
    }
    
    
}
