/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author f.muratorio
 */
@Entity
@Table(name = "question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Question.findAll", query = "SELECT q FROM Question q"),
    @NamedQuery(name = "Question.findById", query = "SELECT q FROM Question q WHERE q.id = :id"),
    @NamedQuery(name = "Question.findByDescription", query = "SELECT q FROM Question q WHERE q.description = :description"),
    @NamedQuery(name = "Question.findByValueYes", query = "SELECT q FROM Question q WHERE q.valueYes = :valueYes"),
    @NamedQuery(name = "Question.findByValueNo", query = "SELECT q FROM Question q WHERE q.valueNo = :valueNo"),
    @NamedQuery(name = "Question.findByIdCategory", query = "SELECT q FROM Question q WHERE q.idCategory = :idCategory")})
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "value_yes")
    private int valueYes;
    @Basic(optional = false)
    @Column(name = "value_no")
    private int valueNo;
    @Basic(optional = false)
    @Column(name = "id_category")
    private int idCategory;

    public Question() {
    }

    public Question(Integer id) {
        this.id = id;
    }

    public Question(Integer id, String description, int valueYes, int valueNo, int idCategory) {
        this.id = id;
        this.description = description;
        this.valueYes = valueYes;
        this.valueNo = valueNo;
        this.idCategory = idCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValueYes() {
        return valueYes;
    }

    public void setValueYes(int valueYes) {
        this.valueYes = valueYes;
    }

    public int getValueNo() {
        return valueNo;
    }

    public void setValueNo(int valueNo) {
        this.valueNo = valueNo;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
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
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "webService.Question[ id=" + id + " ]";
    }
    
}
