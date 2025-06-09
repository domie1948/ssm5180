package com.entity.model;

import com.entity.ShebeiguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 设备归还
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public class ShebeiguihaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 借用人
	 */
	
	private String jieyongren;
		
	/**
	 * 借用日期
	 */
	
	private String jieyongriqi;
		
	/**
	 * 归还日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihairiqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：借用人
	 */
	 
	public void setJieyongren(String jieyongren) {
		this.jieyongren = jieyongren;
	}
	
	/**
	 * 获取：借用人
	 */
	public String getJieyongren() {
		return jieyongren;
	}
				
	
	/**
	 * 设置：借用日期
	 */
	 
	public void setJieyongriqi(String jieyongriqi) {
		this.jieyongriqi = jieyongriqi;
	}
	
	/**
	 * 获取：借用日期
	 */
	public String getJieyongriqi() {
		return jieyongriqi;
	}
				
	
	/**
	 * 设置：归还日期
	 */
	 
	public void setGuihairiqi(Date guihairiqi) {
		this.guihairiqi = guihairiqi;
	}
	
	/**
	 * 获取：归还日期
	 */
	public Date getGuihairiqi() {
		return guihairiqi;
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
