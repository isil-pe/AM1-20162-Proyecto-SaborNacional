package ivan.com.example.usuario.demoproyecto01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends Activity {

    private EditText etNombre, etCorreo;
    private CheckBox chkNot;
    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        app();
    }

    private void app(){

        etNombre = (EditText)findViewById(R.id.etNombre);
        etCorreo = (EditText)findViewById(R.id.etCorreo);
        chkNot = (CheckBox)findViewById(R.id.chkNot);
        btnIniciar = (Button)findViewById(R.id.btIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validar())
                {
                    gotoHome();
                }else
                {
                    Toast.makeText(LoginActivity.this, R.string.errorCampos,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validar(){

        String nombre = etNombre.getText().toString().trim();
        String correo = etCorreo.getText().toString().trim();

        if(nombre.isEmpty()){
            etNombre.setError(getString(R.string.errorNombre));
            return false;
        }
        if(correo.isEmpty()){
            etCorreo.setError(getString(R.string.errorCorreo));
            return false;
        }

        boolean notification= chkNot.isChecked();
        if(!notification) {
            return false;
        }

        if(!EmailValido(correo)){
            etCorreo.setError(getString(R.string.errorCorreo2));
            return false;
        }

        return true;
    }

    public boolean EmailValido(String email) {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        return matcher.matches();
    }

    private void gotoHome() {

        String datoNombre = etNombre.getText().toString();
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        intent.putExtra("NOMBRE", datoNombre);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
