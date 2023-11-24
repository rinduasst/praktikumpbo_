package praktikum4;
import java.util.Scanner;
public class TestTabungan {
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	int saldo, tariktunai;
	
	System.out.println("Maasukan saldo:");
	saldo = input.nextInt();
	Tabungan atm = new Tabungan(saldo);
	System.out.println("Saldo anda:"+atm.saldo);
	
	System.out.println("Masukan nominal tarik tunai:");
	tariktunai = input.nextInt();
	atm.ambilUang(tariktunai);
	System.out.println("Jumlah saldo yang diambil :"+ tariktunai);
	
	System.out.println("Saldo saat ini:"+atm.saldo);
	}
}
