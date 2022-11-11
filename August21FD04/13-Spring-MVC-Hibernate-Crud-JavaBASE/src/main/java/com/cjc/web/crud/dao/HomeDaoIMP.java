package com.cjc.web.crud.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.web.crud.model.Student;

@Repository
public class HomeDaoIMP implements HomeDao {

	@Autowired
	SessionFactory sf;
	public List<Student> loginChech(String uname, String pass) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> stlist = query.getResultList();
		boolean found = false;
		for (Student st : stlist) {
			if (uname.equals(st.getUname()) && pass.equals(st.getPass())) {
				found = true;
				break;
			}
		}

		if (found)
			return stlist;
		else
			return null;
	}
	public void saveStudent(Student stu) {
		Session session = sf.openSession();
		session.saveOrUpdate(stu);
		session.beginTransaction().commit();
		session.close();
		System.out.println("Student saved in DB (DAO)");
		
	}
	public List<Student> deleteStu(int id) {
		Session session = sf.openSession();
		session.beginTransaction();
         // delete Student with id
		Query query = session.createNamedQuery("delete");
		query.setParameter(1, id);
		query.executeUpdate();
		// Select all record after delete
        Query query2 = session.createNamedQuery("select");
        List<Student> list = query2.getResultList();
        session.getTransaction().commit();
		return list;
	}
	public Student editStu(int id) {
		Session session = sf.openSession();
		Student st = session.get(Student.class, id);
		return st;
	}
}
