package com.entity.model;

import com.entity.ShebeichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 设备出库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeichukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 出库数量
	 */
	
	private String chukushuliang;
		
	/**
	 * 出库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukuriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：出库数量
	 */
	 
	public void setChukushuliang(String chukushuliang) {
		this.chukushuliang = chukushuliang;
	}
	
	/**
	 * 获取：出库数量
	 */
	public String getChukushuliang() {
		return chukushuliang;
	}
				
	
	/**
	 * 设置：出库日期
	 */
	 
	public void setChukuriqi(Date chukuriqi) {
		this.chukuriqi = chukuriqi;
	}
	
	/**
	 * 获取：出库日期
	 */
	public Date getChukuriqi() {
		return chukuriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
