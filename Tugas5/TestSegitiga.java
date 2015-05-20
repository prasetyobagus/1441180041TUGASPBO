public class TestSegitiga
{
	public static void main(String[] args)
	{
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
