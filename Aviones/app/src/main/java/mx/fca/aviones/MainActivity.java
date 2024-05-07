package mx.fca.aviones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Plano plano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plano =  Planificador.crearRutaInicial();

        // Implementa tu solucion
        // Lista (Recycler view)
        // Adapter
        // View Holder
        // GridLayoutManager

    }
}