package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixineirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixineirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixineirongView;


/**
 * 实习内容
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixineirongService extends IService<ShixineirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixineirongVO> selectListVO(Wrapper<ShixineirongEntity> wrapper);
   	
   	ShixineirongVO selectVO(@Param("ew") Wrapper<ShixineirongEntity> wrapper);
   	
   	List<ShixineirongView> selectListView(Wrapper<ShixineirongEntity> wrapper);
   	
   	ShixineirongView selectView(@Param("ew") Wrapper<ShixineirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixineirongEntity> wrapper);
   	

}

