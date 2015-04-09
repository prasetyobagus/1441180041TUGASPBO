class TestLaptop {

	public static void main(String[] args) {
		
	
	// instansiasi objek

	// cara instance

	// namaClass namaObjek = new namaKonstruktor()
	
	laptop dom  = new laptop();
	laptop letty  = new laptop("Thosiba", "Hitam" );
	laptop brian = new laptop("Lenovo", "Biru", "Terhubung" );
	laptop han = new laptop("Fujitsu", "Merah", "Terhubung", 90);

	han.menyala();
	System.out.println("merk :" +han.getMerk()+ "warna :" +han.getWarna()+ "wifi :" +han.getiwifi()+ "baterai :" +han.getBaterai());
	han.mati();

	System.out.println(" ");
}
}