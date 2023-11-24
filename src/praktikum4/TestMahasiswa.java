package praktikum4;
import java.util.Scanner;
public class TestMahasiswa {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		
		System.out.print("Masukan nama:");
		nama = input.next();
		System.out.print("Masukan npm:");
		npm = input.nextInt();
		
		Mahasiswa murid = new Mahasiswa();
		murid.setNama("Rindu");
		murid.setNpm(19);
		
		System.out.println("Nama Mahasiswa :"+ murid.nama
				+"\nNpm Mahasiswa:"+ murid.npm);
	}
}
