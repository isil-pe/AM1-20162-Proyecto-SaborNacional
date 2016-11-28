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

public class ProvinciaActivity extends Activity {

    private TextView tviTitulo;
    private ListView lstPlatos;
    private PlatoAdapter platoAdapter;
    private ProvinciaEntity provincia;
    private List<PlatoEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provincia);
        extras();
        loadData();
        app();
    }

    private void loadData() {

        PlatoApplication application= (PlatoApplication) getApplication();
        switch (provincia.getId()){
            case 1:
                data= application.getPlatoCostaRepository().getPlatoTumbesList();
                break;
            case 2:
                data= application.getPlatoCostaRepository().getPlatoPiuraList();
                break;
            case 3:
                data= application.getPlatoCostaRepository().getPlatoLambayequeList();
                break;
            case 4:
                data= application.getPlatoCostaRepository().getPlatoLaLibertadList();
                break;
            case 5:
                data= application.getPlatoCostaRepository().getPlatoAncashList();
                break;
            case 6:
                data= application.getPlatoCostaRepository().getPlatoLimaList();
                break;
            case 11:
                data= application.getPlatoSierraRepository().getPlatoCajamarcaList();
                break;
            case 12:
                data= application.getPlatoSierraRepository().getPlatoHuanucoList();
                break;
            case 13:
                data= application.getPlatoSierraRepository().getPlatoPascoList();
                break;
            case 14:
                data= application.getPlatoSierraRepository().getPlatoJuninList();
                break;
            case 15:
                data= application.getPlatoSierraRepository().getPlatoHuancavelicaList();
                break;
            case 16:
                data= application.getPlatoSierraRepository().getPlatoAyacuchoList();
                break;
            case 20:
                data= application.getPlatoSelvaRepository().getPlatoAmazonasList();
                break;
            case 21:
                data= application.getPlatoSelvaRepository().getPlatoSanMartinList();
                break;
            case 22:
                data= application.getPlatoSelvaRepository().getPlatoLoretoList();
                break;
            case 23:
                data= application.getPlatoSelvaRepository().getPlatoUcayaliList();
                break;
            case 24:
                data= application.getPlatoSelvaRepository().getPlatoMadreDiosList();
                break;
        }
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
        lstPlatos.setAdapter(platoAdapter);
    }

    private void ui() {
        lstPlatos = (ListView) findViewById(R.id.lstPlatos);
        tviTitulo = (TextView) findViewById(R.id.tviTitulo);

        if(provincia == null) return;

        tviTitulo.setText(provincia.getName());
    }

    private void events() {
        lstPlatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                provincia = (ProvinciaEntity) bundle.getSerializable("PROVINCIA");
            }
        }
    }

    private void gotoPlato(PlatoEntity plato) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("PLATO", plato);

        Intent intent = new Intent(ProvinciaActivity.this, PlatoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
