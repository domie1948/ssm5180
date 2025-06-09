package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeixunchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeixunchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeixunchaView;


/**
 * 设备巡查
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeixunchaService extends IService<ShebeixunchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeixunchaVO> selectListVO(Wrapper<ShebeixunchaEntity> wrapper);
   	
   	ShebeixunchaVO selectVO(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
   	
   	List<ShebeixunchaView> selectListView(Wrapper<ShebeixunchaEntity> wrapper);
   	
   	ShebeixunchaView selectView(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeixunchaEntity> wrapper);
   	
}

