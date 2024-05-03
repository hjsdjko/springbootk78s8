package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实习流程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
@TableName("shixiliucheng")
public class ShixiliuchengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixiliuchengEntity() {
		
	}
	
	public ShixiliuchengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 流程名称
	 */
					
	private String liuchengmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：流程名称
	 */
	public void setLiuchengmingcheng(String liuchengmingcheng) {
		this.liuchengmingcheng = liuchengmingcheng;
	}
	/**
	 * 获取：流程名称
	 */
	public String getLiuchengmingcheng() {
		return liuchengmingcheng;
	}
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
