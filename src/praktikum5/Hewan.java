package praktikum5;

//super class
public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
	//function kosong
}
//sub class/ anak
class Cat extends Hewan{
	String warna;
	int berat;
	
	public void identitas(String namaKucing, String warnaKucing, int beratKucing ) {
		Cat.name= namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
		
		
	}
	public void eat () {
		System.out.println(Cat.name+" Makan wishkes");
		//memanggil cat.nama
	}
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}
