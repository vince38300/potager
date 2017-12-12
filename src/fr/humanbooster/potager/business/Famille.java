package fr.humanbooster.potager.business;

public class Famille {
	private int id=0;
	private String nom;
	private String couleur;
	//variable comp
	private static int compteur=0;
	
	
	//constructeur par defaut
	public Famille() {
		this.id= compteur++;
	}

	//constructeur avec le nom qui prend le contructeur par defaut grace a this()
	public Famille(String nom) {
		this();
		this.nom = nom;
	}

	//constructeur avec le nom et la couleur  qui prend le contructeur par defaut grace au constructeur famille avec nom
	public Famille(String nom, String couleur) {
		this(nom) ;
		this.couleur = couleur;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}





	@Override
	public String toString() {
		return "Famille [id=" + id + ", nom=" + nom + "]";
	}



}
