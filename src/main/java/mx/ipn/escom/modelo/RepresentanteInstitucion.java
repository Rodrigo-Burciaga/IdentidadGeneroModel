/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author andii-burciaga
 */
@Entity
@Table(name = "REPRESENTANTE_INSTITUCION")
@NamedQueries({
    @NamedQuery(name = "RepresentanteInstitucion.findAll", query = "SELECT r FROM RepresentanteInstitucion r")
    , @NamedQuery(name = "RepresentanteInstitucion.findById", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.id = :id")
    , @NamedQuery(name = "RepresentanteInstitucion.findByUsuario", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.usuario = :usuario")
    , @NamedQuery(name = "RepresentanteInstitucion.findByContrase\u00f1a", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "RepresentanteInstitucion.findByNombre", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "RepresentanteInstitucion.findByApellido1", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.apellido1 = :apellido1")
    , @NamedQuery(name = "RepresentanteInstitucion.findByApellido2", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.apellido2 = :apellido2")
    , @NamedQuery(name = "RepresentanteInstitucion.findByNumeroempleado", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.numeroempleado = :numeroempleado")
    , @NamedQuery(name = "RepresentanteInstitucion.findByTelefono", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "RepresentanteInstitucion.findByCorreoelectronico", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.correoelectronico = :correoelectronico")
    , @NamedQuery(name = "RepresentanteInstitucion.findByFechainicio", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.fechainicio = :fechainicio")
    , @NamedQuery(name = "RepresentanteInstitucion.findByFechafin", query = "SELECT r FROM RepresentanteInstitucion r WHERE r.fechafin = :fechafin")})
public class RepresentanteInstitucion implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrepresentanteinst")
    private Collection<Cuestionario> cuestionarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrepinstitucion")
    private Collection<Academico> academicoCollection;
    @JoinColumn(name = "IDADMINISTRADOR", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Administrador idadministrador;
    @JoinColumn(name = "IDINSTITUCION", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Institucion idinstitucion;

    public RepresentanteInstitucion() {
    }

    public RepresentanteInstitucion(Long id) {
        this.id = id;
    }

    public RepresentanteInstitucion(Long id, String usuario, String contraseña, String nombre, String apellido1, String numeroempleado, long telefono, String correoelectronico, Date fechainicio) {
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

    public Collection<Cuestionario> getCuestionarioCollection() {
        return cuestionarioCollection;
    }

    public void setCuestionarioCollection(Collection<Cuestionario> cuestionarioCollection) {
        this.cuestionarioCollection = cuestionarioCollection;
    }

    public Collection<Academico> getAcademicoCollection() {
        return academicoCollection;
    }

    public void setAcademicoCollection(Collection<Academico> academicoCollection) {
        this.academicoCollection = academicoCollection;
    }

    public Administrador getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Administrador idadministrador) {
        this.idadministrador = idadministrador;
    }

    public Institucion getIdinstitucion() {
        return idinstitucion;
    }

    public void setIdinstitucion(Institucion idinstitucion) {
        this.idinstitucion = idinstitucion;
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
        if (!(object instanceof RepresentanteInstitucion)) {
            return false;
        }
        RepresentanteInstitucion other = (RepresentanteInstitucion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.RepresentanteInstitucion[ id=" + id + " ]";
    }
    
}
