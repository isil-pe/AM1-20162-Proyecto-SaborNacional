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

public class Sierra extends Activity {

    private GridView myRegSierraGrid;
    private ProvinciaAdapter provinciaAdapter;
    private ImageView imgSierra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.region_sierra);
        app();
    }

    private void app(){

        myRegSierraGrid = (GridView) findViewById(R.id.RegSierraGrid);
        imgSierra = (ImageView) findViewById(R.id.imgSierra);

        ProvinciaRepository provinciaRepository = new ProvinciaRepository();
        List<ProvinciaEntity> data = provinciaRepository.getProvinciaSierraList();

        provinciaAdapter = new ProvinciaAdapter(this,
                data);
        myRegSierraGrid.setAdapter(provinciaAdapter);

        imgSierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInfoSierra();
            }
        });

        myRegSierraGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                ProvinciaEntity provincia = (ProvinciaEntity) adapterView.getAdapter().getItem(position);

                switch (position){

                    case 0:
                        gotoCajamarca(provincia);
                        break;
                    case 1:
                        gotoHuanuco(provincia);
                        break;
                    case 2:
                        gotoPasco(provincia);
                        break;
                    case 3:
                        gotoJunin(provincia);
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

    private void gotoInfoSierra() {
        startActivity(new Intent(this,InfoSierra.class));
    }

    private void gotoCajamarca(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVCAJAMARCA", provincia);

        Intent intent = new Intent(Sierra.this, Cajamarca.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoHuanuco(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVHUANUCO", provincia);

        Intent intent = new Intent(Sierra.this, Huanuco.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoPasco(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVPASCO", provincia);

        Intent intent = new Intent(Sierra.this, Pasco.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void gotoJunin(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVJUNIN", provincia);

        Intent intent = new Intent(Sierra.this, Junin.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
