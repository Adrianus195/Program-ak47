public class ak47Gun{
	
	//atribut
	String nama,jenis,model;
	int peluru,tahun;

	public void senjata(){
		System.out.println(" Ini adalah senjata " + nama);
		System.out.println(" Jenis 			  : " + jenis);
		System.out.println(" Model 			  : " + model);
		System.out.println(" Tahun Keluar		  : " + tahun);
	}

	public void menembak(){
		//akan mengurangi peluru
		System.out.println(" Sisa Peluru              : " + peluru);
	}

public static void main(String[]args){

		//bikin objek disini
		ak47Gun pistole = new ak47Gun();

		//bikin isi atau nilai dari atribut disini
		pistole.nama = "Senjata Ak47";
		pistole.jenis = "A-1003";
		pistole.model = "A-Series";
		pistole.peluru = 10000;
		pistole.tahun = 1997;

		//pemanggilan method
		pistole.senjata();
		pistole.menembak();
	}
}