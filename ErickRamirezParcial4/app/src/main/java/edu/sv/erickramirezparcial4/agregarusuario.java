package edu.sv.erickramirezparcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class agregarusuario extends AppCompatActivity {
    EditText txtNombre, txtaepllidos, txtDrieccion,txtciuda;
    Button btnGuarda;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarusuario);

        txtNombre = findViewById(R.id.txtNombre);
        txtaepllidos = findViewById(R.id.txtApellido);
        txtDrieccion = findViewById(R.id.txtDireccion);
        txtciuda = findViewById(R.id.txtCiudad);
        btnGuarda = findViewById(R.id.btnGuarda);

        btnGuarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!txtNombre.getText().toString().equals("") && !txtaepllidos.getText().toString().equals("")) {

                    agregarusuario user = new agregarusuario(agregarusuario.this);
                    long id = agregarusuario.insertarCliente(txtNombre.getText().toString(), txtaepllidos.getText().toString(), txtDrieccion.getText().toString(), txtciuda.getText().toString());

                    if (id > 0) {
                        Toast.makeText(agregarusuario.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                        limpiar();
                    } else {
                        Toast.makeText(agregarusuario.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(agregarusuario.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void limpiar() {
        txtNombre.setText("");
        txtaepllidos.setText("");
        txtDrieccion.setText("");
        txtciuda.setText("");
    }
}



