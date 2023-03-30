package Taobao.Service;

import Taobao.DAO.GoodsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class sellerService {
    @Resource
    private GoodsDao goodsDao;

    public void buyService(int buySerId,int goods_id,int mount){
        goodsDao.buyGoods(buySerId,goods_id,mount);
    }
}
