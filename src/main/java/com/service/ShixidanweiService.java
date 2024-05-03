package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixidanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixidanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixidanweiView;


/**
 * 实习单位
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface ShixidanweiService extends IService<ShixidanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixidanweiVO> selectListVO(Wrapper<ShixidanweiEntity> wrapper);
   	
   	ShixidanweiVO selectVO(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
   	
   	List<ShixidanweiView> selectListView(Wrapper<ShixidanweiEntity> wrapper);
   	
   	ShixidanweiView selectView(@Param("ew") Wrapper<ShixidanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixidanweiEntity> wrapper);
   	

}

