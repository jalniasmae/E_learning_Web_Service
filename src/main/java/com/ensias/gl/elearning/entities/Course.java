package com.ensias.gl.elearning.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Course implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long              id;
    private String            nomCourse;
    private int               dureeCourse;
    private String            niveauDif;
    private Date              dateCreation;
    private int               nbrChapter;

    public Course() {
        super();
    }

    public Course(Long id, String nomCourse, int dureeCourse, String niveauDif, Date dateCreation, int nbrChapter) {
        super();
        this.id           = id;
        this.nomCourse    = nomCourse;
        this.dureeCourse  = dureeCourse;
        this.niveauDif    = niveauDif;
        this.dateCreation = dateCreation;
        this.nbrChapter   = nbrChapter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCourse() {
        return nomCourse;
    }

    public void setNomCourse(String nomCourse) {
        this.nomCourse = nomCourse;
    }

    public int getDureeCourse() {
        return dureeCourse;
    }

    public void setDureeCourse(int dureeCourse) {
        this.dureeCourse = dureeCourse;
    }

    public String getNiveauDif() {
        return niveauDif;
    }

    public void setNiveauDif(String niveauDif) {
        this.niveauDif = niveauDif;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getNbrChapter() {
        return nbrChapter;
    }

    public void setNbrChapter(int nbrChapter) {
        this.nbrChapter = nbrChapter;
    }

}
