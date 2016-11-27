package ivan.com.example.usuario.demoproyecto01.model;

import java.io.Serializable;

public class ProvinciaEntity implements Serializable{

    private int id;
    private String name;
    private int icon;

    public ProvinciaEntity(int id, String name, int icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public ProvinciaEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProvinciaEntity() {
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

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
