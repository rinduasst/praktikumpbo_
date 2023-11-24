package praktikum4;

public class TestTabungan2 {
	//Nama : Muhamad Farhan Rajab
	//NPM : 191106041495
	//Kelas : Reguler A

	
		public static void main(String[]args) {
			int tmp;
			boolean status = true;
//			tampilan awal
			Nasabah Nasabah = new Nasabah("Farhan","Rajab");
			System.out.println("Nasabah Atas Nama : "
					+ Nasabah.getnamaDepan()+" "
					+ Nasabah.getnamaBelakang()
					+"\n" + "---------------------------------");
			
			Nasabah.setTabungan(new Tabungan(5000));
			tmp = Nasabah.getTabungan().getSaldo();
			System.out.println("Saldo Awal : " + tmp
							+ "\n" + "---------------------------------");
//			testing 1		
			Nasabah.getTabungan().simpanUang(3000);
			System.out.println("Jumlah uang yang disimpan : 3000");
			
			Nasabah.getTabungan().ambilUang(6000);
			System.out.print("Jumlah uang yang diambil : 6000");

			if(status)
				System.out.println("  OK"
						+ "\n" + "---------------------------------");
			else
				System.out.println("  GAGAL"
						+ "\n" + "---------------------------------");
//			testing 2
			Nasabah.getTabungan().simpanUang(3500);
			System.out.println("Jumlah uang yang disimpan : 3500");
			
			Nasabah.getTabungan().ambilUang(4000);
			System.out.print("Jumlah uang yang diambil : 4000");
			
			if(status)	
				System.out.println("  OK"
						+ "\n" + "---------------------------------");
			else
				System.out.println("  GAGAL"
						+ "\n" + "---------------------------------");
//			testing 3	
			status = Nasabah.getTabungan().ambilUang(1600);
			System.out.print("Jumlah uang yang diambil : 1600");
			
			if(status)
				System.out.println("  OK"
						+ "\n" + "---------------------------------");
			else
				System.out.println("  GAGAL"
						+ "\n" + "---------------------------------");
//			testing 4
			Nasabah.getTabungan().simpanUang(2000);
			System.out.println("Jumlah uang yang disimpan : 2000"
					+ "\n" + "---------------------------------");
//			hasil	
			tmp = Nasabah.getTabungan().getSaldo();
			System.out.println("Saldo Sekarang : " + tmp);
			
		}
	}

}
