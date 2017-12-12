package fr.humanbooster.potager.business;

public class Graine{
	private String nom;
	private int  numDeSemaineDePlantationMin;
	private int  numDeSemaineDePlantationMax;
	private float  espaceEnrePied;
	private float  espaceEntreLigne;
	private Famille  famille = new Famille(); 
	
	
	
	public Graine(String nom, int numDeSemaineDePlantationMin, int numDeSemaineDePlantationMax, float espaceEnrePied,
			float espaceEntreLigne, Famille famille) {
		super();
		this.nom = nom;
		this.numDeSemaineDePlantationMin = numDeSemaineDePlantationMin;
		this.numDeSemaineDePlantationMax = numDeSemaineDePlantationMax;
		this.espaceEnrePied = espaceEnrePied;
		this.espaceEntreLigne = espaceEntreLigne;
		this.famille = famille;
	}
	
	
	public String getNom() {
		return nom;
	}
	public Famille getFamille() {
		return famille;
	}
	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumDeSemaineDePlantationMin() {
		return numDeSemaineDePlantationMin;
	}
	public void setNumDeSemaineDePlantationMin(int numDeSemaineDePlantationMin) {
		this.numDeSemaineDePlantationMin = numDeSemaineDePlantationMin;
	}
	public int getNumDeSemaineDePlantationMax() {
		return numDeSemaineDePlantationMax;
	}
	public void setNumDeSemaineDePlantationMax(int numDeSemaineDePlantationMax) {
		this.numDeSemaineDePlantationMax = numDeSemaineDePlantationMax;
	}
	public float getEspaceEnrePied() {
		return espaceEnrePied;
	}
	public void setEspaceEnrePied(float espaceEnrePied) {
		this.espaceEnrePied = espaceEnrePied;
	}
	public float getEspaceEntreLigne() {
		return espaceEntreLigne;
	}
	public void setEspaceEntreLigne(float espaceEntreLigne) {
		this.espaceEntreLigne = espaceEntreLigne;
	}


	@Override
	public String toString() {
		return "Graine [nom=" + nom + ", numDeSemaineDePlantationMin=" + numDeSemaineDePlantationMin
				+ ", numDeSemaineDePlantationMax=" + numDeSemaineDePlantationMax + ", espaceEnrePied=" + espaceEnrePied
				+ ", espaceEntreLigne=" + espaceEntreLigne + ", famille=" +famille+"]";
	}


	
}