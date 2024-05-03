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
 * 学生反馈
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("xueshengfankui")
public class XueshengfankuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengfankuiEntity() {
		
	}
	
	public XueshengfankuiEntity(T t) {
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
	 * 反馈名称
	 */
					
	private String fankuimingcheng;
	
	/**
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 实习日志
	 */
					
	private String shixirizhi;
	
	/**
	 * 实习报告
	 */
					
	private String shixibaogao;
	
	/**
	 * 内容反馈
	 */
					
	private String neirongfankui;
	
	/**
	 * 反馈日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fankuiriqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
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
	 * 设置：反馈名称
	 */
	public void setFankuimingcheng(String fankuimingcheng) {
		this.fankuimingcheng = fankuimingcheng;
	}
	/**
	 * 获取：反馈名称
	 */
	public String getFankuimingcheng() {
		return fankuimingcheng;
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
	 * 设置：实习日志
	 */
	public void setShixirizhi(String shixirizhi) {
		this.shixirizhi = shixirizhi;
	}
	/**
	 * 获取：实习日志
	 */
	public String getShixirizhi() {
		return shixirizhi;
	}
	/**
	 * 设置：实习报告
	 */
	public void setShixibaogao(String shixibaogao) {
		this.shixibaogao = shixibaogao;
	}
	/**
	 * 获取：实习报告
	 */
	public String getShixibaogao() {
		return shixibaogao;
	}
	/**
	 * 设置：内容反馈
	 */
	public void setNeirongfankui(String neirongfankui) {
		this.neirongfankui = neirongfankui;
	}
	/**
	 * 获取：内容反馈
	 */
	public String getNeirongfankui() {
		return neirongfankui;
	}
	/**
	 * 设置：反馈日期
	 */
	public void setFankuiriqi(Date fankuiriqi) {
		this.fankuiriqi = fankuiriqi;
	}
	/**
	 * 获取：反馈日期
	 */
	public Date getFankuiriqi() {
		return fankuiriqi;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
