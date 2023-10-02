package zenbaki_digitoak_kontatu;

import java.util.*; //Java liburutegia inportatzen

public class zenbaki_digitoak_kontatu {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Sartu zenbaki positibo bat: ");
        int zenbakia = sc.nextInt();
        
        if (zenbakia < 0) {
        	int positibo_bihurtu = zenbakia * -1;
        	
        	int digituak = (int)(Math. log10(positibo_bihurtu)+1);
        	System.out.println("digitu katiatea: " + digituak);
        }
        
        else if (zenbakia == 0) {
        	System.out.println("digitu katiatea: 1");
        }
        
        else {
        	int digituak = (int)(Math. log10(zenbakia)+1);
        	System.out.println("digitu katiatea: " + digituak);
        }
        
        sc.close();
        
	}

}
