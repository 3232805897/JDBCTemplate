package Tx.Service;

import Tx.DAO.GoodsDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;

    //进行事务管理
    public void buyGoods(int userId,int goodsId,int counts){
        Float price = goodsDao.queryPriceById(goodsId);
        float count = price*counts;
        //进行购买
        goodsDao.updateBalance(userId,count);
        //更新库存
        goodsDao.updateAmount(goodsId,counts);
    }

    public void buyGoods2(int userId,int goodsId,int counts){
        Float price = goodsDao.queryPriceById2(goodsId);
        float count = price*counts;
        //进行购买
        goodsDao.updateBalance2(userId,count);
        //更新库存
        goodsDao.updateAmount2(goodsId,counts);
    }
}
