package mx.fca.listas;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolder extends RecyclerView.ViewHolder {
    TextView txvTitulo;

    public VistaHolder(@NonNull View itemView) {
        super(itemView);
        txvTitulo = itemView.findViewById(R.id.titulo);
    }
}
