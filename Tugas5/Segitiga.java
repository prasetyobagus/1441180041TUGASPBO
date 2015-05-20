public class Segitiga
{
	int alas;
	int tinggi;

	public void cetakKeLayar()
	{
		System.out.println("Alas: " + alas);
		System.out.println("Tinggi: " + tinggi);
	}

	public  void ubahProperty(int alasBaru, int tinggiBaru)
	{
		alas = alasBaru;
		tinggi = tinggiBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = 0.5 * alas * tinggi;	
		return luas;	
	}

	public int hitungKeliling()
	{
		int keliling;
		keliling = alas + tinggi;
		return keliling;
	}
}
