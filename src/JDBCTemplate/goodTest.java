package JDBCTemplate;

import Taobao.Service.sellerService;
import Tx.DAO.GoodsDao;
import Tx.Service.GoodsService;
import Tx.Service.IsolationTest;
import Tx.Service.mulitTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class goodTest {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("taobao.xml");
//        GoodsService goodsService = ioc.getBean(GoodsService.class);
//        goodsService.buyGoods(1,1,1);
        sellerService bean = ioc.getBean(sellerService.class);
       bean.buyService(1,1,1);
//        IsolationTest isolationTest = ioc.getBean(IsolationTest.class);
//        isolationTest.query();
    }
}
