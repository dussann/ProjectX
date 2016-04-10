package entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utakmica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // AutoIncrement
	private int idUtakmice;
	private Date datum;
	
	@OneToMany(mappedBy = "utakmica")
	private List<CudoNevidjeno> cudaNevidjena;

	public Utakmica() {
	}

	public int getIdUtakmice() {
		return idUtakmice;
	}

	public void setIdUtakmice(int idUtakmice) {
		this.idUtakmice = idUtakmice;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public List<CudoNevidjeno> getCudaNevidjena() {
		return cudaNevidjena;
	}

	public void setCudaNevidjena(List<CudoNevidjeno> cudaNevidjena) {
		this.cudaNevidjena = cudaNevidjena;
	}

}
