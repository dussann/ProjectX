package entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Igrac")
public class Igrac {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idIgraca;
	private String ime, prezime, departman;
	private int godine, brojGolova, brojIskljucenja;

	@ManyToOne(fetch = FetchType.EAGER)
	private Tim tim;

	public Igrac() {
	}

	public Igrac(int idIgraca, String ime, String prezime, String departman, int godine) {
		this();
		this.idIgraca = idIgraca;
		this.ime = ime;
		this.prezime = prezime;
		this.departman = departman;
		this.godine = godine;
		this.brojIskljucenja = 0;
		this.brojGolova = 0;
	}

	public int getIdIgraca() {
		return idIgraca;
	}

	public void setIdIgraca(int idIgraca) {
		this.idIgraca = idIgraca;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public int getBrojGolova() {
		return brojGolova;
	}

	public void setBrojGolova(int brojGolova) {
		this.brojGolova = brojGolova;
	}

	public int getBrojIskljucenja() {
		return brojIskljucenja;
	}

	public void setBrojIskljucenja(int brojIskljucenja) {
		this.brojIskljucenja = brojIskljucenja;
	}

	public Tim getTim() {
		return tim;
	}

	public void setTim(Tim tim) {
		this.tim = tim;
	}

}
