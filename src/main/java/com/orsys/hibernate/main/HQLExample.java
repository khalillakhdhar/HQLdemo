package com.orsys.hibernate.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orsys.hibernate.model.Employee;
import com.orsys.hibernate.util.HibernateUtil;

public class HQLExample {
public static void main(String[] args)
{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.getCurrentSession();
	Transaction tx = session.beginTransaction();
	Query query = session.createQuery("from Employee");
	List<Employee> empList = query.list();
	for(Employee emp : empList){
		System.out.println("List of Employees::"+emp.getId()+","+emp.getAddress().getCity());
	}
}
}
