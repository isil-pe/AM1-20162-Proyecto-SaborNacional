package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;

public class Plato extends Activity {

    private TextView tviNomPlato;
    private ImageView iviPlato;
    private TextView tviRating;
    private RatingBar rtgRating;
    private TextView tviDesPlato;
    private TextView tviProvincia;
    private Button btnFavorite;
    private PlatoEntity plato;
    private ImageView iviFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato);
        extras();
        ui();
        populate();
    }

    private void populate() {

        if(plato == null)return;

        tviNomPlato.setText(plato.getName());
        iviPlato.setImageResource(plato.getImage());
        tviRating.setText(plato.getRating().toString());
        rtgRating.setRating(plato.getRating().floatValue());
        tviDesPlato.setText(plato.getDesc());
        tviProvincia.setText(plato.getProvincia());

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plato.setFavorite(true);
                iviFavorite.setVisibility(View.VISIBLE);
            }
        });
    }

    private void ui() {
        tviNomPlato = (TextView) findViewById(R.id.tviNomPlato);
        iviPlato = (ImageView) findViewById(R.id.iviPlato);
        tviRating = (TextView) findViewById(R.id.tviRating);
        rtgRating = (RatingBar) findViewById(R.id.rtgRating);
        tviDesPlato = (TextView) findViewById(R.id.tviDesPlato);
        tviProvincia = (TextView) findViewById(R.id.tviProvincia);
        btnFavorite = (Button) findViewById(R.id.btnFavorite);
        iviFavorite = (ImageView)findViewById(R.id.iviFavorite);
    }

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                plato = (PlatoEntity) bundle.getSerializable("PLATO");
            }
        }
    }
}
