package latihanTugas;
//
//public class EmasKawin {
//	private int hargaPerGram = 540000;
//	double mahar;
//	
//	public void setMahar (double setMahar) {
//		this.mahar = mahar;
//	}
//
//	public double getMahar() {
//		return mahar;
//	}
//	public double mahar (double totalahar) {
//		totalahar = mahar * hargaPerGram;
//		return totalahar;
//	}
//	public static void main (String []args) {
//		EmasKawin Maharnya = new EmasKawin();
//		Maharnya.setMahar(15.7);
//		System.out.print("Biaya yg harus dikeluarkan adalah="+Maharnya.getMahar());
//				
//	}
//}
public class EmasKawin {

    private double hargaPerGram;
    private double beratPerGram;

    public double getHarga() {
        return hargaPerGram;
    }

    public void setHarga(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }

    public double getBerat() {
        return beratPerGram;
    }

    public void setBerat(double beratPerGram) {
        this.beratPerGram = beratPerGram;
    }

    public double hitungHargaEmas(double hargaPerGram, double beratPerGram){
        this.beratPerGram = beratPerGram;
        this.hargaPerGram = hargaPerGram;

        return hargaPerGram * beratPerGram;
    }

    public static void main(String[] args) {
        EmasKawin mahar = new EmasKawin();
        mahar.setBerat(15.7);
        mahar.setHarga(570000);
        System.out.println("Biaya yg harus dikeluarkan adalah : Rp."+mahar.hitungHargaEmas(mahar.getBerat() , mahar.getHarga()));
    }
}
