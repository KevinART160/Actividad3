
package dane; 

public class Departamento {
    
    private String nombreDepartamento;
    private int numMunicipios;
    private double extension;
    private int numHabitantes;
    private double temperatura;
    private String indicativo;

    public Departamento(String nombreDepartamento, int numMunicipios, double extension, int numHabitantes, double temperatura, String indicativo) {
        this.nombreDepartamento = nombreDepartamento;
        this.numMunicipios = numMunicipios;
        this.extension = extension;
        this.numHabitantes = numHabitantes;
        this.temperatura = temperatura;
        this.indicativo = indicativo;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getNumMunicipios() {
        return numMunicipios;
    }

    public void setNumMunicipios(int numMunicipios) {
        this.numMunicipios = numMunicipios;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDepartamento='" + nombreDepartamento + '\'' +
                ", numMunicipios=" + numMunicipios +
                ", extension=" + extension +
                ", numHabitantes=" + numHabitantes +
                ", temperatura=" + temperatura +
                ", indicativo='" + indicativo + '\'' +
                '}';
    }
}
