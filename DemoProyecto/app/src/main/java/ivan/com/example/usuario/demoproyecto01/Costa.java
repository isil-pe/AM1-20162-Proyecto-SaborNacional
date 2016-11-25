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

public class Costa extends Activity {

    private GridView myRegCostaGrid;
    private ProvinciaAdapter provinciaAdapter;
    private ImageView imgCosta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.region_costa);
        app();
    }

    private void app(){

        myRegCostaGrid = (GridView) findViewById(R.id.RegCostaGrid);
        imgCosta = (ImageView) findViewById(R.id.imgCosta);

        ProvinciaRepository provinciaRepository = new ProvinciaRepository();
        final List<ProvinciaEntity> data = provinciaRepository.getProvinciaCostaList();

        provinciaAdapter = new ProvinciaAdapter(this,
                data);
        myRegCostaGrid.setAdapter(provinciaAdapter);

        imgCosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInfoCosta();
            }
        });

        myRegCostaGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                ProvinciaEntity provincia = (ProvinciaEntity) adapterView.getAdapter().getItem(position);

                switch (position){

                    case 0:
                        gotoTumbes(provincia);
                        break;
                    case 1:
                        gotoPiura(provincia);
                        break;
                    case 2:
                        gotoLambayeque(provincia);
                        break;
                    case 3:
                        gotoLaLibertad(provincia);
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                }
            }
        });
    }

    private void gotoInfoCosta() {
        startActivity(new Intent(this, InfoCosta.class));
    }

    private void gotoTumbes(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVTUMBES", provincia);

        Intent intent = new Intent(Costa.this, Tumbes.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoPiura(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVPIURA", provincia);

        Intent intent = new Intent(Costa.this, Piura.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoLambayeque(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVLAMBAYEQUE", provincia);

        Intent intent = new Intent(Costa.this, Lambayeque.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoLaLibertad(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVLIBERTAD", provincia);

        Intent intent = new Intent(Costa.this, Libertad.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
