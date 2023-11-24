package latihanTugas;

public class HukumOHM {

	private float kuatArus;
	private float hambatan;
	
	public void baterai1(float hambatan) {
		this.hambatan = hambatan;;

	}
	
	public float getKuatArus() {
		return kuatArus;
	}
	
	public float getHambatan(){
		return hambatan;
	}
	
	public void hitungTegangan(float kuatArus) {
		this.kuatArus = kuatArus;
	}
	
	public float baterai(float kuatArus, float hambatan) {
		return kuatArus * hambatan;
	}
	
	public static void main(String[] args) {
		
		HukumOHM hitung = new HukumOHM();
		hitung.baterai1(3);
		hitung.hitungTegangan(12);
		
		 System.out.println(
	                "Kuat arus yang mengalir pada suatu kawat penghantar \nakan berbanding lurus dengan beda potensial \npada ujung-ujung kawat penghantar tersebut \nasalkan suhu kawat dijaga konstan.\n");

		
		System.out.println("Kuat arus : "+hitung.getHambatan()+ " ampere");
		System.out.println("Hambatan  : "+hitung.getKuatArus()+ " ohm");
		
		System.out.println("Hasil tegangan : "+ hitung.baterai(hitung.getHambatan(), hitung.getKuatArus()) + "volt");
		
		
	}
}


