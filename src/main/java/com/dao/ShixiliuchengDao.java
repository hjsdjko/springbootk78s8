package com.dao;

import com.entity.ShixiliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixiliuchengVO;
import com.entity.view.ShixiliuchengView;


/**
 * 实习流程
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface ShixiliuchengDao extends BaseMapper<ShixiliuchengEntity> {
	
	List<ShixiliuchengVO> selectListVO(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
	
	ShixiliuchengVO selectVO(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
	
	List<ShixiliuchengView> selectListView(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);

	List<ShixiliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
	
	ShixiliuchengView selectView(@Param("ew") Wrapper<ShixiliuchengEntity> wrapper);
	

}
