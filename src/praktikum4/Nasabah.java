package praktikum4;

//nampung nama nasabah
public class Nasabah {
	public String namaDepan;
	public String namaBelakang;
	public Tabungan tabungan;
	
	public Nasabah(String namaDepan, String namaBelakang) {
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
	}
	public String getnamaDepan() {
		return namaDepan;
	}
	public String getnamaBelakang() {
		return namaBelakang;
	}
	public Tabungan getTabungan() {
		return tabungan;
	}
	public void setTabungan (Tabungan tabungan) {
		this.tabungan = tabungan;
	}


}
