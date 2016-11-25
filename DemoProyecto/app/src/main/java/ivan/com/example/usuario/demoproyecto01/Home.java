package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Home extends Activity {

    TextView tvBienvenido;
    Button btnCosta, btnSierra, btnSelva;
    ImageView imgInfo;
    TextView tviLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
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
                gotoRegCosta();
            }
        });

        btnSierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegSierra();
            }
        });

        btnSelva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegSelva();
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

    private void closeSesion() {
        Intent intent= new Intent(Home.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        closeSesion();
    }

    private void gotoRegCosta() {
        startActivity(new Intent(this,Costa.class));
    }

    private void gotoRegSierra() {
        startActivity(new Intent(this,Sierra.class));
    }

    private void gotoRegSelva() {
        startActivity(new Intent(this,Selva.class));
    }

    private void gotoInfo() {
        startActivity(new Intent(this,Info.class));
    }
}
