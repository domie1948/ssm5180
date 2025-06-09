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


import com.dao.ShebeichukuDao;
import com.entity.ShebeichukuEntity;
import com.service.ShebeichukuService;
import com.entity.vo.ShebeichukuVO;
import com.entity.view.ShebeichukuView;

@Service("shebeichukuService")
public class ShebeichukuServiceImpl extends ServiceImpl<ShebeichukuDao, ShebeichukuEntity> implements ShebeichukuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeichukuEntity> page = this.selectPage(
                new Query<ShebeichukuEntity>(params).getPage(),
                new EntityWrapper<ShebeichukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeichukuEntity> wrapper) {
		  Page<ShebeichukuView> page =new Query<ShebeichukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeichukuVO> selectListVO(Wrapper<ShebeichukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeichukuVO selectVO(Wrapper<ShebeichukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeichukuView> selectListView(Wrapper<ShebeichukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeichukuView selectView(Wrapper<ShebeichukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
