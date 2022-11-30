package soru4;

public class HesapIslemi {
	
	private IHesapla iHesapla;
	
	public HesapIslemi(IHesapla iHesapla)
	{
		this.iHesapla=iHesapla;
	}

	public String Hesap(double x)
	{
		return iHesapla.Hesapla(x);
	}
}
