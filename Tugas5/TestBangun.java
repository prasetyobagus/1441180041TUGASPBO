class TestBangun
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("::: L I N G K A R A N :::");
		Lingkaran col = new Lingkaran();
		
		col.r = 5;
						
		col.cetakKeLayar();

		System.out.println("Luas: " + col.hitungLuas());
		System.out.println("Keliling: " + col.hitungKeliling());

		col.ubahProperty(15);
		
		System.out.println("Property baru:");
		col.cetakKeLayar();		

		System.out.println("Luas baru: " + col.hitungLuas());
		System.out.println("Keliling: " + col.hitungKeliling());
		
		System.out.println();
		System.out.println("::: S E G I T I G A :::");
		Segitiga bangunku = new Segitiga();
		
		bangunku.alas = 5;
		bangunku.tinggi = 10;
				
		bangunku.cetakKeLayar();

		System.out.println("Luas: " + bangunku.hitungLuas());
		System.out.println("Keliling: " + bangunku.hitungKeliling());

		bangunku.ubahProperty(15, 24);
		
		System.out.println("Property baru:");
		bangunku.cetakKeLayar();		

		System.out.println("Luas baru: " + bangunku.hitungLuas());
		System.out.println("Keliling: " + bangunku.hitungKeliling());
	}
}