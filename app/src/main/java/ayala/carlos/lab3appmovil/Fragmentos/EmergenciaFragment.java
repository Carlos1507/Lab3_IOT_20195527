package ayala.carlos.lab3appmovil.Fragmentos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;

import ayala.carlos.lab3appmovil.R;
import ayala.carlos.lab3appmovil.databinding.FragmentEmergenciaBinding;


public class EmergenciaFragment extends Fragment implements OnMapReadyCallback {
    FragmentEmergenciaBinding binding;
    private CountDownTimer timer;
    private GoogleMap mMap;

    public String origen="";

    public EmergenciaFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmergenciaBinding.inflate(inflater, container, false);

        HashMap<String, Integer> tiempos = new HashMap<>();
        tiempos.put("Lince",10);
        tiempos.put("San Isidro",15);
        tiempos.put("Magdalena",20);
        tiempos.put("Jesús María",25);
        binding.contador.setVisibility(View.INVISIBLE);
        binding.minutos.setVisibility(View.INVISIBLE);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.setMenuVisibility(false);
        binding.botonCalcular.setOnClickListener(view -> {
            binding.contador.setVisibility(View.VISIBLE);
            binding.minutos.setVisibility(View.VISIBLE);
            origen = binding.origen.getSelectedItem().toString();
            Integer tiempoSecond = tiempos.get(origen)*60000;
            timer = new CountDownTimer(tiempoSecond, 1000) {
                @Override
                public void onTick(long l) {
                    long seconds = l/1000;
                    long minutes = seconds/60;
                    String time = String.format("%02d:%02d",minutes, seconds%60);
                    binding.contador.setText(time);
                }
                @Override
                public void onFinish() {
                    binding.contador.setText("00:00");
                }
            };
            timer.start();

            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

        });

        return binding.getRoot();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng origenLatLng = new LatLng(-12.084538, -77.031396);
        if(origen.equals("Lince")){
            origenLatLng = new LatLng(-12.086760, -77.033885);
        }else if(origen.equals("Jesús María")){
            origenLatLng = new LatLng(-12.085165, -77.051051);
        } else if (origen.equals("Magdalena")) {
            origenLatLng = new LatLng(-12.090506, -77.074683);
        } else if (origen.equals("San Isidro")) {
            origenLatLng = new LatLng(-12.095842, -77.038588);
        }else{
            origenLatLng = new LatLng(-12.084538, -77.031396);
        }

        LatLng clinica = new LatLng(-12.084538, -77.031396);
        mMap.addMarker(new MarkerOptions()
                .position(clinica)
                .title("Clínica"));
        mMap.addMarker(new MarkerOptions().position(origenLatLng).title("Origen"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(clinica));
    }
}