class tabungan {

	 String simpanan;
	 String pemilikRek;
	 int noRekening;
	 int bunga;

	 public tabungan(){

	  simpanan			="BRI";
	  pemilikRek		="Pram";
	  noRekening		=1441180041;
	  bunga				=50;
	  	
	 }
	 public tabungan(String pemilikRekInput, String simpananInput){
	 	pemilikRek  	=pemilikRekInput;
	 	simpanan 	    =simpananInput;
	 } 
	 public tabungan(String pemilikRekInput, String simpananInput, int noRekeningInput){
	 	pemilikRek  	=pemilikRekInput;
	 	simpanan 	    =simpananInput;
	 	noRekening  	=noRekeningInput;
	 } 
	 public tabungan(String pemilikRekInput, String simpananInput, int noRekeningInput, int bungainput){
	 	pemilikRek  	=pemilikRekInput;
	 	simpanan 	    =simpananInput;
	 	noRekening  	=noRekeningInput;
	 	bunga 			=bungainput;
	 	
	 }


	public void menabung(){

		System.out.println("menabung");
	}
	public void mengambil(){

		System.out.println("Anda mengambil uang");
	}
	public void transfer(){

		System.out.println("Anda mentransfer uang");
	}
	public void menerimaTransfer()	{
		System.out.println("Anda menerima transfer");			
	}

	public String setpemilikRek(){
		return pemilikRek;
	}
	public String setsimpanan(){
		return simpanan;
	}
	public int getnoRekening(){
		return noRekening;
	}
	public int getbunga(){
		return bunga;
	}
	
}