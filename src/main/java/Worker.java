public class Worker {
    private final String trabajador;
    private final String hmin;
    private final String hmax;
    private final String dia;
    private final String tramo;
    private final String ntienda;
    private final String nalmacen;

    public Worker(String trabajador, String hmin, String hmax, String dia, String tramo, String ntienda, String nalmacen) {
        this.trabajador = trabajador;
        this.hmin = hmin;
        this.hmax = hmax;
        this.dia = dia;
        this.tramo = tramo;
        this.ntienda = ntienda;
        this.nalmacen = nalmacen;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public String getHmin() {
        return hmin;
    }

    public String getHmax() {
        return hmax;
    }

    public String getDia() {
        return dia;
    }

    public String getTramo() {
        return tramo;
    }

    public String getNtienda() {
        return ntienda;
    }

    public String getNalmacen() {
        return nalmacen;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "trabajador='" + trabajador + '\'' +
                ", hmin='" + hmin + '\'' +
                ", hmax='" + hmax + '\'' +
                ", dia='" + dia + '\'' +
                ", tramo='" + tramo + '\'' +
                ", ntienda='" + ntienda + '\'' +
                ", nalmacen='" + nalmacen + '\'' +
                '}';
    }
}
