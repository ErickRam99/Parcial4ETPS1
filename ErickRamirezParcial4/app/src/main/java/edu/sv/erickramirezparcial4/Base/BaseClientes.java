package edu.sv.erickramirezparcial4.Base;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class BaseClientes extends BaseHelper {
    Context context;

    public BaseClientes(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertarCliente(String Nombres, String Apellidos, String DireccionCliente,String CiUdadCliente) {

        long Cliente = 0;

        try {
            BaseHelper  baseHelper= new BaseHelper(context);
            SQLiteDatabase db = baseHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("Nombres", Nombres);
            values.put("Apellidos", Apellidos);
            values.put("DireccionCliente", DireccionCliente);
            values.put("CiUdadCliente", CiUdadCliente);

            Cliente = db.insert(TABLE_CLIENTES, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return  Cliente;
    }
}
