package praktikum4;

public class Bank {
	private Nasabah [ ] nasabah;
	private int jumlahNasabah;
	
	public Bank() {
		nasabah = new Nasabah [4];
		jumlahNasabah = 0;
	}
	public void tambahNasabah(String namaDepan, 
			String namaBelakang) {
		int i = jumlahNasabah++;
		nasabah[i] = new Nasabah (namaDepan, 
				namaBelakang);
	}
	public int getJumlahNasabah() {
		return jumlahNasabah;
	}
	public Nasabah getnasabah (int indeks) {
		return nasabah[indeks];
	}

}
