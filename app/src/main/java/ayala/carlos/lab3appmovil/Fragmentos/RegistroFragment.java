package ayala.carlos.lab3appmovil.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ayala.carlos.lab3appmovil.ViewModel.MainViewModel;
import ayala.carlos.lab3appmovil.R;
import ayala.carlos.lab3appmovil.Beans.RegistroMascota;
import ayala.carlos.lab3appmovil.databinding.FragmentRegistroBinding;

public class RegistroFragment extends Fragment {
    FragmentRegistroBinding binding;

    public RegistroFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegistroBinding.inflate(inflater, container, false);
        MainViewModel mainViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);


        NavController navController = NavHostFragment.findNavController(RegistroFragment.this);

        binding.botonAtras.setOnClickListener(view -> {
            navController.navigate(R.id.action_registroFragment_to_principalFragment);
        });

        binding.botonRegistro.setOnClickListener(view -> {

            RegistroMascota mascota = mainViewModel.getMascota().getValue();
            mascota.setNombremascota(binding.editTextnombreMascota.getText().toString());
            mascota.setGenero(binding.spinnergenero.getSelectedItem().toString());
            mascota.setNombredueno(binding.nombredueno.getText().toString());
            mascota.setDNI(binding.editTextdni.getText().toString());
            mascota.setDescripcionmascota(binding.editTextdescripcion.getText().toString());
            mainViewModel.getMascota().postValue(mascota);

            navController.navigate(R.id.action_registroFragment_to_principalFragment);
        });


        return binding.getRoot();
    }

    public void show(){
        getView().setVisibility(View.VISIBLE);
    }
}