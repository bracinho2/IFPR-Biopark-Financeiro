package voy.me.pay.entity;


import java.io.Serializable;
import java.util.Comparator;
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


//A classe vai implemntar a EntidadeBase para assinar o contrato de utilização do banco de dados;
//As anotações fazem com que o JPA/Hibernate marquem as classes e atribuitos para enviar ao banco relacional;
//As marcações da JPA atuam como identificação para a manipulação de dados junto ao SGDB;
@Entity
@Table(schema = "mevoypay")
public class Pessoa implements EntidadeBase, Serializable, Comparable<Pessoa> {
    
       
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="cpfCnpj")
    private String cpfCnpj;
    
    @Column(name="email")
    private String email;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="endereco")
    private String endereco;
    
    @Column(name="enderecoNumero")
    private String enderecoNumero;
    
    @Column(name="bairro")
    private String bairro;
    
    @Column(name="complemento")
    private String complemento;
    
    @Column(name="cidade")
    private String cidade;
    
    @Column(name="estado")
    private String estado;
    
    @Column(name="cliente")
    private int cliente;
    
    @Column(name="fornecedor")
    private int fornecedor;
    
    @Column(name="registroAtivo")
    private int registroAtivo;
    
    @OneToMany(mappedBy = "pessoa")
    private List<Titulo> titulos;

    @Override
    public Long getId() {
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getRegistroAtivo() {
        return registroAtivo;
    }

    public void setRegistroAtivo(int registroAtivo) {
        this.registroAtivo = registroAtivo;
    }

    @Override
    public int compareTo(Pessoa o) {
        return getNome().compareTo(o.getNome());
    }

        
            
}
