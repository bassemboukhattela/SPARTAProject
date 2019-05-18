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
public class Organisateur {
    
     private  int id_org;
    private String nom_org;
    private String prenom_org;
    private int tel_org;
    private int cin_org;
    private String mail_org;
    private String username_org;
    private String password_org;
    private String raison_social_org;
    private String secteur_activite_org;
    private int num_carte_pro;
    private String site_web;

    public Organisateur(int id_org, String nom_org, String prenom_org, int tel_org, int cin_org, String mail_org, String username_org, String password_org, String raison_social_org, String secteur_activite_org, int num_carte_pro, String site_web) {
        this.id_org = id_org;
        this.nom_org = nom_org;
        this.prenom_org = prenom_org;
        this.tel_org = tel_org;
        this.cin_org = cin_org;
        this.mail_org = mail_org;
        this.username_org = username_org;
        this.password_org = password_org;
        this.raison_social_org = raison_social_org;
        this.secteur_activite_org = secteur_activite_org;
        this.num_carte_pro = num_carte_pro;
        this.site_web = site_web;
    }

    public Organisateur(String nom_org, String prenom_org, int tel_org, int cin_org, String mail_org, String username_org, String password_org, String raison_social_org, String secteur_activite_org, int num_carte_pro, String site_web) {
        this.nom_org = nom_org;
        this.prenom_org = prenom_org;
        this.tel_org = tel_org;
        this.cin_org = cin_org;
        this.mail_org = mail_org;
        this.username_org = username_org;
        this.password_org = password_org;
        this.raison_social_org = raison_social_org;
        this.secteur_activite_org = secteur_activite_org;
        this.num_carte_pro = num_carte_pro;
        this.site_web = site_web;
    }

    public Organisateur() {
    }

   

  

    public int getId_org() {
        return id_org;
    }

    public void setId_org(int id_org) {
        this.id_org = id_org;
    }

    public String getNom_org() {
        return nom_org;
    }

    public void setNom_org(String nom_org) {
        this.nom_org = nom_org;
    }

    public String getPrenom_org() {
        return prenom_org;
    }

    public void setPrenom_org(String prenom_org) {
        this.prenom_org = prenom_org;
    }

    public int getTel_org() {
        return tel_org;
    }

    public void setTel_org(int tel_org) {
        this.tel_org = tel_org;
    }

    public int getCin_org() {
        return cin_org;
    }

    public void setCin_org(int cin_org) {
        this.cin_org = cin_org;
    }

    public String getMail_org() {
        return mail_org;
    }

    public void setMail_org(String mail_org) {
        this.mail_org = mail_org;
    }

    public String getUsername_org() {
        return username_org;
    }

    public void setUsername_org(String username_org) {
        this.username_org = username_org;
    }

    public String getPassword_org() {
        return password_org;
    }

    public void setPassword_org(String password_org) {
        this.password_org = password_org;
    }

    public String getRaison_social_org() {
        return raison_social_org;
    }

    public void setRaison_social_org(String raison_social_org) {
        this.raison_social_org = raison_social_org;
    }

    public String getSecteur_activite_org() {
        return secteur_activite_org;
    }

    public void setSecteur_activite_org(String secteur_activite_org) {
        this.secteur_activite_org = secteur_activite_org;
    }

    public int getNum_carte_pro() {
        return num_carte_pro;
    }

    public void setNum_carte_pro(int num_carte_pro) {
        this.num_carte_pro = num_carte_pro;
    }

    public String getSite_web() {
        return site_web;
    }

    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    @Override
    public String toString() {
        return "Organisateur{" + "id_org=" + id_org + ", nom_org=" + nom_org + ", prenom_org=" + prenom_org + ", tel_org=" + tel_org + ", cin_org=" + cin_org + ", mail_org=" + mail_org + ", username_org=" + username_org + ", password_org=" + password_org + ", raison_social_org=" + raison_social_org + ", secteur_activite_org=" + secteur_activite_org + ", num_carte_pro=" + num_carte_pro + ", site_web=" + site_web + '}';
    }
    
    
}
