package quick.starter.base.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class Employe
{

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    public Long getId()
    {

        return this.id;
    }

    public void setId(final Long id)
    {

        this.id = id;
    }

    public String getNom()
    {

        return this.nom;
    }

    public String getPrenom()
    {

        return this.prenom;
    }

    public void setNom(final String nom)
    {

        this.nom = nom;
    }

    public void setPrenom(final String prenom)
    {

        this.prenom = prenom;
    }

}
