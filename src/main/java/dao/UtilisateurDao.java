package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import beans.Utilisateur;

public class UtilisateurDao {

	ArrayList<Utilisateur> utilisateurs;
	public UtilisateurDao()
	{
	}
	
	public ArrayList<Utilisateur> lister() {
	    ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

	    try {
	        Connection conn = DBConnection.getConnection();
	        String sql = "SELECT * FROM utilisateur";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Utilisateur u = new Utilisateur(
	                rs.getInt("id"),
	                rs.getString("prenom"),
	                rs.getString("nom"),
	                rs.getString("login"),
	                rs.getString("password")
	            );
	            utilisateurs.add(u);
	        }

	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return utilisateurs;
	}
	public void ajouter(String prenom, String nom, String login, String password) {
	    try {
	        Connection conn = DBConnection.getConnection();
	        String sql = "INSERT INTO utilisateur(prenom, nom, login, password) VALUES (?, ?, ?, ?)";
	        PreparedStatement ps = conn.prepareStatement(sql);

	        ps.setString(1, prenom);
	        ps.setString(2, nom);
	        ps.setString(3, login);
	        ps.setString(4, password);

	        ps.executeUpdate();
	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void modifier(int id, String prenom, String nom, String login, String password) {
	    try {
	        Connection conn = DBConnection.getConnection();
	        String sql = "UPDATE utilisateur SET prenom=?, nom=?, login=?, password=? WHERE id=?";
	        PreparedStatement ps = conn.prepareStatement(sql);

	        ps.setString(1, prenom);
	        ps.setString(2, nom);
	        ps.setString(3, login);
	        ps.setString(4, password);
	        ps.setInt(5, id);

	        ps.executeUpdate();
	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void supprimer(int id) {
	    try {
	        Connection conn = DBConnection.getConnection();
	        String sql = "DELETE FROM utilisateur WHERE id = ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        ps.setInt(1, id);
	        ps.executeUpdate();

	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	 
}
