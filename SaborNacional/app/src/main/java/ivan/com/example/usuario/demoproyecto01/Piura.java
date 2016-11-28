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

public class Piura extends Activity {

    private TextView tviTitulo;
    private ListView lstPlatosPiura;
    private PlatoAdapter platoAdapter;
    private ProvinciaEntity provincia;
    private List<PlatoEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provincia_platos);
        extras();
        loadData();
        app();
    }

    private void loadData() {

        PlatoApplication application= (PlatoApplication) getApplication();
        data= application.getPlatoCostaRepository().getPlatoPiuraList();
    }

    private void app() {
        ui();
        events();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        platoAdapter = new PlatoAdapter(this,
                data);
        lstPlatosPiura.setAdapter(platoAdapter);
    }

    private void ui() {
        lstPlatosPiura = (ListView) findViewById(R.id.lstPlatos);
        tviTitulo = (TextView) findViewById(R.id.tviTitulo);

        if(provincia == null) return;

        tviTitulo.setText(provincia.getName());
    }

    private void events() {
        lstPlatosPiura.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                provincia = (ProvinciaEntity) bundle.getSerializable("PROVPIURA");
            }
        }
    }

    private void gotoPlato(PlatoEntity plato) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("PLATO", plato);

        Intent intent = new Intent(Piura.this, Plato.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
