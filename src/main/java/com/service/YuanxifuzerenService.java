package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxifuzerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxifuzerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxifuzerenView;


/**
 * 院系负责人
 *
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface YuanxifuzerenService extends IService<YuanxifuzerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxifuzerenVO> selectListVO(Wrapper<YuanxifuzerenEntity> wrapper);
   	
   	YuanxifuzerenVO selectVO(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
   	
   	List<YuanxifuzerenView> selectListView(Wrapper<YuanxifuzerenEntity> wrapper);
   	
   	YuanxifuzerenView selectView(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxifuzerenEntity> wrapper);
   	

}

