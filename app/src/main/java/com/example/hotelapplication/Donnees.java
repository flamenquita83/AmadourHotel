package com.example.hotelapplication;

import android.widget.Toast;

public class Donnees {

private String titre, contenu;
private Integer intImage;


 public Donnees (String titre, String contenu, Integer intImage){

 this.titre = titre;
 this.contenu = contenu;
 this.intImage = intImage;

 }

 public void changeText1(String texte) {

titre = texte;

 }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Integer getIntImage() {
        return intImage;
    }

    public void setIntImage(int intImage) {
        this.intImage = intImage;
    }
}
