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
 * 实习保障
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-09 16:05:17
 */
@TableName("shixibaozhang")
public class ShixibaozhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixibaozhangEntity() {
		
	}
	
	public ShixibaozhangEntity(T t) {
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
	 * 保障名称
	 */
					
	private String baozhangmingcheng;
	
	/**
	 * 实习经费
	 */
					
	private Integer shixijingfei;
	
	/**
	 * 出行信息
	 */
					
	private String chuxingxinxi;
	
	/**
	 * 住宿信息
	 */
					
	private String zhusuxinxi;
	
	/**
	 * 申请内容
	 */
					
	private String shenqingneirong;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 院系账号
	 */
					
	private String yuanxizhanghao;
	
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
	 * 设置：保障名称
	 */
	public void setBaozhangmingcheng(String baozhangmingcheng) {
		this.baozhangmingcheng = baozhangmingcheng;
	}
	/**
	 * 获取：保障名称
	 */
	public String getBaozhangmingcheng() {
		return baozhangmingcheng;
	}
	/**
	 * 设置：实习经费
	 */
	public void setShixijingfei(Integer shixijingfei) {
		this.shixijingfei = shixijingfei;
	}
	/**
	 * 获取：实习经费
	 */
	public Integer getShixijingfei() {
		return shixijingfei;
	}
	/**
	 * 设置：出行信息
	 */
	public void setChuxingxinxi(String chuxingxinxi) {
		this.chuxingxinxi = chuxingxinxi;
	}
	/**
	 * 获取：出行信息
	 */
	public String getChuxingxinxi() {
		return chuxingxinxi;
	}
	/**
	 * 设置：住宿信息
	 */
	public void setZhusuxinxi(String zhusuxinxi) {
		this.zhusuxinxi = zhusuxinxi;
	}
	/**
	 * 获取：住宿信息
	 */
	public String getZhusuxinxi() {
		return zhusuxinxi;
	}
	/**
	 * 设置：申请内容
	 */
	public void setShenqingneirong(String shenqingneirong) {
		this.shenqingneirong = shenqingneirong;
	}
	/**
	 * 获取：申请内容
	 */
	public String getShenqingneirong() {
		return shenqingneirong;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：院系账号
	 */
	public void setYuanxizhanghao(String yuanxizhanghao) {
		this.yuanxizhanghao = yuanxizhanghao;
	}
	/**
	 * 获取：院系账号
	 */
	public String getYuanxizhanghao() {
		return yuanxizhanghao;
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
