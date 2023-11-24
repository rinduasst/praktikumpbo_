package praktikum1;
import java.util.Scanner;
public class Latihan {
		public	static void main(String args[]) {
			//inisialisasi scanner input 
			Scanner input = new Scanner(System.in);
			String namaDepan,  namaBelakang, fullName, npm;
			
			System.out.print("Nama Depan :");
			namaDepan = input.next();
			System.out.print("Nama Belakang :");
			namaBelakang = input.next();
			fullName = namaDepan +" "+ namaBelakang;
			System.out.print("Npm :");
			npm = input.next();
			
			System.out.println("\nNama :"+ fullName);
			System.out.println("Npm :"+npm+"\n");
			//inisialisasi variable 
			int angka1, angka2, hasil;
			
			
			// user input
			System.out.print("Masukan angka 1 :");
			angka1 = input.nextInt();
			
			System.out.print("Masukan angka 2 :");
			angka2 = input.nextInt();
			// perhitungan hasil
			hasil = angka1 + angka2;
			//output
			System.out.print("Hasil :" + hasil);
			
			//bedanya print = satu baris dan println = tampilannya beda baris
			//ss = windows+fn+f11
		
		}
}
