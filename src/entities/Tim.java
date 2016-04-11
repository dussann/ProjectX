package entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTima;
	
	private String nazivTima;
	private int brojPobeda;
	private int brojPoraza;
	
	@OneToMany(mappedBy = "tim")
	private List<Igrac> igraci;
	
	@OneToMany(mappedBy = "tim")
	private List<CudoNevidjeno> cudoNevidjeno;

	public Tim() {
	}

	public Tim(int idTima, String nazivTima) {
		this();
		this.idTima = idTima;
		this.nazivTima = nazivTima;
	}
	
	public List<CudoNevidjeno> getCudoNevidjeno() {
		return cudoNevidjeno;
	}

	public void setCudoNevidjeno(List<CudoNevidjeno> cudoNevidjeno) {
		this.cudoNevidjeno = cudoNevidjeno;
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

	public int getIdTima() {
		return idTima;
	}

	public void setIdTima(int idTima) {
		this.idTima = idTima;
	}

	public String getNazivTima() {
		return nazivTima;
	}

	public void setNazivTima(String nazivTima) {
		this.nazivTima = nazivTima;
	}

	public int getBrojPobeda() {
		return brojPobeda;
	}

	public void setBrojPobeda(int brojPobeda) {
		this.brojPobeda = brojPobeda;
	}

	public int getBrojPoraza() {
		return brojPoraza;
	}

	public void setBrojPoraza(int brojPoraza) {
		this.brojPoraza = brojPoraza;
	}

}
