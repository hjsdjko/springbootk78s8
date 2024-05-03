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
 * 实习单位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:16
 */
@TableName("shixidanwei")
public class ShixidanweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixidanweiEntity() {
		
	}
	
	public ShixidanweiEntity(T t) {
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
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 单位图片
	 */
					
	private String danweitupian;
	
	/**
	 * 单位性质
	 */
					
	private String danweixingzhi;
	
	/**
	 * 单位地址
	 */
					
	private String danweidizhi;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 经营范围
	 */
					
	private String jingyingfanwei;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：单位图片
	 */
	public void setDanweitupian(String danweitupian) {
		this.danweitupian = danweitupian;
	}
	/**
	 * 获取：单位图片
	 */
	public String getDanweitupian() {
		return danweitupian;
	}
	/**
	 * 设置：单位性质
	 */
	public void setDanweixingzhi(String danweixingzhi) {
		this.danweixingzhi = danweixingzhi;
	}
	/**
	 * 获取：单位性质
	 */
	public String getDanweixingzhi() {
		return danweixingzhi;
	}
	/**
	 * 设置：单位地址
	 */
	public void setDanweidizhi(String danweidizhi) {
		this.danweidizhi = danweidizhi;
	}
	/**
	 * 获取：单位地址
	 */
	public String getDanweidizhi() {
		return danweidizhi;
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
	 * 设置：经营范围
	 */
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
