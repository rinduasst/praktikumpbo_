package praktikum4;
import java.util.Scanner;
public class Kalkulator {		
		int angka1, angka2, hasil, perhitungan;
		
		public void perhitungan (int perhitungan) {
			Scanner input = new Scanner (System.in);
			if (perhitungan == 1) {
				System.out.println("--- Penjumlahan ---");
				System.out.println("Masukan Angka 1 : ");
				angka1 = input.nextInt();
				System.out.print("Masukan Angka 2 : ");
				angka2 = input.nextInt();
				hasil = angka1 + angka2 ;
				System.out.println("Hasil = "+hasil);
				
			} else if (perhitungan == 2) {
				System.out.println ("--- Pengurangan ---");
				System.out.print ("Masukan Angka 1 : ");
				angka1 = input.nextInt ();
				System.out.print("Masukan Angka 2 : ");
				angka2 = input.nextInt ();
				hasil = angka1 - angka2;
				System.out.println ("Hasil = "+hasil);
				
			} else if (perhitungan == 3) {
				System.out.println ("--- Perkalian ---");
				System.out.print ("Masukan Angka 1 : ");
				angka1 = input.nextInt ();
				System.out.print("Masukan Angka 2 : ");
				angka2 = input.nextInt ();
				hasil = angka1 * angka2;
				System.out.println ("Hasil = "+hasil);
				
			} else if (perhitungan == 4) {
				System.out.println ("--- Pembagian ---");
				System.out.print ("Masukan Angka 1 : ");
				angka1 = input.nextInt ();
				System.out.print("Masukan Angka 2 : ");
				angka2 = input.nextInt ();
				hasil = angka1 / angka2;
				System.out.println ("Hasil = "+hasil);
				
			} else {
				System.out.println ("--- Module ---");
				System.out.print ("Masukan Angka 1 : ");
				angka1 = input.nextInt ();
				System.out.print("Masukan Angka 2 : ");
				angka2 = input.nextInt ();
				hasil = angka1 % angka2;
				System.out.println ("Hasil = "+hasil);
			}
		}
	}


