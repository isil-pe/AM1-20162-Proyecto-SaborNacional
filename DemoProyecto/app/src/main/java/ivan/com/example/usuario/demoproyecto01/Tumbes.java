package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import ivan.com.example.usuario.demoproyecto01.adapter.PlatoAdapter;
import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;
import ivan.com.example.usuario.demoproyecto01.model.ProvinciaEntity;
import ivan.com.example.usuario.demoproyecto01.storage.PlatoCostaRepository;

public class Tumbes extends Activity {

    private TextView tviTitulo;
    private ListView lstPlatosTumbes;
    private PlatoAdapter platoAdapter;
    private ProvinciaEntity provincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provincia_platos);
        extras();
        app();
        populate();
    }

    private void app(){

        lstPlatosTumbes = (ListView) findViewById(R.id.lstPlatos);
        tviTitulo = (TextView) findViewById(R.id.tviTitulo);

        PlatoCostaRepository platoCostaRepository = new PlatoCostaRepository();
        List<PlatoEntity> data = platoCostaRepository.getPlatoTumbesList();

        platoAdapter = new PlatoAdapter(this,
                data);
        lstPlatosTumbes.setAdapter(platoAdapter);

        lstPlatosTumbes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                PlatoEntity plato = (PlatoEntity) adapterView.getAdapter().getItem(position);
                gotoPlato(plato);
            }
        });
    }

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                provincia = (ProvinciaEntity) bundle.getSerializable("PROVTUMBES");
            }
        }
    }

    private void populate() {

        if(provincia == null) return;

        tviTitulo.setText(provincia.getName());
    }

    private void gotoPlato(PlatoEntity plato) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("PLATO", plato);

        Intent intent = new Intent(Tumbes.this, Plato.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
