package org.frank.jpa.test;

import org.frank.jpa.entities.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerTest {

    @Test
    public void test() {
        /**
         * 创建实体管理类工厂，借助Persistence的静态方法获取
         * 其中传递的参数为持久化单元名称，需要jpa配置文件中指定
         */
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        //创建实体管理类
        EntityManager em = factory.createEntityManager();
        //获取事务对象
        EntityTransaction tx = em.getTransaction();
        //开启事务
        tx.begin();
        Customer c = new Customer();
        c.setCustomerName("测试");
        //保存操作
        em.persist(c);
        //提交事务
        tx.commit();
        //释放资源
        em.close();
        factory.close();
    }
}
