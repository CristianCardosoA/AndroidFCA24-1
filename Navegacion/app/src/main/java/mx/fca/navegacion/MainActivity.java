package mx.fca.navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cristian(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra(BundleKeys.NAME, "CRISTIAN");
        Toast.makeText(this, "Cristian ha sido seleccionado", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

    public void pablo(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra(BundleKeys.NAME, "PABLO");
        Toast.makeText(this, "Cristian ha sido seleccionado", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}