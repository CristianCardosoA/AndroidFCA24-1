package mx.fca.persistencia;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txvNumero;
    Button button;

    int incrementador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvNumero = findViewById(R.id.txvNumero);
        button = findViewById(R.id.button);
        incrementador = leer();
        txvNumero.setText(String.valueOf(incrementador));
        button.setOnClickListener(v -> {
            incrementador += 1;
            txvNumero.setText(String.valueOf(incrementador));
            guardar();
        });
    }

    void guardar() {
        SharedPreferences sharedPref = getSharedPreferences(
                Llaves.miLlave, Context.MODE_PRIVATE
        );

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(Llaves.incrementadorShared, incrementador);
        editor.apply();
    }

    int leer() {
        SharedPreferences sharedPref = getSharedPreferences(
                Llaves.miLlave, Context.MODE_PRIVATE
        );
        return sharedPref.getInt(Llaves.incrementadorShared, 0);
    }
}