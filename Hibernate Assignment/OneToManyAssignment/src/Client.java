import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import oracle.net.TNSAddress.Address;


public class Client {
	
	private static SessionFactory factory;
	
	public static void getSessionFactory() {
		
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory = conf.buildSessionFactory(builder.build());
		}
		
		catch(Throwable ex) {
			System.err.println("Failed to create Session Factory Object "+ex);	
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String args[]) {
		try
		{
			getSessionFactory();
			Client c = new Client();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			Set<Student> vmg = new HashSet<Student>();
			Set<Student> cb = new HashSet<Student>();
			Set<Student> cv = new HashSet<Student>();
			Set<Student> vj = new HashSet<Student>();
			vmg.add(new Student(1299, "Harshitha M"));
			vmg.add(new Student(1268, "Aswitha B"));
			cb.add(new Student(1274, "Deekshitha Reddy"));
			cv.add(new Student(1270, "Laya s"));
			cv.add(new Student(1264, "Monica"));
			cb.add(new Student(1265, "Rachel Green"));
			cb.add(new Student(1260, "Abhi"));
			cv.add(new Student(1261, "Shravan"));
			College cbit = new College("CBIT", "Chaitanya Bharathi College Of Engineering",cb);
			College vmeg = new College("VMEG", "Vardhaman College Of Engineering",vmg);
			College vnr = new College("VNR", "VNR Vignan Jyothi College Of Engineering",vj);
			College cvr = new College("CVR", "CVR College Of Engineering",cv);
		

			session.save(vmeg);
			session.save(cbit);
			session.save(cvr);
			session.save(vnr);
			tx.commit();
			c.displayRecords();
			
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void displayRecords() throws HibernateException{
		Session session = factory.openSession();

		List stdList = session.createQuery("From STUDENT_COLLEGE").list();
		display(stdList);
		List clgList = session.createQuery("From COLLEGE").list();
		display(clgList);
		List clgstd = session.createQuery("From CLGSTU").list();
		display(clgstd);
		session.close();
	}
	
	public void display(List obj) {
		for(Iterator iterator = obj.iterator(); iterator.hasNext();) {
			College clg = (College) iterator.next();
			System.out.println(clg.toString());
		}
	}
	
	
}
