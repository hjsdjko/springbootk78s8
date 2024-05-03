package com.entity.view;

import com.entity.ShixianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("shixianpai")
public class ShixianpaiView  extends ShixianpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixianpaiView(){
	}
 
 	public ShixianpaiView(ShixianpaiEntity shixianpaiEntity){
 	try {
			BeanUtils.copyProperties(this, shixianpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
