package com.dao;

import com.entity.ShixibaozhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixibaozhangVO;
import com.entity.view.ShixibaozhangView;


/**
 * 实习保障
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixibaozhangDao extends BaseMapper<ShixibaozhangEntity> {
	
	List<ShixibaozhangVO> selectListVO(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
	
	ShixibaozhangVO selectVO(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
	
	List<ShixibaozhangView> selectListView(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);

	List<ShixibaozhangView> selectListView(Pagination page,@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
	
	ShixibaozhangView selectView(@Param("ew") Wrapper<ShixibaozhangEntity> wrapper);
	

}
