package org.cooze.mvn.assembly.war.service.shoe.impl;

import org.cooze.mvn.assembly.war.model.shoe.domain.Shoe;
import org.cooze.mvn.assembly.war.service.shoe.inter.ShoeService;
import org.springframework.stereotype.Service;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@Service
public class ShoeServiceImpl implements ShoeService{
    @Override
    public Shoe getShoe(String noCode) throws Exception {
        Shoe shoe = new Shoe();
        shoe.setNoCode(noCode);
        shoe.setId(1);
        shoe.setBrand("xxx");
        shoe.setDesc("xxxx");
        shoe.setSize(32);
        shoe.setType("xxxyy");
        return shoe;
    }
}
