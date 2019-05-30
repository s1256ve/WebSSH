package hibertest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Update_4_21 {
	public static void main(String[] args) {
		new Update_4_21().update(1,"b","b");
	}
	public void update(int index,String name,String pwd){
		//�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//�}��session
		Session session=sessionFactory.openSession();
		
		
		Transaction tx=null;
		//���J�n�ק諸���
		Users user=(Users)session.get(Users.class, new Integer(index));
		//�ק���
		user.setLoginName(name);
		user.setLoginPwd(pwd);
		
		//user.setLoginName("popopo");
		try {
			tx=session.beginTransaction();    //�}�l�@�ӥ��			
			session.update(user);             //�����s
			tx.commit();                      //�ǰe���
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();       //�����^				
			}
			e.printStackTrace();
		}finally{
			session.close();   //����session
		}
	}
}
