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
@Table(name = "user_answer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAnswer.findAll", query = "SELECT u FROM UserAnswer u"),
    @NamedQuery(name = "UserAnswer.findById", query = "SELECT u FROM UserAnswer u WHERE u.id = :id"),
    @NamedQuery(name = "UserAnswer.findByIdUser", query = "SELECT u FROM UserAnswer u WHERE u.idUser = :idUser"),
    @NamedQuery(name = "UserAnswer.findByIdQuestion", query = "SELECT u FROM UserAnswer u WHERE u.idQuestion = :idQuestion"),
    @NamedQuery(name = "UserAnswer.findByAnswer", query = "SELECT u FROM UserAnswer u WHERE u.answer = :answer")})
public class UserAnswer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_user")
    private int idUser;
    @Basic(optional = false)
    @Column(name = "id_question")
    private int idQuestion;
    @Basic(optional = false)
    @Column(name = "answer")
    private boolean answer;

    public UserAnswer() {
    }

    public UserAnswer(Integer id) {
        this.id = id;
    }

    public UserAnswer(Integer id, int idUser, int idQuestion, boolean answer) {
        this.id = id;
        this.idUser = idUser;
        this.idQuestion = idQuestion;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
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
        if (!(object instanceof UserAnswer)) {
            return false;
        }
        UserAnswer other = (UserAnswer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "webService.UserAnswer[ id=" + id + " ]";
    }
    
}
