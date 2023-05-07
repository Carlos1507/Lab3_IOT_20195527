package ayala.carlos.lab3appmovil.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ayala.carlos.lab3appmovil.ViewModel.MainViewModel;
import ayala.carlos.lab3appmovil.R;
import ayala.carlos.lab3appmovil.Beans.RegistroMascota;
import ayala.carlos.lab3appmovil.databinding.FragmentPrincipalBinding;

public class PrincipalFragment extends Fragment {
    public PrincipalFragment() {
        // Required empty public constructor
    }
    FragmentPrincipalBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPrincipalBinding.inflate(inflater, container, false);

        NavController navController = NavHostFragment.findNavController(PrincipalFragment.this);
        binding.botonRegistro.setOnClickListener(view -> {
            navController.navigate(R.id.action_principalFragment_to_registroFragment);
        });
        binding.botonEmergencia.setOnClickListener(view -> {
            navController.navigate(R.id.action_principalFragment_to_emergenciaFragment);
        });
        binding.botonHistorial.setOnClickListener(view -> {
            navController.navigate(R.id.action_principalFragment_to_historialFragment);
        });

        MainViewModel viewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        viewModel.getMascota().observe(getViewLifecycleOwner(), new Observer<RegistroMascota>() {
            @Override
            public void onChanged(RegistroMascota mascota) {
                Log.d("mascota", "nombre "+ mascota.getNombremascota());
            }
        });

        return binding.getRoot();
    }
}