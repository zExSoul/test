package com.ddd.example.web.web.convertor;

import com.ddd.example.api.api.dto.ShopOrderDTO;
import com.ddd.example.web.web.view.ShopOrderVO;
import org.springframework.beans.BeanUtils;

/**
 * Author xuyifan
 * Date on 9/11/2018 6:02 PM
 */
public class ShopOrderConverter {

    private ShopOrderDTO shopOrderDTO;

    public ShopOrderConverter(final ShopOrderDTO shopOrderDTO) {
        this.shopOrderDTO = shopOrderDTO;
    }

    public ShopOrderVO transferToShopOrderVo() {
        ShopOrderVO shopOrderVO = new ShopOrderVO();
        BeanUtils.copyProperties(shopOrderDTO, shopOrderVO);
        return shopOrderVO;
    }

}
