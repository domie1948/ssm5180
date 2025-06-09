package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoyangyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoyangyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoyangyuyueView;


/**
 * 保养预约
 *
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface BaoyangyuyueService extends IService<BaoyangyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoyangyuyueVO> selectListVO(Wrapper<BaoyangyuyueEntity> wrapper);
   	
   	BaoyangyuyueVO selectVO(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
   	
   	List<BaoyangyuyueView> selectListView(Wrapper<BaoyangyuyueEntity> wrapper);
   	
   	BaoyangyuyueView selectView(@Param("ew") Wrapper<BaoyangyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoyangyuyueEntity> wrapper);
   	
}

