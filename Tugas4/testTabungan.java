class testTabungan {
	public static void main(String[] args) {
		tabungan pram = new tabungan();

		System.out.println("simpanan 	=" +pram.setsimpanan());
		System.out.println("pemilikRek 	=" +pram.setpemilikRek());
		System.out.println("noRek 		=" +pram.getnoRekening());
		System.out.println("bunga 		=" +pram.getbunga());
		pram.menabung();
		System.out.println(" ");




tabungan akbar = new tabungan("AkbarYusrofi","Mandiri");

		System.out.println("simpanan 	=" +akbar.setsimpanan());
		System.out.println("pemilikRek 	=" +akbar.setpemilikRek());
		akbar.mengambil();
		System.out.println(" ");



tabungan isam = new tabungan("isam","BRI",144118069);
		
		System.out.println("simpanan 	=" +isam.setsimpanan());
		System.out.println("pemilikRek 	=" +isam.setpemilikRek());
		System.out.println("noRek 		=" +isam.getnoRekening());
		isam.transfer();
		System.out.println("");



tabungan faiz = new tabungan("faiz","BNI",1441180166,70);

		System.out.println("simpanan 	=" +faiz.setsimpanan());
		System.out.println("pemilikRek 	=" +faiz.setpemilikRek());
		System.out.println("noRek 		=" +faiz.getnoRekening());
		System.out.println("bunga 		=" +faiz.getbunga());
		faiz.menerimaTransfer();
		System.out.println(" ");
	





	}

}