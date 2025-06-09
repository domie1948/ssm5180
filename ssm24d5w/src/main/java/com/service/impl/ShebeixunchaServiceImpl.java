package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShebeixunchaDao;
import com.entity.ShebeixunchaEntity;
import com.service.ShebeixunchaService;
import com.entity.vo.ShebeixunchaVO;
import com.entity.view.ShebeixunchaView;

@Service("shebeixunchaService")
public class ShebeixunchaServiceImpl extends ServiceImpl<ShebeixunchaDao, ShebeixunchaEntity> implements ShebeixunchaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeixunchaEntity> page = this.selectPage(
                new Query<ShebeixunchaEntity>(params).getPage(),
                new EntityWrapper<ShebeixunchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeixunchaEntity> wrapper) {
		  Page<ShebeixunchaView> page =new Query<ShebeixunchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeixunchaVO> selectListVO(Wrapper<ShebeixunchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeixunchaVO selectVO(Wrapper<ShebeixunchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeixunchaView> selectListView(Wrapper<ShebeixunchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeixunchaView selectView(Wrapper<ShebeixunchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
