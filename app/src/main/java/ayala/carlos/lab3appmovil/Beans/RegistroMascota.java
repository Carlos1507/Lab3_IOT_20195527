package ayala.carlos.lab3appmovil.Beans;

public class RegistroMascota {
    private String nombremascota;
    private String genero;
    private String nombredueno;
    private String DNI;
    private String descripcionmascota;

    public RegistroMascota(){

    }

    public RegistroMascota(String nombremascota, String genero, String nombredueno, String DNI, String descripcionmascota){
        this.nombremascota = nombremascota;
        this.genero = genero;
        this.nombredueno = nombredueno;
        this.DNI = DNI;
        this.descripcionmascota = descripcionmascota;
    }
    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombredueno() {
        return nombredueno;
    }

    public void setNombredueno(String nombredueno) {
        this.nombredueno = nombredueno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDescripcionmascota() {
        return descripcionmascota;
    }

    public void setDescripcionmascota(String descripcionmascota) {
        this.descripcionmascota = descripcionmascota;
    }
}
