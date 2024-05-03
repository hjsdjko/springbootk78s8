package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixibaozhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixibaozhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixibaozhangView;


/**
 * 实习保障
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixibaozhangService extends IService<ShixibaozhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixibaozhangVO> selectListVO(Wrapper<ShixibaozhangEntity> wrapper);
   	
   	ShixibaozhangVO selectVO(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
   	
   	List<ShixibaozhangView> selectListView(Wrapper<ShixibaozhangEntity> wrapper);
   	
   	ShixibaozhangView selectView(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixibaozhangEntity> wrapper);
   	

}

