package tp7P2;

public class Empleado {

    private String nombre;
    private Integer sueldo;
    private Integer legajo;

    public Empleado() {
        super();
    }

    //ahora valida y lanza excepciones si hay datos invalidos
    public Empleado(String nombre, Integer sueldo) throws StringException, EnteroPositivoException {
        super();

        // Validación del nombre
        if (nombre == null || nombre.length() < 3) {
            throw new StringException("El nombre del empleado debe tener 3 o más caracteres.");
        }

        // Validacion del sueldo
        if (sueldo == null || sueldo <= 0) {
            throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
        }

        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Empleado(Integer sueldo) {
        super();
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    // ahora valida y lanza StringException
    public void setNombre(String nombre) throws StringException {
        if (nombre == null || nombre.length() < 3) {
            throw new StringException("El nombre del empleado debe tener 3 o más caracteres.");
        }
        this.nombre = nombre;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    //ahora valida y lanza EnteroPositivoException
    public void setSueldo(Integer sueldo) throws EnteroPositivoException {
        if (sueldo == null || sueldo <= 0) {
            throw new EnteroPositivoException("El sueldo del empleado debe ser mayor a 0.");
        }
        this.sueldo = sueldo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    // modificado: valida legajo positivo
    public void setLegajo(Integer legajo) throws EnteroPositivoException {
        if (legajo == null || legajo <= 0) {
            throw new EnteroPositivoException("El legajo del empleado debe ser mayor a 0.");
        }
        this.legajo = legajo;
    }

    public String getSueldoString() {
        return "$" + sueldo;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getSueldoString();
    }
}
