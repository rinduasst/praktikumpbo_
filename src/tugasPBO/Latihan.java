package tugasPBO;

public class Latihan {
//	public double panjang;
//	public double lebar;
//	
//	public void setPanjang(double p) {
//		panjang=p;
//	}
//	public void setLebar(double l) {
//		lebar=l;
//	}
//	public double hitungLuas() {
//		return panjang*lebar;
//	}
//	public double hitungKeliling() {
//		return 2*(panjang+lebar);
//	}
//	
//	public static void main(String[]args) {
//		Latihan satu=new Latihan();
//		Latihan dua= new Latihan();
//		satu.setPanjang(5);
//		satu.setLebar(10);
//		dua.setPanjang(15);
//		dua.setPanjang(10);
//		System.out.print("luas "+satu.hitungLuas());
//		System.out.print(" keliling"+dua.hitungKeliling());
//	}
//
//}
	private String nama;
	public void setNama(String nama) {
		this.nama=nama;
	}
	public String getNama() {
		return nama;
	}
	public static void main(String[]args) {
		Latihan obj=new Latihan();
		obj.setNama("r");
		System.out.print("nama"+obj.getNama());
		
	}
}