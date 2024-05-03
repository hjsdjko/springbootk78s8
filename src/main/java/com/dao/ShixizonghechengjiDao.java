package com.dao;

import com.entity.ShixizonghechengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixizonghechengjiVO;
import com.entity.view.ShixizonghechengjiView;


/**
 * 实习综合成绩
 * 
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
public interface ShixizonghechengjiDao extends BaseMapper<ShixizonghechengjiEntity> {
	
	List<ShixizonghechengjiVO> selectListVO(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
	
	ShixizonghechengjiVO selectVO(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
	
	List<ShixizonghechengjiView> selectListView(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);

	List<ShixizonghechengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
	
	ShixizonghechengjiView selectView(@Param("ew") Wrapper<ShixizonghechengjiEntity> wrapper);
	

}
