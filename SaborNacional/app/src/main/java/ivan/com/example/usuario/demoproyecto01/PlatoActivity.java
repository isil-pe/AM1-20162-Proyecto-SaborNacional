package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
<<<<<<< HEAD:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/PlatoActivity.java
import android.graphics.Color;
=======
import android.content.Intent;
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/Plato.java
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import ivan.com.example.usuario.demoproyecto01.model.PlatoEntity;
import ivan.com.example.usuario.demoproyecto01.storage.PlatoCostaRepository;

public class PlatoActivity extends Activity {

    private TextView tviNomPlato;
    private ImageView iviPlato;
    private TextView tviRating;
    private RatingBar rtgRating;
    private TextView tviDesPlato;
    private TextView tviProvincia;
    private Button btnFavorite;
    private PlatoEntity plato;
    private ImageView iviFavorite;
    private PlatoApplication platoApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato);
        extras();
        ui();
        populate();
        events();
    }

    private void populate() {

        if(plato == null)return;

        tviNomPlato.setText(plato.getName());
        iviPlato.setImageResource(plato.getImage());
        tviRating.setText(plato.getRating().toString());
        rtgRating.setRating(plato.getRating().floatValue());
        tviDesPlato.setText(plato.getDesc());
        tviProvincia.setText(plato.getProvincia());
<<<<<<< HEAD:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/PlatoActivity.java
        if(plato.isFavorite() == true){
            iviFavorite.setVisibility(View.VISIBLE);
            btnFavorite.setText(R.string.no_gusta);
            btnFavorite.setBackgroundColor(Color.RED);
        }
        else {
            iviFavorite.setVisibility(View.GONE);
        }
=======
        if(plato.isFavorite() == true)
            iviFavorite.setVisibility(View.VISIBLE);
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/Plato.java
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

    private void events(){

        platoApplication= (PlatoApplication) (getApplication());

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/PlatoActivity.java
                if(plato.isFavorite() == false) {
                    plato.setFavorite(true);
                    iviFavorite.setVisibility(View.VISIBLE);
                    btnFavorite.setText(R.string.no_gusta);
                    btnFavorite.setBackgroundColor(Color.RED);
                    updatePlato();
                }
                else
                {
                    plato.setFavorite(false);
                    iviFavorite.setVisibility(View.GONE);
                    btnFavorite.setText(R.string.me_gusta);
                    btnFavorite.setBackgroundColor(getResources().getColor(R.color.favorito));
                    updatePlato();
                }
                //gotoMain();
=======
                plato.setFavorite(true);
                iviFavorite.setVisibility(View.VISIBLE);
                if(plato.getProvincia().equals("Tumbes")) {
                    platoApplication.getPlatoCostaRepository().updatePlatoTumbesById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Piura")){
                    platoApplication.getPlatoCostaRepository().updatePlatoPiuraById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Lambayeque")){
                    platoApplication.getPlatoCostaRepository().updatePlatoLambayequeById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("La Libertad")){
                    platoApplication.getPlatoCostaRepository().updatePlatoLaLibertadById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Cajamarca")){
                    platoApplication.getPlatoSierraRepository().updatePlatoCajamarcaById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Huanuco")){
                    platoApplication.getPlatoSierraRepository().updatePlatoHuanucoById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Pasco")){
                    platoApplication.getPlatoSierraRepository().updatePlatoPascoById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Junin")){
                    platoApplication.getPlatoSierraRepository().updatePlatoJuninById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Amazonas")){
                    platoApplication.getPlatoSelvaRepository().updatePlatoAmazonasById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("San Martin")){
                    platoApplication.getPlatoSelvaRepository().updatePlatoSanMartinById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Loreto")){
                    platoApplication.getPlatoSelvaRepository().updatePlatoLoretoById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Ucayali")){
                    platoApplication.getPlatoSelvaRepository().updatePlatoUcayaliById(plato.getId(), plato);
                }
                else if (plato.getProvincia().equals("Madre de Dios")){
                    platoApplication.getPlatoSelvaRepository().updatePlatoMadreDiosById(plato.getId(), plato);
                }
                gotoMain();
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/Plato.java
            }
        });

        /*btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletePlato();
                gotoMain();
            }
        });*/
    }

<<<<<<< HEAD:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/PlatoActivity.java
    private void updatePlato(){

        if(plato.getId() >= 1 && plato.getId() <= 60) {
            platoApplication.getPlatoCostaRepository().updatePlatoCostaById(plato.getId(), plato);
        }
        else if (plato.getId() >= 61 && plato.getId() <=114){
            platoApplication.getPlatoSierraRepository().updatePlatoSierraById(plato.getId(), plato);
        }
        else {
            platoApplication.getPlatoSelvaRepository().updatePlatoSelvaById(plato.getId(), plato);
        }
    }

    /*
    private void gotoMain()
    {
        finish();
    }*/
=======
    private void gotoMain()
    {
        finish();
    }
>>>>>>> 0944554e40ad5eaec55754c826ade1814889eabb:SaborNacional/app/src/main/java/ivan/com/example/usuario/demoproyecto01/Plato.java

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                plato = (PlatoEntity) bundle.getSerializable("PLATO");
            }
        }
    }
}
