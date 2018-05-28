/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.escom.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author andii-burciaga
 */
@Entity
@Table(name = "PUNTUACION")
@NamedQueries({
    @NamedQuery(name = "Puntuacion.findAll", query = "SELECT p FROM Puntuacion p")
    , @NamedQuery(name = "Puntuacion.findById", query = "SELECT p FROM Puntuacion p WHERE p.id = :id")
    , @NamedQuery(name = "Puntuacion.findByPuntuacion", query = "SELECT p FROM Puntuacion p WHERE p.puntuacion = :puntuacion")})
public class Puntuacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(generator = "PuntuacionSeq")
    @SequenceGenerator(name = "PuntuacionSeq", sequenceName = "PUNTUACION_SEQ", allocationSize = 1)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PUNTUACION")
    private Integer puntuacion;
    @JoinColumn(name = "IDGENERO", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Genero idgenero;
    @JoinColumn(name = "IDOPCIONRESPUESTA", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private OpcionRespuesta idopcionrespuesta;

    public Puntuacion() {
    }

    public Puntuacion(Long id) {
        this.id = id;
    }

    public Puntuacion(Long id, Integer puntuacion) {
        this.id = id;
        this.puntuacion = puntuacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Genero getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Genero idgenero) {
        this.idgenero = idgenero;
    }

    public OpcionRespuesta getIdopcionrespuesta() {
        return idopcionrespuesta;
    }

    public void setIdopcionrespuesta(OpcionRespuesta idopcionrespuesta) {
        this.idopcionrespuesta = idopcionrespuesta;
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
        if (!(object instanceof Puntuacion)) {
            return false;
        }
        Puntuacion other = (Puntuacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Puntuacion[ id=" + id + " ]";
    }
    
}
