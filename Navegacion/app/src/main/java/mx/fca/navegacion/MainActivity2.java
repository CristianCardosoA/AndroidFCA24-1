package mx.fca.navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String nombre = "";
    TextView txvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txvNombre = findViewById(R.id.textView);
        nombre = getIntent().getStringExtra(BundleKeys.NAME);
        txvNombre.setText(nombre);
    }
}