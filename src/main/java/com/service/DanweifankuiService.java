package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanweifankuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanweifankuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweifankuiView;


/**
 * 单位反馈
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface DanweifankuiService extends IService<DanweifankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanweifankuiVO> selectListVO(Wrapper<DanweifankuiEntity> wrapper);
   	
   	DanweifankuiVO selectVO(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
   	
   	List<DanweifankuiView> selectListView(Wrapper<DanweifankuiEntity> wrapper);
   	
   	DanweifankuiView selectView(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanweifankuiEntity> wrapper);
   	

}

