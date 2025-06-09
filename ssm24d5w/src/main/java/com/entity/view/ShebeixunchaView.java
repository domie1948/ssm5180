package com.entity.view;

import com.entity.ShebeixunchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备巡查
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("shebeixuncha")
public class ShebeixunchaView  extends ShebeixunchaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeixunchaView(){
	}
 
 	public ShebeixunchaView(ShebeixunchaEntity shebeixunchaEntity){
 	try {
			BeanUtils.copyProperties(this, shebeixunchaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
