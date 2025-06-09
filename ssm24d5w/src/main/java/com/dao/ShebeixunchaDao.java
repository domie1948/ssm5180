package com.dao;

import com.entity.ShebeixunchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeixunchaVO;
import com.entity.view.ShebeixunchaView;


/**
 * 设备巡查
 * 
 * @author 
 * @email 
 * @date 2021-03-09 10:45:47
 */
public interface ShebeixunchaDao extends BaseMapper<ShebeixunchaEntity> {
	
	List<ShebeixunchaVO> selectListVO(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
	
	ShebeixunchaVO selectVO(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
	
	List<ShebeixunchaView> selectListView(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);

	List<ShebeixunchaView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
	
	ShebeixunchaView selectView(@Param("ew") Wrapper<ShebeixunchaEntity> wrapper);
	
}
