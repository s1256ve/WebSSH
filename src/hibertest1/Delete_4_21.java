package hibertest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Delete_4_21 {
	public static void main(String[] args) {
		new Delete_4_21().delete(1);
	}
	public void delete(int index) {
		//�_�l��,Ū���պA��hibernate.cfg.xml
				Configuration config=new Configuration().configure();
				//Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
				SessionFactory sessionFactory=config.buildSessionFactory();
				//�}��session
				Session session=sessionFactory.openSession();
				Transaction tx=null;
				
				Users user=(Users)session.get(Users.class, new Integer(index));
				
				try {
					tx=session.beginTransaction();
					session.delete(user);
					tx.commit();
				} catch (Exception e) {
					if(tx!=null) {
						tx.rollback();
					}
					e.printStackTrace();
				}finally {
					session.close();
				}
	}
}
