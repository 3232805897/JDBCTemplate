package Tx.Service;

import Tx.DAO.GoodsDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class IsolationTest {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Resource
    private GoodsDao goodsDao;

    public void query(){
        String sql = "select goods_num from goods_amount where goods_id=1";
        Integer integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer);

        Integer integer2 = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer2);
    }
}
