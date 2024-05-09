package mx.fca.aviones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    Plano plano;

    RecyclerView listaAviones;

    AvionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAviones = findViewById(R.id.listaAviones);
        btnNext = findViewById(R.id.btnNext);
        plano =  Planificador.crearRutaInicial();
        adapter = new AvionAdapter(plano.aviones);
        listaAviones.setAdapter(adapter);
        listaAviones.setLayoutManager(new GridLayoutManager(this, 5));

        btnNext.setOnClickListener(v -> {
            plano = plano.next();
            adapter.notifyDataSetChanged();
        });
    }
}