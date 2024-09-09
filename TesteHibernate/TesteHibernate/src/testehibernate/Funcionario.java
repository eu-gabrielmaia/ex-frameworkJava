package testehibernate;

import javax.persistence.*;

@Entity
@Table
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int codFuncionario;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column(unique = true)
    private String email;


    public Funcionario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
