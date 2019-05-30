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
		
		//1.起始化,讀取組態檔hibernate.cfg.xml
		Configuration config=new Configuration().configure();
		//2.讀取並解析映射檔案(Users.hbm.xml)，建立sessionFactory
		SessionFactory sessionFactory=config.buildSessionFactory();
		//3.開啟session
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);	
		tx.commit();
		
		try {			
			tx=session.beginTransaction();    //4.開始一個交易			
			session.save(user);		 //5.持久化動作	
			tx.commit();    //6.傳送交易
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();  //交易返回				
			}	
			e.printStackTrace();
		}finally{
			session.close();   //7.關閉session
		}
	}
}
