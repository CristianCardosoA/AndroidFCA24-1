package mx.fca.listas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<VistaHolder> {

    private Contacto[] elementos;
    public Adaptador(Contacto[] elementos) {
        this.elementos = elementos;
    }

    public void refresh(Contacto[] elementos){
        this.elementos = elementos;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public VistaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_lista, parent, false);
        return new VistaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VistaHolder holder, int position) {
        Contacto contacto = elementos[position];
        holder.txvNombre.setText(contacto.nombre);
        holder.txvTelefono.setText(contacto.telefono);
        holder.imgFotografia.setImageResource(contacto.fotografia);
        holder.setContact(contacto);
    }

    @Override
    public int getItemCount() {
        return elementos.length;
    }
}
