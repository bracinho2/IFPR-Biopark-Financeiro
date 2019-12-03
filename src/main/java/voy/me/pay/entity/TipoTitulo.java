package voy.me.pay.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "mevoypay")
public class TipoTitulo implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    //@OneToMany(mappedBy = "tipotitulo")
    //private List<Titulo> titulosTipoTitulo;

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

    
}
