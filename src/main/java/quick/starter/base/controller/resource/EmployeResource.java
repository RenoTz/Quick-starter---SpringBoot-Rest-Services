package quick.starter.base.controller.resource;

public class EmployeResource
{
    private Long id;

    private String nom;

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

    public void setNom(final String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public void setPrenom(final String prenom)
    {
        this.prenom = prenom;
    }

}
