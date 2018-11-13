package com.gofashion.gofashionspringcloudcommodityproducer.service.impl;

import com.gofashion.gofashionspringcloudcommodityproducer.dao.DescriptionMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.dao.SelInventoryMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.dao.UpdInventoryMapper;
import com.gofashion.gofashionspringcloudcommodityproducer.pojo.DescriptionModel;
import com.gofashion.gofashionspringcloudcommodityproducer.service.UpdInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 提交订单的时候加减库存
 */
@Service
public class UpdInventoryServiceImpl implements UpdInventoryService {
    @Autowired
    private UpdInventoryMapper updateInventory;

    public UpdInventoryMapper getUpdateInventory() {
        return updateInventory;
    }

    public void setUpdateInventory(UpdInventoryMapper updateInventory) {
        this.updateInventory = updateInventory;
    }
    @Autowired
    private SelInventoryMapper selInventoryMapper;

    public SelInventoryMapper getSelInventoryMapper() {
        return selInventoryMapper;
    }

    public void setSelInventoryMapper(SelInventoryMapper selInventoryMapper) {
        this.selInventoryMapper = selInventoryMapper;
    }

    /**
     * 成功减库存
     *
     * @param number
     * @param goodsskuabvid
     * @return
     */
    @Override
    public String updfInventoryService(int number, int goodsskuabvid) {
        String x = "";
        DescriptionModel inventory = selInventoryMapper.selInventory(goodsskuabvid);
       int inventor = inventory.getGoodsskuabv_inventory();
        System.out.println(inventory.getGoodsskuabv_inventory());
        if (number > inventor) {
            x = "您所购买的商品已售罄";
        } else {
           int xx = updateInventory.updateInventory((inventor - number), goodsskuabvid);
           if (xx > 0) {
               x = "已下单，请尽快支付";
           }
        }
        if (number < 1) {
            x = "请输入要购买的数量";
        } else {
            updateInventory.updateInventory((inventor - number), goodsskuabvid);
            x = "已提交，请尽快支付";
        }
        return x;
    }

    /**
     * 失败加库存
     *
     * @param number
     * @param goodsskuabvid
     * @return
     */
    @Override
    public String updzInventoryService(int number, int goodsskuabvid) {
        String x = "";
        if (number < 1 && goodsskuabvid < 1) {
            x = "订单不存在";
        } else {
            DescriptionModel inventory = selInventoryMapper.selInventory(goodsskuabvid);
            int inventor = inventory.getGoodsskuabv_inventory();
            int inveni = updateInventory.updateInventory((inventor + number), goodsskuabvid);
            if (inveni > 0) {
                x = "订单超时";
            }else{
                x= "订单超时已销毁";
            }
        }
            return x;
        }
    }
