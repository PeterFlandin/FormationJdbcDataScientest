package Entity;

public class Livre {

    private int id_livre;
    private String titre;

    private double prix;

    public Livre() {
    }


    public Livre(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id_livre=" + id_livre +
                ", titre='" + titre + '\'' +
                ", prix=" + prix +
                '}';
    }
}
