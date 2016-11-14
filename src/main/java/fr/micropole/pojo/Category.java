package fr.micropole.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "Categorie" )
public class Category implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6838025340162577907L;

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer           id;

    @NotNull
    private String            name;

    private String            description;

    @OneToMany( mappedBy = "category" )
    private List<Transaction> transactions;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category [id=" + getId() + ", name=" + name + ", description=" + description + "]";
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions( List<Transaction> transactions ) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( description == null ) ? 0 : description.hashCode() );
        result = prime * result + ( ( getId() == null ) ? 0 : getId().hashCode() );
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        result = prime * result + ( ( transactions == null ) ? 0 : transactions.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Category other = (Category) obj;
        if ( description == null ) {
            if ( other.description != null )
                return false;
        } else if ( !description.equals( other.description ) )
            return false;
        if ( getId() == null ) {
            if ( other.getId() != null )
                return false;
        } else if ( !getId().equals( other.getId() ) )
            return false;
        if ( name == null ) {
            if ( other.name != null )
                return false;
        } else if ( !name.equals( other.name ) )
            return false;
        if ( transactions == null ) {
            if ( other.transactions != null )
                return false;
        } else if ( !transactions.equals( other.transactions ) )
            return false;
        return true;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

}
