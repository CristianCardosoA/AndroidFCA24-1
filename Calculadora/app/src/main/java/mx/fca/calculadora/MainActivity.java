package mx.fca.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import mx.fca.calculadora.modulo.calculadora.enums.Operacion;
import mx.fca.calculadora.modulo.calculadora.implementation.Calculadora;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Calculadora calculadora = new Calculadora();
    boolean introduceX = true;
    TextView txvDisplay;
    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;
    Button btnCero;
    Button btnSuma;
    Button btnResta;
    Button btnMulti;
    Button btnDiv;
    Button btnIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvDisplay = findViewById(R.id.txvDisplay);
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro  = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve  = findViewById(R.id.btnNueve);
        btnIgual  = findViewById(R.id.btnIgual);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);

        btnIgual.setOnClickListener(this);
        btnCero.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIgual:
                txvDisplay.setText(calculadora.igual());
                break;
            case R.id.btnCero:
                if (introduceX) {
                    calculadora.introduceX(0);
                } else {
                    calculadora.introduceY(0);
                }
                txvDisplay.setText("0");
                break;
            case R.id.btnUno:
                if (introduceX) {
                    calculadora.introduceX(1);
                } else {
                    calculadora.introduceY(1);
                }
                txvDisplay.setText("1");
                break;
            case R.id.btnDos:
                if (introduceX) {
                    calculadora.introduceX(2);
                } else {
                    calculadora.introduceY(2);
                }
                txvDisplay.setText("2");
                break;
            case R.id.btnTres:
                if (introduceX) {
                    calculadora.introduceX(3);
                } else {
                    calculadora.introduceY(3);
                }
                txvDisplay.setText("3");
                break;
            case R.id.btnCuatro:
                if (introduceX) {
                    calculadora.introduceX(4);
                } else {
                    calculadora.introduceY(4);
                }
                txvDisplay.setText("4");
                break;
            case R.id.btnCinco:
                if (introduceX) {
                    calculadora.introduceX(5);
                } else {
                    calculadora.introduceY(5);
                }
                txvDisplay.setText("5");
                break;
            case R.id.btnSeis:
                if (introduceX) {
                    calculadora.introduceX(6);
                } else {
                    calculadora.introduceY(6);
                }
                txvDisplay.setText("6");
                break;
            case R.id.btnSiete:
                if (introduceX) {
                    calculadora.introduceX(7);
                } else {
                    calculadora.introduceY(7);
                }
                txvDisplay.setText("7");
                break;
            case R.id.btnOcho:
                if (introduceX) {
                    calculadora.introduceX(8);
                } else {
                    calculadora.introduceY(8);
                }
                txvDisplay.setText("8");
                break;
            case R.id.btnNueve:
                if (introduceX) {
                    calculadora.introduceX(9);
                } else {
                    calculadora.introduceY(9);
                }
                txvDisplay.setText("9");
                break;
            case R.id.btnSuma:
                calculadora.introduceOp(Operacion.SUM);
                introduceX = false;
                txvDisplay.setText("+");
                break;
            case R.id.btnResta:
                calculadora.introduceOp(Operacion.RES);
                introduceX = false;
                txvDisplay.setText("-");
                break;
            case R.id.btnMulti:
                calculadora.introduceOp(Operacion.MUL);
                introduceX = false;
                txvDisplay.setText("*");
                break;
            case R.id.btnDiv:
                calculadora.introduceOp(Operacion.DIV);
                introduceX = false;
                txvDisplay.setText("/");
                break;
        }
    }
}