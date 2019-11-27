package voy.me.pay.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "mevoypay")
public class Estado implements EntidadeBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="sigla")
    private String sigla;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long idEstado) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeEstado(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Cidade> getCidade() {
        return cidades;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidades = cidades;
    }
    
    

       
}
