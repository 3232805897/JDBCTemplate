package JDBCTemplate;

import Tx.GoodsDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class goodTest {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("affairs.xml");
        GoodsDao goodsDao = ioc.getBean("goodsDao", GoodsDao.class);
        Float aFloat = goodsDao.queryPriceById(1);
        System.out.println(aFloat);
    }
}
