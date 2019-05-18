/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Bassem
 */
public class User {

    private  int id;
    private String nom;
    private String prenom;
    private int tel;
    private int cin;
    private String mail;
    private String username;
    private String password;
    private String universite;
    private int num_carte_etudiant;

    public User() {
    }
    

    public User(int id, String nom, String prenom, int tel, int cin, String mail, String username, String password, String universite, int num_carte_etudiant) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.cin = cin;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.universite = universite;
        this.num_carte_etudiant = num_carte_etudiant;
    }

    public User(String nom, String prenom, int tel, int cin, String mail, String username, String password, String universite, int num_carte_etudiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.cin = cin;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.universite = universite;
        this.num_carte_etudiant = num_carte_etudiant;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public int getNum_carte_etudiant() {
        return num_carte_etudiant;
    }

    public void setNum_carte_etudiant(int num_carte_etudiant) {
        this.num_carte_etudiant = num_carte_etudiant;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", cin=" + cin + ", mail=" + mail + ", username=" + username + ", password=" + password + ", universite=" + universite + ", num_carte_etudiant=" + num_carte_etudiant + '}';
    }
    

}
