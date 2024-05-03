package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjipingdingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjipingdingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjipingdingView;


/**
 * 成绩评定
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ChengjipingdingService extends IService<ChengjipingdingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjipingdingVO> selectListVO(Wrapper<ChengjipingdingEntity> wrapper);
   	
   	ChengjipingdingVO selectVO(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
   	
   	List<ChengjipingdingView> selectListView(Wrapper<ChengjipingdingEntity> wrapper);
   	
   	ChengjipingdingView selectView(@Param("ew") Wrapper<ChengjipingdingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjipingdingEntity> wrapper);
   	

}

