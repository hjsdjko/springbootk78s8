package com.dao;

import com.entity.YuanxifuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxifuzerenVO;
import com.entity.view.YuanxifuzerenView;


/**
 * 院系负责人
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface YuanxifuzerenDao extends BaseMapper<YuanxifuzerenEntity> {
	
	List<YuanxifuzerenVO> selectListVO(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
	
	YuanxifuzerenVO selectVO(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
	
	List<YuanxifuzerenView> selectListView(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);

	List<YuanxifuzerenView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
	
	YuanxifuzerenView selectView(@Param("ew") Wrapper<YuanxifuzerenEntity> wrapper);
	

}
