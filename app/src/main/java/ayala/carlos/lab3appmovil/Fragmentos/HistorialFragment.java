package ayala.carlos.lab3appmovil.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ayala.carlos.lab3appmovil.Adapters.HistorialAdapter;
import ayala.carlos.lab3appmovil.Beans.RegistroMascota;
import ayala.carlos.lab3appmovil.Dto.RegistroHistorialDto;
import ayala.carlos.lab3appmovil.MainActivity;
import ayala.carlos.lab3appmovil.databinding.FragmentHistorialBinding;

public class HistorialFragment extends Fragment {
    FragmentHistorialBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHistorialBinding.inflate(inflater, container, false);

        List<RegistroHistorialDto> listaRegistros = new ArrayList<>();

        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Peluche","Masculino","Alonso",
                                            "25865489","Intoxicacion"),"Lince"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Maria Antonieta","Femenino","Maria",
                                             "08104081","Parto"), "Jesús María"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Candy","Femenino","Aracelli",
                                            "46285087", "Dolor cadera"), "San Isidro"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Reyna","Femenino","Patricia",
                                            "94491616", "Fractura"), "Magdalena"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Peluche","Masculino","Alonso",
                        "25865489","Intoxicacion"),"Lince"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Maria Antonieta","Femenino","Maria",
                        "08104081","Parto"), "Jesús María"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Candy","Femenino","Aracelli",
                        "46285087", "Dolor cadera"), "San Isidro"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Reyna","Femenino","Patricia",
                        "94491616", "Fractura"), "Magdalena"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Peluche","Masculino","Alonso",
                        "25865489","Intoxicacion"),"Lince"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Maria Antonieta","Femenino","Maria",
                        "08104081","Parto"), "Jesús María"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Candy","Femenino","Aracelli",
                        "46285087", "Dolor cadera"), "San Isidro"));
        listaRegistros.add(new RegistroHistorialDto(
                new RegistroMascota("Reyna","Femenino","Patricia",
                        "94491616", "Fractura"), "Magdalena"));

        HistorialAdapter adapter = new HistorialAdapter();
        adapter.setContext(getContext());
        adapter.setHistorial(listaRegistros);

        binding.recyclerhistorial.setAdapter(adapter);
        binding.recyclerhistorial.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }


}