/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import java.util.Collection;
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

/**
 *
 * @author andii-burciaga
 */
@Entity
@Table(name = "INSTITUCION")
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i")
    , @NamedQuery(name = "Institucion.findByImagen", query = "SELECT i FROM Institucion i WHERE i.imagen = :imagen")
    , @NamedQuery(name = "Institucion.findByCorreoelectronico", query = "SELECT i FROM Institucion i WHERE i.correoelectronico = :correoelectronico")
    , @NamedQuery(name = "Institucion.findByNombre", query = "SELECT i FROM Institucion i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Institucion.findByCalle", query = "SELECT i FROM Institucion i WHERE i.calle = :calle")
    , @NamedQuery(name = "Institucion.findByNumInt", query = "SELECT i FROM Institucion i WHERE i.numInt = :numInt")
    , @NamedQuery(name = "Institucion.findByNumExt", query = "SELECT i FROM Institucion i WHERE i.numExt = :numExt")
    , @NamedQuery(name = "Institucion.findByColonia", query = "SELECT i FROM Institucion i WHERE i.colonia = :colonia")
    , @NamedQuery(name = "Institucion.findByEstado", query = "SELECT i FROM Institucion i WHERE i.estado = :estado")
    , @NamedQuery(name = "Institucion.findById", query = "SELECT i FROM Institucion i WHERE i.id = :id")
    , @NamedQuery(name = "Institucion.findByAcronimo", query = "SELECT i FROM Institucion i WHERE i.acronimo = :acronimo")
    , @NamedQuery(name = "Institucion.findByTelefono", query = "SELECT i FROM Institucion i WHERE i.telefono = :telefono")
    , @NamedQuery(name = "Institucion.findByDirector", query = "SELECT i FROM Institucion i WHERE i.director = :director")
    , @NamedQuery(name = "Institucion.findByDelegacion", query = "SELECT i FROM Institucion i WHERE i.delegacion = :delegacion")
    , @NamedQuery(name = "Institucion.findByCp", query = "SELECT i FROM Institucion i WHERE i.cp = :cp")})
public class Institucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "IMAGEN")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "CORREOELECTRONICO")
    private String correoelectronico;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUM_INT")
    private Integer numInt;
    @Column(name = "NUM_EXT")
    private Integer numExt;
    @Basic(optional = false)
    @Column(name = "COLONIA")
    private String colonia;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACRONIMO")
    private String acronimo;
    @Basic(optional = false)
    @Column(name = "TELEFONO")
    private long telefono;
    @Basic(optional = false)
    @Column(name = "DIRECTOR")
    private String director;
    @Basic(optional = false)
    @Column(name = "DELEGACION")
    private String delegacion;
    @Basic(optional = false)
    @Column(name = "CP")
    private int cp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinstitucion")
    private Collection<Alumno> alumnoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinstitucion")
    private Collection<Academico> academicoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idinstitucion")
    private Collection<RepresentanteInstitucion> representanteInstitucionCollection;
    @JoinColumn(name = "IDADMINISTRADOR", referencedColumnName = "ID")
    @ManyToOne
    private Administrador idadministrador;

    public Institucion() {
    }

    public Institucion(Long id) {
        this.id = id;
    }

    public Institucion(Long id, String correoelectronico, String nombre, String calle, String colonia, String estado, String acronimo, long telefono, String director, String delegacion, int cp) {
        this.id = id;
        this.correoelectronico = correoelectronico;
        this.nombre = nombre;
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
        this.acronimo = acronimo;
        this.telefono = telefono;
        this.director = director;
        this.delegacion = delegacion;
        this.cp = cp;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumInt() {
        return numInt;
    }

    public void setNumInt(Integer numInt) {
        this.numInt = numInt;
    }

    public Integer getNumExt() {
        return numExt;
    }

    public void setNumExt(Integer numExt) {
        this.numExt = numExt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Collection<Alumno> getAlumnoCollection() {
        return alumnoCollection;
    }

    public void setAlumnoCollection(Collection<Alumno> alumnoCollection) {
        this.alumnoCollection = alumnoCollection;
    }

    public Collection<Academico> getAcademicoCollection() {
        return academicoCollection;
    }

    public void setAcademicoCollection(Collection<Academico> academicoCollection) {
        this.academicoCollection = academicoCollection;
    }

    public Collection<RepresentanteInstitucion> getRepresentanteInstitucionCollection() {
        return representanteInstitucionCollection;
    }

    public void setRepresentanteInstitucionCollection(Collection<RepresentanteInstitucion> representanteInstitucionCollection) {
        this.representanteInstitucionCollection = representanteInstitucionCollection;
    }

    public Administrador getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Administrador idadministrador) {
        this.idadministrador = idadministrador;
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
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Institucion[ id=" + id + " ]";
    }
    
}
