//package latihanTugas;
//import java.util.Scanner;
//
//public class Tabungan {
//	public static void main(String[]args) {
//	int saldo1, saldo2, hasil;
////	private int saldo;
//	
////	public void tabungan() {
////		this.saldo = saldo;
//		Scanner input = new Scanner (System.in);
//		//input user
//		System.out.println("====Program penarikan uang====");
//		System.out.print("Masukan saldo awal :");
//		saldo1 = input.nextInt();
//		System.out.print("Jumlah uang yang diambil :");
//		saldo2 = input.nextInt();
//		
//		hasil = saldo1 - saldo2;
//		System.out.println("Saldo anda sekarang :"+ hasil);
//		
//	}
//}
package latihanTugas;
import java.util.Scanner;

public class Tabungan {
		
		private int saldo;
		
		public void tabungan(int saldo) {
			this.saldo = saldo;

		}
		
		public int ambilUang(int jumlah) {
			int hasil = this.saldo - jumlah;
			return hasil;
		}
	public static void main (String[] args) {
		
		
		Tabungan saving = new Tabungan();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan saldo Awal : ");
		int saldo = input.nextInt();
		saving.tabungan(saldo);
		
		
		System.out.print("Jumlah uang yang diambil : " );
		int ambilSaldo = input.nextInt();
		int sisaSaldo = saving.ambilUang(ambilSaldo);

		System.out.print("Saldo : "+saldo + "\n");
		System.out.print("Jumlah uang yang diambil : "+ambilSaldo+ " \n" );
		System.out.print("Saldo Anda Sekarang  : " + sisaSaldo);

		

	}
}