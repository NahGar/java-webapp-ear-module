package org.ngarcia.webapp.ear.ejb;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.*;

@ApplicationScoped
public class ProducerResources {

    //definido en persistence.xml
    @PersistenceUnit(name="ejemploJpa")
    private EntityManagerFactory emf;

    @Produces
    @RequestScoped
    private EntityManager beanEntityManager() {
        return emf.createEntityManager();
    }

    public void close(@Disposes EntityManager entityManager) {
        if(entityManager.isOpen()) {
            entityManager.close();
            System.out.println("Cerrando conn entity manager");
        }
    }
}
