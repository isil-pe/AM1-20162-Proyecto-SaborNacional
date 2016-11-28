package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ivan.com.example.usuario.demoproyecto01.adapter.ProvinciaAdapter;
import ivan.com.example.usuario.demoproyecto01.model.ProvinciaEntity;
import ivan.com.example.usuario.demoproyecto01.model.RegionEntity;
import ivan.com.example.usuario.demoproyecto01.storage.ProvinciaRepository;

public class RegionActivity extends Activity {

    private final int REGION_COSTA=0;
    private final int REGION_SIERRA=1;
    private final int REGION_SELVA=2;

    private RegionEntity regionEntity;
    private GridView regionGrid;
    private ProvinciaAdapter provinciaAdapter;
    private ImageView iviRegion;
    private TextView tviRegion;
    private ProvinciaRepository provinciaRepository;
    private List<ProvinciaEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        extras();
        ui();
        app();
    }

    private void app() {
        provinciaRepository = new ProvinciaRepository();
        switch (regionEntity.getId()){
            case REGION_COSTA:
                data= provinciaRepository.getProvinciaCostaList();
                break;
            case REGION_SIERRA:
                data= provinciaRepository.getProvinciaSierraList();
                break;
            case REGION_SELVA:
                data= provinciaRepository.getProvinciaSelvaList();
                break;
        }

        provinciaAdapter = new ProvinciaAdapter(this,
                data);
        regionGrid.setAdapter(provinciaAdapter);

        tviRegion = (TextView) findViewById(R.id.tviRegion);

        switch (regionEntity.getId()){
            case REGION_COSTA:
                tviRegion.setText(getString(R.string.reg_costa));
                iviRegion.setImageResource(R.drawable.boton_sun);
                break;
            case REGION_SIERRA:
                tviRegion.setText(getString(R.string.reg_sierra));
                iviRegion.setImageResource(R.drawable.boton_mountain);
                break;
            case REGION_SELVA:
                tviRegion.setText(getString(R.string.reg_selva));
                iviRegion.setImageResource(R.drawable.boton_tree);
                break;
        }

        iviRegion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInfo(regionEntity);
            }
        });

        regionGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                ProvinciaEntity provincia = (ProvinciaEntity) adapterView.getAdapter().getItem(position);

                gotoProvincia(provincia);
            }
        });

    }

    private void gotoInfo(RegionEntity region) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("INFO", region);

        Intent intent = new Intent(RegionActivity.this, InfoRegionActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    private void ui() {

        regionGrid = (GridView) findViewById(R.id.regionGrid);
        iviRegion = (ImageView) findViewById(R.id.iviRegion);
    }

    private void extras() {

        if(getIntent()!=null && getIntent().getExtras()!=null){
            Bundle bundle= getIntent().getExtras();
            regionEntity= (RegionEntity) bundle.getSerializable("REGION");
        }
    }

    private void gotoProvincia(ProvinciaEntity provincia) {

        Bundle bundle= new Bundle();
        bundle.putSerializable("PROVINCIA", provincia);

        Intent intent = new Intent(RegionActivity.this, ProvinciaActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
