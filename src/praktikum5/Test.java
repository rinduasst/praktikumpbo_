package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama kucing :");
		nama = input.next();
		System.out.print("Masukan warna kucing :");
		warna = input.next();
		System.out.print("Masukan berat kucing :");
		berat = input.nextInt();
		
		Cat kucingsaya = new Cat();
		kucingsaya.identitas(nama, warna, berat);
		System.out.println(kucingsaya.ambilNama()+" Si kucing, "
				+" warnanya "+kucingsaya.ambilWarna()+" beratnya "
				+kucingsaya.ambilBerat()+"kg.");
		kucingsaya.eat();
		
	}
}
