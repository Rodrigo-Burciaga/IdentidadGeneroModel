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
@Table(name = "OPCION_RESPUESTA")
@NamedQueries({
    @NamedQuery(name = "OpcionRespuesta.findAll", query = "SELECT o FROM OpcionRespuesta o")
    , @NamedQuery(name = "OpcionRespuesta.findById", query = "SELECT o FROM OpcionRespuesta o WHERE o.id = :id")
    , @NamedQuery(name = "OpcionRespuesta.findByOpcion", query = "SELECT o FROM OpcionRespuesta o WHERE o.opcion = :opcion")})
public class OpcionRespuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "OPCION")
    private String opcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idopcion", fetch = FetchType.EAGER)
    private List<Respuesta> respuestaList;
    @JoinColumn(name = "IDPREGUNTA", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Pregunta idpregunta;
    @JoinColumn(name = "IDPUNTUACION", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Puntuacion idpuntuacion;

    public OpcionRespuesta() {
    }

    public OpcionRespuesta(Long id) {
        this.id = id;
    }

    public OpcionRespuesta(Long id, String opcion) {
        this.id = id;
        this.opcion = opcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public List<Respuesta> getRespuestaList() {
        return respuestaList;
    }

    public void setRespuestaList(List<Respuesta> respuestaList) {
        this.respuestaList = respuestaList;
    }

    public Pregunta getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(Pregunta idpregunta) {
        this.idpregunta = idpregunta;
    }

    public Puntuacion getIdpuntuacion() {
        return idpuntuacion;
    }

    public void setIdpuntuacion(Puntuacion idpuntuacion) {
        this.idpuntuacion = idpuntuacion;
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
        if (!(object instanceof OpcionRespuesta)) {
            return false;
        }
        OpcionRespuesta other = (OpcionRespuesta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.OpcionRespuesta[ id=" + id + " ]";
    }
    
}
