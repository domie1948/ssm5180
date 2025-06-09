package com.entity.view;

import com.entity.ShebeichukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("shebeichuku")
public class ShebeichukuView  extends ShebeichukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeichukuView(){
	}
 
 	public ShebeichukuView(ShebeichukuEntity shebeichukuEntity){
 	try {
			BeanUtils.copyProperties(this, shebeichukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
