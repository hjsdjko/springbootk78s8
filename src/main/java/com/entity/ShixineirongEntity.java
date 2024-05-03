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
 * 实习内容
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("shixineirong")
public class ShixineirongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixineirongEntity() {
		
	}
	
	public ShixineirongEntity(T t) {
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
	 * 实习岗位
	 */
					
	private String shixigangwei;
	
	/**
	 * 岗位图片
	 */
					
	private String gangweitupian;
	
	/**
	 * 实习内容
	 */
					
	private String shixineirong;
	
	/**
	 * 岗位性质
	 */
					
	private String gangweixingzhi;
	
	/**
	 * 岗位薪酬
	 */
					
	private Integer gangweixinchou;
	
	/**
	 * 实习地点
	 */
					
	private String shixididian;
	
	/**
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 内容详情
	 */
					
	private String neirongxiangqing;
	
	
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
	 * 设置：实习岗位
	 */
	public void setShixigangwei(String shixigangwei) {
		this.shixigangwei = shixigangwei;
	}
	/**
	 * 获取：实习岗位
	 */
	public String getShixigangwei() {
		return shixigangwei;
	}
	/**
	 * 设置：岗位图片
	 */
	public void setGangweitupian(String gangweitupian) {
		this.gangweitupian = gangweitupian;
	}
	/**
	 * 获取：岗位图片
	 */
	public String getGangweitupian() {
		return gangweitupian;
	}
	/**
	 * 设置：实习内容
	 */
	public void setShixineirong(String shixineirong) {
		this.shixineirong = shixineirong;
	}
	/**
	 * 获取：实习内容
	 */
	public String getShixineirong() {
		return shixineirong;
	}
	/**
	 * 设置：岗位性质
	 */
	public void setGangweixingzhi(String gangweixingzhi) {
		this.gangweixingzhi = gangweixingzhi;
	}
	/**
	 * 获取：岗位性质
	 */
	public String getGangweixingzhi() {
		return gangweixingzhi;
	}
	/**
	 * 设置：岗位薪酬
	 */
	public void setGangweixinchou(Integer gangweixinchou) {
		this.gangweixinchou = gangweixinchou;
	}
	/**
	 * 获取：岗位薪酬
	 */
	public Integer getGangweixinchou() {
		return gangweixinchou;
	}
	/**
	 * 设置：实习地点
	 */
	public void setShixididian(String shixididian) {
		this.shixididian = shixididian;
	}
	/**
	 * 获取：实习地点
	 */
	public String getShixididian() {
		return shixididian;
	}
	/**
	 * 设置：单位名称
	 */
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：内容详情
	 */
	public void setNeirongxiangqing(String neirongxiangqing) {
		this.neirongxiangqing = neirongxiangqing;
	}
	/**
	 * 获取：内容详情
	 */
	public String getNeirongxiangqing() {
		return neirongxiangqing;
	}

}
