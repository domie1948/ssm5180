package com.dao;

import com.entity.ShebeibaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeibaofeiVO;
import com.entity.view.ShebeibaofeiView;


/**
 * 设备报废
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeibaofeiDao extends BaseMapper<ShebeibaofeiEntity> {
	
	List<ShebeibaofeiVO> selectListVO(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
	
	ShebeibaofeiVO selectVO(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
	
	List<ShebeibaofeiView> selectListView(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);

	List<ShebeibaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
	
	ShebeibaofeiView selectView(@Param("ew") Wrapper<ShebeibaofeiEntity> wrapper);
	
}
