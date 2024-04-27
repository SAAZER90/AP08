package cntsid.formation.ap08;

import java.sql.Timestamp;


public class Wilaya {
    private long id;
    private boolean actif;
    private long compteCreation ;
    private long compteMaj;
    private java.sql.Timestamp dateCreation;
    private java.sql.Timestamp dateMaj;
    private String nomArabe;
    private String nomLatin;
    private String nomTamazight;

   

    public Wilaya(long id, boolean actif, long compteCreation,long compteMaj, Timestamp dateCreation, Timestamp dateMaj,
			String nomArabe, String nomLatin, String nomTamazight) {
		super();
		this.id = id;
		this.actif = actif;
		this.compteCreation = compteCreation;
		this.compteMaj = compteMaj;
		this.dateCreation = dateCreation;
		this.dateMaj = dateMaj;
		this.nomArabe = nomArabe;
		this.nomLatin = nomLatin;
		this.nomTamazight = nomTamazight;
	}

	@Override
    public String toString() {
        return String.format("La wilaya %d - %s - %s - %s", id, nomArabe,nomLatin,nomTamazight);
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public long getCompteCreation() {
		return compteCreation;
	}

	public void setCompteCreation(long compteCreation) {
		this.compteCreation = compteCreation;
	}

	public java.sql.Timestamp getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(java.sql.Timestamp dateCreation) {
		this.dateCreation = dateCreation;
	}

	public java.sql.Timestamp getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(java.sql.Timestamp dateMaj) {
		this.dateMaj = dateMaj;
	}

	public String getNomArabe() {
		return nomArabe;
	}

	public void setNomArabe(String nomArabe) {
		this.nomArabe = nomArabe;
	}

	public String getNomLatin() {
		return nomLatin;
	}

	public void setNomLatin(String nomLatin) {
		this.nomLatin = nomLatin;
	}

	public String getNomTamazight() {
		return nomTamazight;
	}

	public void setNomTamazight(String nomTamazight) {
		this.nomTamazight = nomTamazight;
	}

	public long getCompteMaj() {
		return compteMaj;
	}

	public void setCompteMaj(long compteMaj) {
		this.compteMaj = compteMaj;
	}

	
}