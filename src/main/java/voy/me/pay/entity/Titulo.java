package voy.me.pay.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "mevoypay")
public class Titulo implements EntidadeBase {

    //atributos da classe título;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="numeroTitulo")
    private int numeroTitulo;
    
    @Column(name="numeroParcelasTitulo")
    private int numeroParcelaTitulo;
    
    @Column(name="dataHoraCadastro")
    private Date dataHoraCadastroTitulo;
    
    @Column(name="vencimento")
    private Date dataVencimento;
    
    @Column(name="valor")
    private float valor;
    
    @Column(name="status") //pendente, liquidado
    private String status;
    
    @Column(name="registroAtivo")
    private int registroAtivoTitulo;
    
    //@ManyToOne(cascade = CascadeType.PERSIST)
    //private TipoTitulo tipoTitulo;
    
    @Column(name="categoria")
    private String categoriaTitulo;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Categoria categoria;
    
    
    
    //@ManyToOne(cascade = CascadeType.PERSIST)
    //private Pessoa pessoa;

    @Override
    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    
    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public int getNumeroParcelaTitulo() {
        return numeroParcelaTitulo;
    }

    public void setNumeroParcelaTitulo(int numeroParcelaTitulo) {
        this.numeroParcelaTitulo = numeroParcelaTitulo;
    }

    public Date getDataHoraCadastroTitulo() {
        return dataHoraCadastroTitulo;
    }

    public void setDataHoraCadastroTitulo(Date dataHoraCadastroTitulo) {
        this.dataHoraCadastroTitulo = dataHoraCadastroTitulo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRegistroAtivoTitulo() {
        return registroAtivoTitulo;
    }

    public void setRegistroAtivoTitulo(int registroAtivoTitulo) {
        this.registroAtivoTitulo = registroAtivoTitulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCategoriaTitulo() {
        return categoriaTitulo;
    }

    public void setCategoriaTitulo(String categoriaTitulo) {
        this.categoriaTitulo = categoriaTitulo;
    }

    
    
}
