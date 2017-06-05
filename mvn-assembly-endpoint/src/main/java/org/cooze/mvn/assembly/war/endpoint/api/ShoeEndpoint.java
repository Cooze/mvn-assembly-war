package org.cooze.mvn.assembly.war.endpoint.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.cooze.mvn.assembly.war.common.template.ReturnData;
import org.cooze.mvn.assembly.war.common.utils.BeanUtil;
import org.cooze.mvn.assembly.war.model.shoe.domain.Shoe;
import org.cooze.mvn.assembly.war.model.shoe.dto.ShoeDto;
import org.cooze.mvn.assembly.war.service.shoe.inter.ShoeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cooze
 * @version 1.0.0
 * @desc
 * @date 2017/6/3
 */
@Api(value = "鞋API", description = "提供关于鞋的CURD API操作")
@RestController
public class ShoeEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(ShoeEndpoint.class);


    @Autowired
    private ShoeService shoeService;

    @GetMapping(value = "/shoes/{noCode}")
    public ReturnData<ShoeDto> getShoe(@ApiParam(name = "noCode",value = "书籍编号",required = true)
                                        @PathVariable(name = "noCode") String noCode){
        try {
            ReturnData<ShoeDto> returnData = new ReturnData<>();
            Shoe shoe = this.shoeService.getShoe(noCode);
            ShoeDto shoeDto = BeanUtil.map(shoe,ShoeDto.class);
            returnData.setResult(shoeDto);
            return returnData;
        }catch (Exception e){
            LOG.error("get shoe error,error info:{}",e);
            return new ReturnData<>("get shoe error",10001);
        }
    }
}
