package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

import ivan.com.example.usuario.demoproyecto01.adapter.ProvinciaAdapter;
import ivan.com.example.usuario.demoproyecto01.model.ProvinciaEntity;
import ivan.com.example.usuario.demoproyecto01.storage.ProvinciaRepository;

public class Selva extends Activity {

    private GridView myRegSelvaGrid;
    private ProvinciaAdapter provinciaAdapter;
    private ImageView imgSelva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.region_selva);
        app();
    }

    private void app(){

        myRegSelvaGrid = (GridView) findViewById(R.id.RegSelvaGrid);
        imgSelva = (ImageView) findViewById(R.id.imgSelva);

        ProvinciaRepository provinciaRepository = new ProvinciaRepository();
        List<ProvinciaEntity> data = provinciaRepository.getProvinciaSelvaList();

        provinciaAdapter = new ProvinciaAdapter(this,
                data);
        myRegSelvaGrid.setAdapter(provinciaAdapter);

        imgSelva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInfoSelva();
            }
        });

        myRegSelvaGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                ProvinciaEntity provincia = (ProvinciaEntity) adapterView.getAdapter().getItem(position);

                switch (position){

                    case 0:
                        gotoAmazonas(provincia);
                        break;
                    case 1:
                        gotoSanMartin(provincia);
                        break;
                    case 2:
                        gotoLoreto(provincia);
                        break;
                    case 3:
                        gotoUcayali(provincia);
                        break;
                    case 4:
                        gotoMadreDios(provincia);
                        break;
                }
            }
        });
    }

    private void gotoInfoSelva() {
        startActivity(new Intent(this,InfoSelva.class));
    }

    private void gotoAmazonas(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVAMAZONAS", provincia);

        Intent intent = new Intent(Selva.this, Amazonas.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoSanMartin(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVSANMARTIN", provincia);

        Intent intent = new Intent(Selva.this, SanMartin.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoLoreto(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVLORETO", provincia);

        Intent intent = new Intent(Selva.this, Loreto.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoUcayali(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVUCAYALI", provincia);

        Intent intent = new Intent(Selva.this, Ucayali.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoMadreDios(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVMADREDIOS", provincia);

        Intent intent = new Intent(Selva.this, MadreDios.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
