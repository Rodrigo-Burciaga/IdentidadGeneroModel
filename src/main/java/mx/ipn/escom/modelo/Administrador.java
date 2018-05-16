/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "ADMINISTRADOR")
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a")
    , @NamedQuery(name = "Administrador.findById", query = "SELECT a FROM Administrador a WHERE a.id = :id")
    , @NamedQuery(name = "Administrador.findByUsuario", query = "SELECT a FROM Administrador a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "Administrador.findByContrase\u00f1a", query = "SELECT a FROM Administrador a WHERE a.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Administrador.findByApellido1", query = "SELECT a FROM Administrador a WHERE a.apellido1 = :apellido1")
    , @NamedQuery(name = "Administrador.findByApellido2", query = "SELECT a FROM Administrador a WHERE a.apellido2 = :apellido2")
    , @NamedQuery(name = "Administrador.findByNumeroempleado", query = "SELECT a FROM Administrador a WHERE a.numeroempleado = :numeroempleado")
    , @NamedQuery(name = "Administrador.findByTelefono", query = "SELECT a FROM Administrador a WHERE a.telefono = :telefono")
    , @NamedQuery(name = "Administrador.findByCorreoelectronico", query = "SELECT a FROM Administrador a WHERE a.correoelectronico = :correoelectronico")
    , @NamedQuery(name = "Administrador.findByFechainicio", query = "SELECT a FROM Administrador a WHERE a.fechainicio = :fechainicio")
    , @NamedQuery(name = "Administrador.findByFechafin", query = "SELECT a FROM Administrador a WHERE a.fechafin = :fechafin")})
public class Administrador implements Serializable {

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
    private Long telefono;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idadministrador", fetch = FetchType.EAGER)
    private List<RepresentanteInstitucion> representanteInstitucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idadministrador", fetch = FetchType.EAGER)
    private List<Institucion> institucionList;

    public Administrador() {
    }

    public Administrador(Long id) {
        this.id = id;
    }

    public Administrador(Long id, String usuario, String contraseña, String nombre, String apellido1, String numeroempleado, long telefono, String correoelectronico, Date fechainicio) {
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

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
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

    public List<RepresentanteInstitucion> getRepresentanteInstitucionList() {
        return representanteInstitucionList;
    }

    public void setRepresentanteInstitucionList(List<RepresentanteInstitucion> representanteInstitucionList) {
        this.representanteInstitucionList = representanteInstitucionList;
    }

    public List<Institucion> getInstitucionList() {
        return institucionList;
    }

    public void setInstitucionList(List<Institucion> institucionList) {
        this.institucionList = institucionList;
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
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Administrador[ id=" + id + " ]";
    }
    
}
