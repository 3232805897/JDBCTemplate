package Tx.Service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class mulitTest {
    @Resource
    private GoodsService goodsService;
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Transactional(timeout = 2)
    public void buys(){
        //这两个事务的传播级别都是默认的
        goodsService.buyGoods(1,1,1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("aaa");
    }
}
