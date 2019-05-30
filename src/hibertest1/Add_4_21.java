package hibertest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Add_4_21 {
	public static void main(String[] args) {
		new Add_4_21().add("c","c");
	}
	public void add(String name,String pwd) {
		Users user=new Users();
		user.setLoginName(name);
		user.setLoginPwd(pwd);
		
		//1.�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//2.Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//3.�}��session
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);	
		tx.commit();
		
		try {			
			tx=session.beginTransaction();    //4.�}�l�@�ӥ��			
			session.save(user);		 //5.���[�ưʧ@	
			tx.commit();    //6.�ǰe���
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();  //�����^				
			}	
			e.printStackTrace();
		}finally{
			session.close();   //7.����session
		}
	}
}
