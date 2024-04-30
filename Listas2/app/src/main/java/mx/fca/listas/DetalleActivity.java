package mx.fca.listas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    Contacto contacto;

    TextView txvNombre;
    TextView txvDireccion;

    TextView txvTelefono;

    TextView txvEtiquetas;

    TextView txvCorreo1;

    TextView txvCorreo2;

    ImageView imgPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txvTelefono = findViewById(R.id.txvTelefono);
        txvNombre = findViewById(R.id.txvNombre);
        txvCorreo1 = findViewById(R.id.txvCorreo);
        txvDireccion = findViewById(R.id.txvDireccion);
        txvCorreo2 = findViewById(R.id.txvCorreo2);
        txvEtiquetas = findViewById(R.id.txvEtiquetas);
        imgPic = findViewById(R.id.imgFotografia);

        long id = getIntent().getLongExtra("CONTACTO_ID", 1);
        this.contacto = Contactos.getContacto(id);

        if (contacto != null) {
            this.txvTelefono.setText(contacto.telefono);
            this.txvNombre.setText(contacto.nombre);
            this.txvCorreo1.setText(contacto.correo);
            this.txvCorreo2.setText(contacto.correo2);
            this.txvEtiquetas.setText(contacto.etiqueta);
            this.txvDireccion.setText(contacto.direccion);
            this.imgPic.setImageResource(contacto.fotografia);
        }
    }
}