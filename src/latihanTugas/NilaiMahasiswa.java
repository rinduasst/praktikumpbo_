package latihanTugas;
import java.util.Scanner;

public class NilaiMahasiswa {
	public static void main(String[]args) {	
		Scanner input = new Scanner (System.in);
		char grade;
		final double quiz, uts, uas, n_akhir;
		System.out.println("====Menghitung nilai akhir mahasiswa====");
		System.out.print("QUIZ:");
		quiz = input.nextInt();
		System.out.print("UTS:");
		uts = input.nextInt();
		System.out.print("UAS:");
		uas = input.nextInt();
		n_akhir = (0.20*quiz + 0.30*uts + 0.50*uas);
		System.out.println( " \nnilai akhir "+n_akhir);

		if (n_akhir >80 && n_akhir <=100 ) {
			grade ='A';
		}
		else if (n_akhir >68 && n_akhir <80 ) {
			grade ='B';
		}
		else if (n_akhir >56 && n_akhir <68 ) {
			grade ='C';
		}
		else if (n_akhir >45 && n_akhir <56 ) {
			grade ='D';
		}
		else  {
			grade ='E';
		}
		
		
		if(grade == 'A'){
			System.out.print("\nIndex :" +grade+ "\n"+ "Keterangan : Sangat Baik");
		}
		else if ( grade == 'B') {
			System.out.print( "\nIndex :" +grade+ "\n"+  "Keterangan :  Baik");
		}
		else if ( grade == 'C') {
			System.out.print( "\nIndex :" + grade + "\n"+ "Keterangan : Cukup");
		}
		else if ( grade == 'D') {
			System.out.print("\nIndex :" + grade + "\n"+ "Keterangan : Kurang");
		}
		else  {
			System.out.print("\nIndex :" + grade + "\n"+ "Keterangan : Sangat Kurang");
		}

				
	}
}
