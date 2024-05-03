package com.dao;

import com.entity.ShixigonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixigonggaoVO;
import com.entity.view.ShixigonggaoView;


/**
 * 实习公告
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public interface ShixigonggaoDao extends BaseMapper<ShixigonggaoEntity> {
	
	List<ShixigonggaoVO> selectListVO(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
	
	ShixigonggaoVO selectVO(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
	
	List<ShixigonggaoView> selectListView(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);

	List<ShixigonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
	
	ShixigonggaoView selectView(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
	

}
