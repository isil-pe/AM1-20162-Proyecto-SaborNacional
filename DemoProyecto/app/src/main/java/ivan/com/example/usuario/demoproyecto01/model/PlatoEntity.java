package ivan.com.example.usuario.demoproyecto01.model;

import java.io.Serializable;

public class PlatoEntity implements Serializable{

    private int id;
    private String name;
    private Double rating;
    private String desc;
    private int image;
    private String provincia;

    public PlatoEntity() {
    }

    public PlatoEntity(int id, String name, Double rating, String desc, int image, String provincia) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.desc = desc;
        this.image = image;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
