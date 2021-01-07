package com.dsi31g3.checkcovid;

public class UserHelperClass {
    String titre, description, lien;
    public UserHelperClass() {
    }
    public UserHelperClass(String titre, String description, String lien) {
        this.titre = titre;
        this.description = description;
        this.lien = lien;

    }
    public String gettitre() {
        return titre;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public String getlien() {
        return lien;
    }
    public void setlien(String lien) {
        this.lien = lien;
    }
}

