package dao;

import java.util.ArrayList;

import beans.Utilisateur;

public class UtilisateurDao {

	ArrayList<Utilisateur> utilisateurs;
	public UtilisateurDao()
	{
		utilisateurs = new ArrayList<Utilisateur>();
		utilisateurs.add(new Utilisateur(1,"Omar","Diop","omzo","passer"));
		utilisateurs.add(new Utilisateur(2,"Fallou","Tall","fallou","passer123"));
	}
	
	public ArrayList<Utilisateur> lister(){
		return utilisateurs;
	}
	public Utilisateur ajouter(String prenom, String nom, String login, String password)
	{
		int newId = utilisateurs.size()+1;
		Utilisateur user = new Utilisateur(newId, prenom,nom,login,password);
		utilisateurs.add(user);
		return user;
		
	}
	public Utilisateur modifier(int id,String prenom, String nom, String login, String password) 
	{
		 for (Utilisateur u : utilisateurs) {
	            if (u.getId() == id) {
	                u.setPrenom(prenom);
	                u.setNom(nom);
	                u.setLogin(login);
	                u.setPassword(password);
	                return u;
	            }
	        }
	        return null;
		
	}
	public void supprimer(int id) 
	{
		utilisateurs.removeIf(u -> u.getId() == id);
		 
	}
	 
}
