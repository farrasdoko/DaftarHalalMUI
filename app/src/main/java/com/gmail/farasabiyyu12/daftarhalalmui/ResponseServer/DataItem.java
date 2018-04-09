package com.gmail.farasabiyyu12.daftarhalalmui.ResponseServer;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@SerializedName("produsen")
	private String produsen;

	@SerializedName("title")
	private String title;

	@SerializedName("nomor_sertifikat")
	private String nomorSertifikat;

	@SerializedName("berlaku_hingga")
	private String berlakuHingga;

	public void setProdusen(String produsen){
		this.produsen = produsen;
	}

	public String getProdusen(){
		return produsen;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setNomorSertifikat(String nomorSertifikat){
		this.nomorSertifikat = nomorSertifikat;
	}

	public String getNomorSertifikat(){
		return nomorSertifikat;
	}

	public void setBerlakuHingga(String berlakuHingga){
		this.berlakuHingga = berlakuHingga;
	}

	public String getBerlakuHingga(){
		return berlakuHingga;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"produsen = '" + produsen + '\'' + 
			",title = '" + title + '\'' + 
			",nomor_sertifikat = '" + nomorSertifikat + '\'' + 
			",berlaku_hingga = '" + berlakuHingga + '\'' + 
			"}";
		}
}