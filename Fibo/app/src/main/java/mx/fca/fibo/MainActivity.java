package mx.fca.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txvFibo;
    Button btnMas;
    Button btnMenos;

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvFibo = findViewById(R.id.txvFibo);
        btnMas = findViewById(R.id.button2);
        btnMenos = findViewById(R.id.button);


        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador += 1;
                double resultado = fibonacci(contador);
                txvFibo.setText(String.valueOf(resultado));
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador -= 1;
                double resultado = fibonacci(contador);
                txvFibo.setText(String.valueOf(resultado));
            }
        });
    }

    double fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1){
            return 1;
        }
        return fibonacci(x - 1) * fibonacci(x - 2);
    }
}