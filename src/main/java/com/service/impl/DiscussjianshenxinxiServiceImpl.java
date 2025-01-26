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


import com.dao.DiscussjianshenxinxiDao;
import com.entity.DiscussjianshenxinxiEntity;
import com.service.DiscussjianshenxinxiService;
import com.entity.vo.DiscussjianshenxinxiVO;
import com.entity.view.DiscussjianshenxinxiView;

@Service("discussjianshenxinxiService")
public class DiscussjianshenxinxiServiceImpl extends ServiceImpl<DiscussjianshenxinxiDao, DiscussjianshenxinxiEntity> implements DiscussjianshenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenxinxiEntity> page = this.selectPage(
                new Query<DiscussjianshenxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenxinxiEntity> wrapper) {
		  Page<DiscussjianshenxinxiView> page =new Query<DiscussjianshenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenxinxiVO> selectListVO(Wrapper<DiscussjianshenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenxinxiVO selectVO(Wrapper<DiscussjianshenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenxinxiView> selectListView(Wrapper<DiscussjianshenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenxinxiView selectView(Wrapper<DiscussjianshenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
