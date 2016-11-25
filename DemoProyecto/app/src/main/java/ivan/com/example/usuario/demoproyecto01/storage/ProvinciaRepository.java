package ivan.com.example.usuario.demoproyecto01.storage;

import java.util.ArrayList;
import java.util.List;

import ivan.com.example.usuario.demoproyecto01.R;
import ivan.com.example.usuario.demoproyecto01.model.ProvinciaEntity;

public class ProvinciaRepository {

    public List<ProvinciaEntity> provinciaCostaList;
    public List<ProvinciaEntity> provinciaSierraList;
    public List<ProvinciaEntity> provinciaSelvaList;

    public ProvinciaRepository() {

        provinciasCosta();
        provinciasSierra();
        provinciasSelva();
    }

    public void provinciasCosta(){

        provinciaCostaList = new ArrayList<>();
        provinciaCostaList.add(new ProvinciaEntity(1,"Tumbes", R.drawable.tumbes));
        provinciaCostaList.add(new ProvinciaEntity(2,"Piura", R.drawable.piura));
        provinciaCostaList.add(new ProvinciaEntity(3,"Lambayeque", R.drawable.lambayeque));
        provinciaCostaList.add(new ProvinciaEntity(4,"La Libertad", R.drawable.la_libertad));
        provinciaCostaList.add(new ProvinciaEntity(5,"Ancash", R.drawable.ancash));
        provinciaCostaList.add(new ProvinciaEntity(6,"Lima", R.drawable.lima));
        provinciaCostaList.add(new ProvinciaEntity(7,"Ica", R.drawable.ica));
        provinciaCostaList.add(new ProvinciaEntity(8,"Arequipa", R.drawable.arequipa));
        provinciaCostaList.add(new ProvinciaEntity(9,"Moquegua", R.drawable.moquegua));
        provinciaCostaList.add(new ProvinciaEntity(10,"Tacna", R.drawable.tacna));
    }

    public void provinciasSierra(){

        provinciaSierraList = new ArrayList<>();
        provinciaSierraList.add(new ProvinciaEntity(11,"Cajamarca", R.drawable.cajamarca));
        provinciaSierraList.add(new ProvinciaEntity(12,"Huanuco", R.drawable.huanuco));
        provinciaSierraList.add(new ProvinciaEntity(13,"Pasco", R.drawable.pasco));
        provinciaSierraList.add(new ProvinciaEntity(14,"Junin", R.drawable.junin));
        provinciaSierraList.add(new ProvinciaEntity(15,"Huancavelica", R.drawable.huancavelica));
        provinciaSierraList.add(new ProvinciaEntity(16,"Ayacucho", R.drawable.ayacucho));
        provinciaSierraList.add(new ProvinciaEntity(17,"Apurimac", R.drawable.apurimac));
        provinciaSierraList.add(new ProvinciaEntity(18,"Cuzco", R.drawable.cuzco));
        provinciaSierraList.add(new ProvinciaEntity(19,"Puno", R.drawable.puno));
    }

    private void provinciasSelva(){

        provinciaSelvaList = new ArrayList<>();
        provinciaSelvaList.add(new ProvinciaEntity(20,"Amazonas", R.drawable.amazonas));
        provinciaSelvaList.add(new ProvinciaEntity(21,"San Martin", R.drawable.san_martin));
        provinciaSelvaList.add(new ProvinciaEntity(22,"Loreto", R.drawable.loreto));
        provinciaSelvaList.add(new ProvinciaEntity(23,"Ucayali", R.drawable.ucayali));
        provinciaSelvaList.add(new ProvinciaEntity(24,"Madre de Dios", R.drawable.madre_de_dios));
    }

    public List<ProvinciaEntity> getProvinciaCostaList() {
        return provinciaCostaList;
    }

    public List<ProvinciaEntity> getProvinciaSierraList() {
        return provinciaSierraList;
    }

    public List<ProvinciaEntity> getProvinciaSelvaList() {
        return provinciaSelvaList;
    }
}
