package praktikum4;
import java.util.Scanner;
public class TestKalkulator {
	
		
		public static void main (String [] args) {
			// inisialisasi
			int operasi;
			int loop;
			Scanner operasiScanner  = new Scanner (System.in);
			Scanner loop_input = new Scanner (System.in);
			Scanner input = new Scanner (System.in);
			
			Kalkulator hitung = new Kalkulator ();
			
			//data diri
			System.out.println ("Nama : Rindu Astuti");
			System.out.println ("Kelas : Reguler A");
			System.out.println ("Prodi : Teknik Informatika");
			
			
			System.out.print ("\nMasukan perulangan : ");
			loop = loop_input.nextInt();
			int x = 0 ;
			do {
				System.out.println ("\nMasukan Perhitungan yang ingin dilakukan : "
				 + "\n 1 : pertambahan"
				 + "\n 2 : pengurangan"
				 + "\n 3 : perkalian"
				 + "\n 4 : pembagian"
				 + "\n 5 : module");
				System.out.print("Operasi yang akan di hitung : ");
				operasi = operasiScanner.nextInt();
				hitung.perhitungan(operasi);
				System.out.print("=========================================");
				x++;
			} while (x<=loop) ;
			
			System.out.println ("======== Arigatou Gozaimasu ========");
			
		}

	}


