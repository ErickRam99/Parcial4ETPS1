package edu.sv.erickramirezparcial4.Base;

import static android.provider.Contacts.SettingsColumns.KEY;
import static java.text.Collator.PRIMARY;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION=1;
    private static String DATABASE_NOMBRE="Ventas_Clientes";
    public static final String TABLE_CLIENTES = "TableClientes";

    public BaseHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLE_CLIENTES+"(" +
                "Cliente INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombres TEXT NOT NULL," +
                "Apellidos TEXT NOT NULL,"+
                "DireccionCliente TEXT NOT NULL,"+
                "CiUdadCliente TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+TABLE_CLIENTES);
        onCreate(sqLiteDatabase);
    }
}
