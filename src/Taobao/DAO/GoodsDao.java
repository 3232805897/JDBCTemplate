package Taobao.DAO;

import Taobao.domain.goods;
import Taobao.domain.seller;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class GoodsDao{
    @Resource
    private JdbcTemplate jdbcTemplate;
    public goods selectGoodsPrice(int goodsId){
        String sql = "select * from goods where goods_id = ?";
        BeanPropertyRowMapper<goods> goodsRowMapper = new BeanPropertyRowMapper<>(goods.class);
        goods goods = jdbcTemplate.queryForObject(sql, goodsRowMapper, goodsId);
        return goods;
    }
    @Transactional
    public void buyGoods(int buySerId,int goods_id,int mount){
        //查询商品价格和商家信息
        goods goods = selectGoodsPrice(goods_id);
        double price = goods.getPrice();
        price = price*mount;

        //对用户账户进行更新
        String sql ="update buyer set balance = balance-? where buyer_id=?";
        jdbcTemplate.update(sql, price,buySerId);

        //对商家账户进行更新
        String sql2 ="update seller set balance = balance+(?*0.9) where seller_rid = ?";
        jdbcTemplate.update(sql2,price,goods.getOwner_id());
    }
}
