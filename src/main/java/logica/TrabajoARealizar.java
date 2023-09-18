package logica;

import java.math.BigDecimal;
import java.util.Date;

public class TrabajoARealizar {
    private long id;
    private String nombre;
    private String descripcion;
    private EstadoTrabajo estado;
    private Date fechaRecibo;
    private Date fechaEntrega;
    private long clienteId;
    private TipoEquipo tipoEquipo;
    private String modeloEquipo;
    private PrioridadTrabajo prioridad;
    private long asignadoA;
    private String comentarios;
    private BigDecimal ganancia;

    public enum EstadoTrabajo {
        ENTREGADO, INICIADO, SIN_INICIAR, TERMINADO
    }

    public enum TipoEquipo {
        ALTAVOZ, ALTAVOZ_BLUETOOT, CONSOLA, JOYSTICK, NOTEBOOK, PC_DE_ESCRITORIO
    }

    public enum PrioridadTrabajo {
        ALTA, BAJA, MEDIA
    }

    
    public TrabajoARealizar() {
    }


    public TrabajoARealizar(long id, String nombre, String descripcion, EstadoTrabajo estado, Date fechaRecibo,
                            Date fechaEntrega, long clienteId, TipoEquipo tipoEquipo, String modeloEquipo,
                            PrioridadTrabajo prioridad, long asignadoA, String comentarios, BigDecimal ganancia) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaRecibo = fechaRecibo;
        this.fechaEntrega = fechaEntrega;
        this.clienteId = clienteId;
        this.tipoEquipo = tipoEquipo;
        this.modeloEquipo = modeloEquipo;
        this.prioridad = prioridad;
        this.asignadoA = asignadoA;
        this.comentarios = comentarios;
        this.ganancia = ganancia;
    }


    @Override
    public String toString() {
        return "TrabajoARealizar [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion +
               ", estado=" + estado + ", fechaRecibo=" + fechaRecibo + ", fechaEntrega=" + fechaEntrega +
               ", clienteId=" + clienteId + ", tipoEquipo=" + tipoEquipo + ", modeloEquipo=" + modeloEquipo +
               ", prioridad=" + prioridad + ", asignadoA=" + asignadoA + ", comentarios=" + comentarios +
               ", ganancia=" + ganancia + "]";
    }
}
