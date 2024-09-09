package testehibernate;


import javax.persistence.*;

@Entity
@Table
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int codLoja;

    @Column
    private String nome;

    @Column
    private String cep;

    public Loja(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
