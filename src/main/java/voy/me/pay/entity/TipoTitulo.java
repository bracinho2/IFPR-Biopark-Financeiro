package voy.me.pay.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "mevoypay")
public class TipoTitulo implements EntidadeBase, Serializable, Comparable<TipoTitulo> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @OneToMany(mappedBy = "tipoTitulo")
    private List<Titulo> titulosTipoTitulo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Titulo> getTitulosTipoTitulo() {
        return titulosTipoTitulo;
    }

    public void setTitulosTipoTitulo(List<Titulo> titulosTipoTitulo) {
        this.titulosTipoTitulo = titulosTipoTitulo;
    }

    @Override
    public int compareTo(TipoTitulo o) {
        return getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoTitulo other = (TipoTitulo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
}
