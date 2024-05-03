package com.entity.view;

import com.entity.ShixizonghechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习综合成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("shixizonghechengji")
public class ShixizonghechengjiView  extends ShixizonghechengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixizonghechengjiView(){
	}
 
 	public ShixizonghechengjiView(ShixizonghechengjiEntity shixizonghechengjiEntity){
 	try {
			BeanUtils.copyProperties(this, shixizonghechengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
