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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author andii-burciaga
 */
@Entity
@Table(name = "PREGUNTA")
@NamedQueries({
    @NamedQuery(name = "Pregunta.findAll", query = "SELECT p FROM Pregunta p")
    , @NamedQuery(name = "Pregunta.findById", query = "SELECT p FROM Pregunta p WHERE p.id = :id")
    , @NamedQuery(name = "Pregunta.findByPregunta", query = "SELECT p FROM Pregunta p WHERE p.pregunta = :pregunta")})
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(generator = "PreguntaSeq")
    @SequenceGenerator(name = "PreguntaSeq", sequenceName = "PREGUNTA_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "PREGUNTA")
    private String pregunta;
    @JoinColumn(name = "IDSECCION", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Seccion idseccion;
    @JoinColumn(name = "IDTIPO", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tipo idtipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpregunta", fetch = FetchType.EAGER)
    private List<OpcionRespuesta> opcionRespuestaList;

    public Pregunta() {
    }

    public Pregunta(Long id) {
        this.id = id;
    }

    public Pregunta(Long id, String pregunta) {
        this.id = id;
        this.pregunta = pregunta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Seccion getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Seccion idseccion) {
        this.idseccion = idseccion;
    }

    public Tipo getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(Tipo idtipo) {
        this.idtipo = idtipo;
    }

    public List<OpcionRespuesta> getOpcionRespuestaList() {
        return opcionRespuestaList;
    }

    public void setOpcionRespuestaList(List<OpcionRespuesta> opcionRespuestaList) {
        this.opcionRespuestaList = opcionRespuestaList;
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
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.ipn.escom.modelo.Pregunta[ id=" + id + " ]";
    }
    
}
