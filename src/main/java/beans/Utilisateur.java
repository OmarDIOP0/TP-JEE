package beans;

public class Utilisateur {
	private int id;
	private String prenom,nom,login,password;
	
	public Utilisateur() {}
	
	public Utilisateur(String prenom, String nom, String login, String password) {
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}
	public Utilisateur(int id, String prenom, String nom, String login, String password) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.login = login;
		this.password = password;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		 this.id = id;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		 this.prenom = prenom;
	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		 this.nom = nom;
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		 this.login = login;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		 this.password = password;
	}

}
