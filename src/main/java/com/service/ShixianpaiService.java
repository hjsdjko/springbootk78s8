package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixianpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixianpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixianpaiView;


/**
 * 实习安排
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixianpaiService extends IService<ShixianpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixianpaiVO> selectListVO(Wrapper<ShixianpaiEntity> wrapper);
   	
   	ShixianpaiVO selectVO(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
   	
   	List<ShixianpaiView> selectListView(Wrapper<ShixianpaiEntity> wrapper);
   	
   	ShixianpaiView selectView(@Param("ew") Wrapper<ShixianpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixianpaiEntity> wrapper);
   	

}

