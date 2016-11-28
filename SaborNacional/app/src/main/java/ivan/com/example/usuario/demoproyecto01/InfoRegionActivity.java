package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ivan.com.example.usuario.demoproyecto01.model.RegionEntity;

public class InfoRegionActivity extends Activity {

    private final int REGION_COSTA=0;
    private final int REGION_SIERRA=1;
    private final int REGION_SELVA=2;

    private TextView tviNomRegion;
    private TextView tviDesRegion;
    private RegionEntity regionEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_region);
        extras();
        app();
    }

    private void app(){

        tviNomRegion = (TextView) findViewById(R.id.tviNomRegion);
        tviDesRegion = (TextView) findViewById(R.id.tviDesRegion);

        switch (regionEntity.getId()){
            case REGION_COSTA:
                tviNomRegion.setText(R.string.reg_costa);
                tviDesRegion.setText(R.string.reg_costa_def);
                break;
            case REGION_SIERRA:
                tviNomRegion.setText(R.string.reg_sierra);
                tviDesRegion.setText(R.string.reg_sierra_def);
                break;
            case REGION_SELVA:
                tviNomRegion.setText(R.string.reg_selva);
                tviDesRegion.setText(R.string.reg_selva_def);
                break;
        }
    }

    private void extras() {

        if(getIntent()!=null && getIntent().getExtras()!=null){
            Bundle bundle= getIntent().getExtras();
            regionEntity= (RegionEntity) bundle.getSerializable("INFO");
        }
    }
}
