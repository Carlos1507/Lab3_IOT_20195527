package ayala.carlos.lab3appmovil.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ayala.carlos.lab3appmovil.databinding.FragmentEmergenciaBinding;


public class EmergenciaFragment extends Fragment {
    FragmentEmergenciaBinding binding;

    public EmergenciaFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmergenciaBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}