package ivan.com.example.usuario.demoproyecto01.model;

import java.io.Serializable;

public class RegionEntity implements Serializable {

    private int id;
    private String name;

    public RegionEntity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public RegionEntity() {
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
}
