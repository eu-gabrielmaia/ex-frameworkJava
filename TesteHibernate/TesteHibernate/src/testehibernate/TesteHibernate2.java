/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            Loja l1 = new Loja("Nike","13678-789");
            Loja l2 = new Loja("Adidas","15432-123");
            Loja l3 = new Loja("Puma","24590-980");

            Funcionario f1 = new Funcionario("Leonardo", 16, "leomendes@gmail.com");
            Funcionario f2 = new Funcionario("Gabigol", 18, "gabigol@gmail.com");
            Funcionario f3 = new Funcionario("Natan", 30, "natanfontana@gmail.com");
            Funcionario f4 = new Funcionario("Gabriel", 20, "gabigol@gmail.com");

            Departamento d1 = new Departamento("Chuteiras", "Próximo ao estacionamento");
            Departamento d2 = new Departamento("Tênis", "Ao lado do departamento Camisas");
            Departamento d3 = new Departamento("Camisas", "Na frente dos banheiros");
            Departamento d4 = new Departamento("Bermudas", "Na frente do departamento Tênis");
            Departamento d5 = new Departamento("", "gdjakeoirncoahenisjfoisdhfiosgdjhfgsdufhsdiojbuiofsdgiufdgipudfkjvbdfkjvbsdfuvbsodfinksdjfgiuosfgibfdjbdfjsvbsiudfvksfbvsdfvuiosdbvjhfbfdv");


            session.save(l1);
            session.save(l2);
            session.save(l3);

            session.save(f1);
            session.save(f2);
            session.save(f3);

            // email duplicado
            // session.save(f4);

            session.save(d1);
            session.save(d2);
            session.save(d3);
            session.save(d4);

            //
            // session.save(d5);

            //altera dados e atualiza
            d2.setNome("Bonés");
            session.update(d2);

            //apaga
            session.delete(d4);

            session.getTransaction().commit();
            session.close();
            HibernateUtil.shutdown();
    }
}
