package org.example;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Student student = new Student();

        student.setId(12);
        student.setName("qadeer");
        student.setRollNo(111);
        student.setAge(23);

        Course course = new Course();
        course.setId(2);
        course.setName("Maths");



        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(student);
        entityManager.persist(course);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
