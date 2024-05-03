package com.dao;

import com.entity.DanweifankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanweifankuiVO;
import com.entity.view.DanweifankuiView;


/**
 * 单位反馈
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface DanweifankuiDao extends BaseMapper<DanweifankuiEntity> {
	
	List<DanweifankuiVO> selectListVO(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
	
	DanweifankuiVO selectVO(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
	
	List<DanweifankuiView> selectListView(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);

	List<DanweifankuiView> selectListView(Pagination page,@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
	
	DanweifankuiView selectView(@Param("ew") Wrapper<DanweifankuiEntity> wrapper);
	

}
