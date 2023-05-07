package ayala.carlos.lab3appmovil.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import ayala.carlos.lab3appmovil.Beans.RegistroMascota;

public class MainViewModel extends ViewModel {
    private MutableLiveData<RegistroMascota> mascota = new MutableLiveData<>();

    public MutableLiveData<RegistroMascota> getMascota() {
        return mascota;
    }
}
