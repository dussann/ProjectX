package entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CudoNevidjeno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCudaNevidjenog;

	private int brojGolova;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Tim tim;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Utakmica utakmica;

	public CudoNevidjeno() {
	}

	public int getIdCudaNevidjenog() {
		return idCudaNevidjenog;
	}

	public void setIdCudaNevidjenog(int idCudaNevidjenog) {
		this.idCudaNevidjenog = idCudaNevidjenog;
	}

	public Tim getTim() {
		return tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

	public int getBrojGolova() {
		return brojGolova;
	}

	public void setBrojGolova(int brojGolova) {
		this.brojGolova = brojGolova;
	}

}
