package hibertest1;

import hibertest1.entity.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Load_4_21 {
	public static void main(String[] args) {
		new Load_4_21().load(1);
	}
	public Users load(int index){
		//1.�_�l��,Ū���պA��hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//2.Ū���øѪR�M�g�ɮ�(Users.hbm.xml)�A�إ�sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//3.�}��session
		Session session=sessionFactory.openSession();
		//4.���J���
		Users user=(Users)session.get(Users.class, new Integer(index));
		//�b�D���x��X�ϥΪ̦W�٩M�K�X
		
		
		System.out.println(user.getLoginName()+" "+user.getLoginPwd());
		
		return user;
	}
}
