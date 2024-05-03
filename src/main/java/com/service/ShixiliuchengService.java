package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixiliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixiliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixiliuchengView;


/**
 * 实习流程
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface ShixiliuchengService extends IService<ShixiliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixiliuchengVO> selectListVO(Wrapper<ShixiliuchengEntity> wrapper);
   	
   	ShixiliuchengVO selectVO(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
   	
   	List<ShixiliuchengView> selectListView(Wrapper<ShixiliuchengEntity> wrapper);
   	
   	ShixiliuchengView selectView(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixiliuchengEntity> wrapper);
   	

}

