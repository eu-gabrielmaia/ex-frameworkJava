package testehibernate;


import javax.persistence.*;

@Entity
@Table

public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int codDepartamento;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String descricao;

    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
