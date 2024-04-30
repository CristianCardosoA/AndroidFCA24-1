package mx.fca.listas;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolder extends RecyclerView.ViewHolder {
    TextView txvNombre;
    TextView txvTelefono;
    ImageView imgFotografia;
    Contacto contacto;

    public VistaHolder(@NonNull View itemView) {
        super(itemView);

        txvNombre = itemView.findViewById(R.id.nombre);
        txvTelefono = itemView.findViewById(R.id.telefono);
        imgFotografia = itemView.findViewById(R.id.fotografia);

        itemView.setOnClickListener(v -> {
            if (contacto != null) {
                Intent i = new Intent(v.getContext(), DetalleActivity.class);
                i.putExtra("CONTACTO_ID", contacto.id);
                v.getContext().startActivity(i);
            }
        });
    }

    public void setContact(Contacto contacto) {
        this.contacto = contacto;
    }
}
