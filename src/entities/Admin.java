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
public class Admin {
    private int id_adm;
    private String nom_adm;
    private String prenom_adm;
    private int matricule_adm;
    private String poste_adm;
    private String username_adm;
    private String password_adm;

    public Admin(int id_adm, String nom_adm, String prenom_adm, int matricule_adm, String poste_adm, String username_adm, String password_adm) {
        this.id_adm = id_adm;
        this.nom_adm = nom_adm;
        this.prenom_adm = prenom_adm;
        this.matricule_adm = matricule_adm;
        this.poste_adm = poste_adm;
        this.username_adm = username_adm;
        this.password_adm = password_adm;
    }

    public Admin(String nom_adm, String prenom_adm, int matricule_adm, String poste_adm, String username_adm, String password_adm) {
        this.nom_adm = nom_adm;
        this.prenom_adm = prenom_adm;
        this.matricule_adm = matricule_adm;
        this.poste_adm = poste_adm;
        this.username_adm = username_adm;
        this.password_adm = password_adm;
    }

    public Admin() {
    }

    public int getId_adm() {
        return id_adm;
    }

    public void setId_adm(int id_adm) {
        this.id_adm = id_adm;
    }

    public String getNom_adm() {
        return nom_adm;
    }

    public void setNom_adm(String nom_adm) {
        this.nom_adm = nom_adm;
    }

    public String getPrenom_adm() {
        return prenom_adm;
    }

    public void setPrenom_adm(String prenom_adm) {
        this.prenom_adm = prenom_adm;
    }

    public int getMatricule_adm() {
        return matricule_adm;
    }

    public void setMatricule_adm(int matricule_adm) {
        this.matricule_adm = matricule_adm;
    }

    public String getPoste_adm() {
        return poste_adm;
    }

    public void setPoste_adm(String poste_adm) {
        this.poste_adm = poste_adm;
    }

    public String getUsername_adm() {
        return username_adm;
    }

    public void setUsername_adm(String username_adm) {
        this.username_adm = username_adm;
    }

    public String getPassword_adm() {
        return password_adm;
    }

    public void setPassword_adm(String password_adm) {
        this.password_adm = password_adm;
    }

    @Override
    public String toString() {
        return "Admin{" + "id_adm=" + id_adm + ", nom_adm=" + nom_adm + ", prenom_adm=" + prenom_adm + ", matricule_adm=" + matricule_adm + ", poste_adm=" + poste_adm + ", username_adm=" + username_adm + ", password_adm=" + password_adm + '}';
    }

    public void getMatricule_adm(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
