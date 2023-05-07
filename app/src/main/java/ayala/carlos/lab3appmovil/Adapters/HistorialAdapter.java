package ayala.carlos.lab3appmovil.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import ayala.carlos.lab3appmovil.Dto.RegistroHistorialDto;
import ayala.carlos.lab3appmovil.R;

public class HistorialAdapter extends RecyclerView.Adapter<HistorialAdapter.HistorialViewHolder>{
    private List<RegistroHistorialDto> historial;
    private Context context;

    @NonNull
    @Override
    public HistorialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new HistorialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistorialViewHolder holder, int position) {
        RegistroHistorialDto registro = historial.get(position);
        holder.registroHistorialDto = registro;

        TextView textViewNombreMascota = holder.itemView.findViewById(R.id.nombremascota);
        textViewNombreMascota.setText(registro.getMascota().getNombremascota());

        TextView textViewGenero = holder.itemView.findViewById(R.id.genero);
        textViewGenero.setText(registro.getMascota().getGenero());

        TextView textViewNombreDueno = holder.itemView.findViewById(R.id.nombredueno);
        textViewNombreDueno.setText(registro.getMascota().getNombredueno());

        TextView textViewDNI = holder.itemView.findViewById(R.id.dni);
        textViewDNI.setText(registro.getMascota().getDNI());

        TextView textViewDescripcion = holder.itemView.findViewById(R.id.descripcion);
        textViewDescripcion.setText(registro.getMascota().getDescripcionmascota());

        TextView textViewRuta = holder.itemView.findViewById(R.id.ruta);
        textViewRuta.setText(registro.getRuta());

    }

    @Override
    public int getItemCount() {
        return historial.size();
    }

    public class HistorialViewHolder extends RecyclerView.ViewHolder{
        RegistroHistorialDto registroHistorialDto;
        public HistorialViewHolder (@NotNull View itemView){
            super(itemView);
        }
    }

    public List<RegistroHistorialDto> getHistorial() {
        return historial;
    }

    public void setHistorial(List<RegistroHistorialDto> historial) {
        this.historial = historial;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
