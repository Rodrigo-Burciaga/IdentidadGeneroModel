/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "CUESTIONARIO")
@NamedQueries({
    @NamedQuery(name = "Cuestionario.findAll", query = "SELECT c FROM Cuestionario c")
    , @NamedQuery(name = "Cuestionario.findById", query = "SELECT c FROM Cuestionario c WHERE c.id = :id")
    , @NamedQuery(name = "Cuestionario.findByNombre", query = "SELECT c FROM Cuestionario c WHERE c.nombre = :nombre")})
public class Cuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "IDREPRESENTANTEINST", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private RepresentanteInstitucion idrepresentanteinst;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcuestionario", fetch = FetchType.EAGER)
    private List<Categoria> categoriaList;

    public Cuestionario() {
    }

    public Cuestionario(Long id) {
        this.id = id;
    }

    public Cuestionario(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RepresentanteInstitucion getIdrepresentanteinst() {
        return idrepresentanteinst;
    }

    public void setIdrepresentanteinst(RepresentanteInstitucion idrepresentanteinst) {
        this.idrepresentanteinst = idrepresentanteinst;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
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
        if (!(object instanceof Cuestionario)) {
            return false;
        }
        Cuestionario other = (Cuestionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Cuestionario[ id=" + id + " ]";
    }
    
}
