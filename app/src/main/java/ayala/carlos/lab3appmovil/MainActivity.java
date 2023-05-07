package ayala.carlos.lab3appmovil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

import ayala.carlos.lab3appmovil.Beans.RegistroMascota;
import ayala.carlos.lab3appmovil.ViewModel.MainViewModel;
import ayala.carlos.lab3appmovil.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Ambulancias Mascotín");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.plomo)));
        RegistroMascota mascota = new RegistroMascota();
        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getMascota().setValue(mascota);
    }
}