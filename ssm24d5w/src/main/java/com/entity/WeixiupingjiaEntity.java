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
 * 维修评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("weixiupingjia")
public class WeixiupingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiupingjiaEntity() {
		
	}
	
	public WeixiupingjiaEntity(T t) {
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
	 * 报修单号
	 */
					
	private String baoxiudanhao;
	
	/**
	 * 设备名称
	 */
					
	private String shebeimingcheng;
	
	/**
	 * 报修内容
	 */
					
	private String baoxiuneirong;
	
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
	 * 维修日期
	 */
					
	private String weixiuriqi;
	
	/**
	 * 维修状态
	 */
					
	private String weixiuzhuangtai;
	
	/**
	 * 评价
	 */
					
	private String pingjia;
	
	/**
	 * 维修员工号
	 */
					
	private String weixiuyuangonghao;
	
	/**
	 * 维修员姓名
	 */
					
	private String weixiuyuanxingming;
	
	
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
	 * 设置：报修单号
	 */
	public void setBaoxiudanhao(String baoxiudanhao) {
		this.baoxiudanhao = baoxiudanhao;
	}
	/**
	 * 获取：报修单号
	 */
	public String getBaoxiudanhao() {
		return baoxiudanhao;
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
	 * 设置：报修内容
	 */
	public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
	}
	/**
	 * 获取：报修内容
	 */
	public String getBaoxiuneirong() {
		return baoxiuneirong;
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
	 * 设置：维修日期
	 */
	public void setWeixiuriqi(String weixiuriqi) {
		this.weixiuriqi = weixiuriqi;
	}
	/**
	 * 获取：维修日期
	 */
	public String getWeixiuriqi() {
		return weixiuriqi;
	}
	/**
	 * 设置：维修状态
	 */
	public void setWeixiuzhuangtai(String weixiuzhuangtai) {
		this.weixiuzhuangtai = weixiuzhuangtai;
	}
	/**
	 * 获取：维修状态
	 */
	public String getWeixiuzhuangtai() {
		return weixiuzhuangtai;
	}
	/**
	 * 设置：评价
	 */
	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}
	/**
	 * 获取：评价
	 */
	public String getPingjia() {
		return pingjia;
	}
	/**
	 * 设置：维修员工号
	 */
	public void setWeixiuyuangonghao(String weixiuyuangonghao) {
		this.weixiuyuangonghao = weixiuyuangonghao;
	}
	/**
	 * 获取：维修员工号
	 */
	public String getWeixiuyuangonghao() {
		return weixiuyuangonghao;
	}
	/**
	 * 设置：维修员姓名
	 */
	public void setWeixiuyuanxingming(String weixiuyuanxingming) {
		this.weixiuyuanxingming = weixiuyuanxingming;
	}
	/**
	 * 获取：维修员姓名
	 */
	public String getWeixiuyuanxingming() {
		return weixiuyuanxingming;
	}

}
