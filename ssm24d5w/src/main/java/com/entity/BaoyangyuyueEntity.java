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
 * 保养预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("baoyangyuyue")
public class BaoyangyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoyangyuyueEntity() {
		
	}
	
	public BaoyangyuyueEntity(T t) {
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
	 * 预约单号
	 */
					
	private String yuyuedanhao;
	
	/**
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
	/**
	 * 保养内容
	 */
					
	private String baoyangneirong;
	
	/**
	 * 预约日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yuyueriqi;
	
	/**
	 * 科室员工号
	 */
					
	private String keshiyuangonghao;
	
	/**
	 * 科室员姓名
	 */
					
	private String keshiyuanxingming;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
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
	 * 设置：预约单号
	 */
	public void setYuyuedanhao(String yuyuedanhao) {
		this.yuyuedanhao = yuyuedanhao;
	}
	/**
	 * 获取：预约单号
	 */
	public String getYuyuedanhao() {
		return yuyuedanhao;
	}
	/**
	 * 设置：设备名称
	 */
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
	/**
	 * 设置：保养内容
	 */
	public void setBaoyangneirong(String baoyangneirong) {
		this.baoyangneirong = baoyangneirong;
	}
	/**
	 * 获取：保养内容
	 */
	public String getBaoyangneirong() {
		return baoyangneirong;
	}
	/**
	 * 设置：预约日期
	 */
	public void setYuyueriqi(Date yuyueriqi) {
		this.yuyueriqi = yuyueriqi;
	}
	/**
	 * 获取：预约日期
	 */
	public Date getYuyueriqi() {
		return yuyueriqi;
	}
	/**
	 * 设置：科室员工号
	 */
	public void setKeshiyuangonghao(String keshiyuangonghao) {
		this.keshiyuangonghao = keshiyuangonghao;
	}
	/**
	 * 获取：科室员工号
	 */
	public String getKeshiyuangonghao() {
		return keshiyuangonghao;
	}
	/**
	 * 设置：科室员姓名
	 */
	public void setKeshiyuanxingming(String keshiyuanxingming) {
		this.keshiyuanxingming = keshiyuanxingming;
	}
	/**
	 * 获取：科室员姓名
	 */
	public String getKeshiyuanxingming() {
		return keshiyuanxingming;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
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
