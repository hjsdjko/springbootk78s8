package com.entity.model;

import com.entity.ShixiliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实习流程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
public class ShixiliuchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日程安排
	 */
	
	private String richenganpai;
		
	/**
	 * 指导资料
	 */
	
	private String zhidaoziliao;
		
	/**
	 * 过程跟踪
	 */
	
	private String guochenggenzong;
		
	/**
	 * 流程内容
	 */
	
	private String liuchengneirong;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
				
	
	/**
	 * 设置：日程安排
	 */
	 
	public void setRichenganpai(String richenganpai) {
		this.richenganpai = richenganpai;
	}
	
	/**
	 * 获取：日程安排
	 */
	public String getRichenganpai() {
		return richenganpai;
	}
				
	
	/**
	 * 设置：指导资料
	 */
	 
	public void setZhidaoziliao(String zhidaoziliao) {
		this.zhidaoziliao = zhidaoziliao;
	}
	
	/**
	 * 获取：指导资料
	 */
	public String getZhidaoziliao() {
		return zhidaoziliao;
	}
				
	
	/**
	 * 设置：过程跟踪
	 */
	 
	public void setGuochenggenzong(String guochenggenzong) {
		this.guochenggenzong = guochenggenzong;
	}
	
	/**
	 * 获取：过程跟踪
	 */
	public String getGuochenggenzong() {
		return guochenggenzong;
	}
				
	
	/**
	 * 设置：流程内容
	 */
	 
	public void setLiuchengneirong(String liuchengneirong) {
		this.liuchengneirong = liuchengneirong;
	}
	
	/**
	 * 获取：流程内容
	 */
	public String getLiuchengneirong() {
		return liuchengneirong;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
			
}
