/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andii-burciaga
 */
@Entity
@Table(name = "ACADEMICO")
@NamedQueries({
    @NamedQuery(name = "Academico.findAll", query = "SELECT a FROM Academico a")
    , @NamedQuery(name = "Academico.findById", query = "SELECT a FROM Academico a WHERE a.id = :id")
    , @NamedQuery(name = "Academico.findByUsuario", query = "SELECT a FROM Academico a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "Academico.findByContrase\u00f1a", query = "SELECT a FROM Academico a WHERE a.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Academico.findByNombre", query = "SELECT a FROM Academico a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Academico.findByApellido1", query = "SELECT a FROM Academico a WHERE a.apellido1 = :apellido1")
    , @NamedQuery(name = "Academico.findByApellido2", query = "SELECT a FROM Academico a WHERE a.apellido2 = :apellido2")
    , @NamedQuery(name = "Academico.findByNumeroempleado", query = "SELECT a FROM Academico a WHERE a.numeroempleado = :numeroempleado")
    , @NamedQuery(name = "Academico.findByTelefono", query = "SELECT a FROM Academico a WHERE a.telefono = :telefono")
    , @NamedQuery(name = "Academico.findByCorreoelectronico", query = "SELECT a FROM Academico a WHERE a.correoelectronico = :correoelectronico")
    , @NamedQuery(name = "Academico.findByFechainicio", query = "SELECT a FROM Academico a WHERE a.fechainicio = :fechainicio")
    , @NamedQuery(name = "Academico.findByFechafin", query = "SELECT a FROM Academico a WHERE a.fechafin = :fechafin")})
public class Academico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDO1")
    private String apellido1;
    @Column(name = "APELLIDO2")
    private String apellido2;
    @Basic(optional = false)
    @Column(name = "NUMEROEMPLEADO")
    private String numeroempleado;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private long telefono;
    @Basic(optional = false)
    @Column(name = "CORREOELECTRONICO")
    private String correoelectronico;
    @Basic(optional = false)
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Institucion idinstitucion;
    @JoinColumn(name = "IDREPINSTITUCION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private RepresentanteInstitucion idrepinstitucion;

    public Academico() {
    }

    public Academico(Long id) {
        this.id = id;
    }

    public Academico(Long id, String usuario, String contraseña, String nombre, String apellido1, String numeroempleado, long telefono, String correoelectronico, Date fechainicio) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.numeroempleado = numeroempleado;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
        this.fechainicio = fechainicio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNumeroempleado() {
        return numeroempleado;
    }

    public void setNumeroempleado(String numeroempleado) {
        this.numeroempleado = numeroempleado;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Institucion getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Institucion idinstitucion) {
        this.idinstitucion = idinstitucion;
    }

    public RepresentanteInstitucion getIdrepinstitucion() {
        return idrepinstitucion;
    }

    public void setIdrepinstitucion(RepresentanteInstitucion idrepinstitucion) {
        this.idrepinstitucion = idrepinstitucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Academico)) {
            return false;
        }
        Academico other = (Academico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Academico[ id=" + id + " ]";
    }
    
}
