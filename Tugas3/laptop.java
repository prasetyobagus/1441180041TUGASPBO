class laptop {
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;


	public laptop()
	{
	
	merk = "Thosiba";
	warna = "Hitam";
	wifi = "Terhubung";
	baterai = 50;
	
	}

	public laptop(String merk, String warna)
	{
	
	merk = merk;
	warna = warna;

	}
	public laptop(String merk, String warna, String wifi)
	{
	
	merk = merk;
	warna = warna;
	wifi = wifi;

	}
	public laptop(String merk, String warna, String wifi, int baterai)
	{

	merk = merk;
	warna = warna;
	wifi = wifi;
	baterai = baterai;
	}



	public void menyala()
	{
		System.out.print("Welocome to Laptop");
	}

	public void mati()
	{
		System.out.print("Thankyou have a nice day");
	}

	public void indikatorBaterai()
	{
		System.out.print("Baterai tinggal: " +baterai +"%");
	}	

	public void indikatorWifi()
	{
		System.out.print("Wifinya : " +wifi);
	}

	public String getMerk()
	{
		return merk;
	}
	
	public String getWarna()
	{
		return warna;
	}
	
	public String getWifi()
	{
		return wifi;
	}
	
	public int getBaterai()
	{
		return baterai;
	}

	public void setMerk(String a)
	{
		merk = a;
	}
	public void setWarna(String b)
	{
		warna = b;
	}
	public void setWifi(String c)
	{
		wifi = c;
	}
	public void setBaterai(int d)
	{
		baterai = d;
	}
}