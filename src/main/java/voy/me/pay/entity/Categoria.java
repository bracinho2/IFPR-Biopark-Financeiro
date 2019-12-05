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
public class Categoria implements EntidadeBase, Serializable, Comparable<Categoria> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="registroAtivo")
    private int registroAtivo;
    
    @OneToMany(mappedBy = "categoria")
    private List<Titulo> categoriaTitulos;
    
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

    public int getRegistroAtivo() {
        return registroAtivo;
    }

    public void setRegistroAtivo(int registroAtivo) {
        this.registroAtivo = registroAtivo;
    }

    public List<Titulo> getCategoriaTitulos() {
        return categoriaTitulos;
    }

    public void setCategoriaTitulos(List<Titulo> categoriaTitulos) {
        this.categoriaTitulos = categoriaTitulos;
    }

    @Override
    public int compareTo(Categoria o) {
        return getNome().compareTo(o.getNome());
    }

    
    
}
