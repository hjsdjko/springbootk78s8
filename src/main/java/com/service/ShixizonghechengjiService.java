package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixizonghechengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixizonghechengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixizonghechengjiView;


/**
 * 实习综合成绩
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixizonghechengjiService extends IService<ShixizonghechengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixizonghechengjiVO> selectListVO(Wrapper<ShixizonghechengjiEntity> wrapper);
   	
   	ShixizonghechengjiVO selectVO(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
   	
   	List<ShixizonghechengjiView> selectListView(Wrapper<ShixizonghechengjiEntity> wrapper);
   	
   	ShixizonghechengjiView selectView(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixizonghechengjiEntity> wrapper);
   	

}

