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


import com.dao.ShebeibaofeiDao;
import com.entity.ShebeibaofeiEntity;
import com.service.ShebeibaofeiService;
import com.entity.vo.ShebeibaofeiVO;
import com.entity.view.ShebeibaofeiView;

@Service("shebeibaofeiService")
public class ShebeibaofeiServiceImpl extends ServiceImpl<ShebeibaofeiDao, ShebeibaofeiEntity> implements ShebeibaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeibaofeiEntity> page = this.selectPage(
                new Query<ShebeibaofeiEntity>(params).getPage(),
                new EntityWrapper<ShebeibaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeibaofeiEntity> wrapper) {
		  Page<ShebeibaofeiView> page =new Query<ShebeibaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeibaofeiVO> selectListVO(Wrapper<ShebeibaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeibaofeiVO selectVO(Wrapper<ShebeibaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeibaofeiView> selectListView(Wrapper<ShebeibaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeibaofeiView selectView(Wrapper<ShebeibaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
