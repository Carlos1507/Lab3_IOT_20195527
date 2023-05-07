package ayala.carlos.lab3appmovil.Dto;

import ayala.carlos.lab3appmovil.Beans.RegistroMascota;

public class RegistroHistorialDto {
    private RegistroMascota mascota;
    private String ruta;

    public RegistroHistorialDto(){

    }
    public RegistroHistorialDto(RegistroMascota mascota, String ruta){
        this.mascota = mascota;
        this.ruta = ruta;
    }
    public RegistroMascota getMascota() {
        return mascota;
    }

    public void setMascota(RegistroMascota mascota) {
        this.mascota = mascota;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        ruta = ruta + " - Lince";
        this.ruta = ruta;
    }
}
