package com.entity.view;

import com.entity.ShebeibaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备报废
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
@TableName("shebeibaofei")
public class ShebeibaofeiView  extends ShebeibaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeibaofeiView(){
	}
 
 	public ShebeibaofeiView(ShebeibaofeiEntity shebeibaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, shebeibaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
