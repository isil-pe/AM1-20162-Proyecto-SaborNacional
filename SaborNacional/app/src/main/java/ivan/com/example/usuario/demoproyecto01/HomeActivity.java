package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ivan.com.example.usuario.demoproyecto01.model.RegionEntity;


public class HomeActivity extends Activity {

    private final int REGION_COSTA=0;
    private final int REGION_SIERRA=1;
    private final int REGION_SELVA=2;

    TextView tvBienvenido;
    Button btnCosta, btnSierra, btnSelva;
    ImageView imgInfo;
    TextView tviLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        app();
    }

    private void app(){

        tvBienvenido = (TextView)findViewById(R.id.tvBienvenido);
        btnCosta = (Button) findViewById(R.id.btnCosta);
        btnSierra = (Button) findViewById(R.id.btnSierra);
        btnSelva = (Button) findViewById(R.id.btnSelva);
        imgInfo = (ImageView) findViewById(R.id.imgInfo);
        tviLogout = (TextView) findViewById(R.id.tviLogout);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){
            String datoNombre = extras.getString("NOMBRE");
            tvBienvenido.setText(getString(R.string.bienvenido) + " " + datoNombre + "!");
        }

        btnCosta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegion(REGION_COSTA);
            }
        });

        btnSierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegion(REGION_SIERRA);
            }
        });

        btnSelva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegion(REGION_SELVA);
            }
        });

        imgInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoInfo();
            }
        });

        tviLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tviLogout.setTextColor(Color.RED);
                closeSesion();
            }
        });
    }

    private void gotoRegion(int region) {

        RegionEntity regionEntity= factoryEntity(region);

        Bundle bundle= new Bundle();
        bundle.putSerializable("REGION",regionEntity);

        Intent intent= new Intent(this,RegionActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private RegionEntity factoryEntity(int region){
        RegionEntity regionEntity= new RegionEntity();
        switch (region){
            case  0://Costa
                regionEntity.setId(0);
                regionEntity.setName(getString(R.string.costa));
                break;
            case 1://Sierra
                regionEntity.setId(1);
                regionEntity.setName(getString(R.string.sierra));
                break;
            case 2://Selva
                regionEntity.setId(2);
                regionEntity.setName(getString(R.string.selva));
                break;
        }

        return regionEntity;
    }

    private void closeSesion() {
        Intent intent= new Intent(HomeActivity.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        closeSesion();
    }

    private void gotoInfo() {
        startActivity(new Intent(this,InfoAppActivity.class));
    }
}
