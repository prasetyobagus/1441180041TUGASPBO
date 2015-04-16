class testMobil {
	public static void main(String[] args) {
		mobil pram = new mobil();

		System.out.println("merk		=" +pram.getmerk());
		System.out.println("platNomor	=" +pram.getplatNomor());
		System.out.println("warna 		=" +pram.getwarna());
		System.out.println("mesin		=" +pram.getmesin() +"cc");
		System.out.println("kecepatan	=" +pram.getkecepatan() +"km");
		pram.maju();
		System.out.println(" ");	

	 mobil dom = new mobil("Chevrolet","P8888WA");

		System.out.println("merk		=" +dom.getmerk());
		System.out.println("platNomor	=" +dom.getplatNomor());
		dom.mundur();
		System.out.println(" ");


	mobil brian = new mobil("LykanSport","L3434PW","Hitam");

		System.out.println("merk		=" +brian.getmerk());
		System.out.println("platNomor 	=" +brian.getplatNomor());
		System.out.println("warna  		=" +brian.getwarna());
		brian.berhenti();
		System.out.println(" ");


	mobil letty = new mobil("MiniChoper","L33WT","Hitam",2000);

		System.out.println("merk		=" +letty.getmerk());
		System.out.println("platNomor 	=" +letty.getplatNomor());
		System.out.println("warna  		=" +letty.getwarna());
		System.out.println("mesin   	=" +letty.getmesin() +"cc");
		letty.belok();
		System.out.println(" ");

	mobil han = new mobil("Gallardo","DK444R","Putih",2500,450);

		System.out.println("merk		=" +han.getmerk());
		System.out.println("platNomor 	=" +han.getplatNomor());
		System.out.println("warna  		=" +han.getwarna());
		System.out.println("mesin   	=" +han.getmesin() +"cc");
		System.out.println("kecepatan	=" +han.getkecepatan() +"km"); 
		han.ngebut();
		System.out.println(" ");
	

	
}
}