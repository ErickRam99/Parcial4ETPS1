package edu.sv.erickramirezparcial4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.sv.erickramirezparcial4.Base.BaseHelper;

public class MainActivity extends AppCompatActivity {
    Button btnBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBase= findViewById(R.id.btnBase);
        btnBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BaseHelper baseHelper = new BaseHelper(MainActivity.this);
                SQLiteDatabase db = baseHelper.getWritableDatabase();
                if (db != null){
                    Toast.makeText(MainActivity.this, "Base creada",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Error base no creada",Toast.LENGTH_LONG).show();
                }

            }
        });


    }

}