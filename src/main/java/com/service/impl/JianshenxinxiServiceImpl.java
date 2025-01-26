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


import com.dao.JianshenxinxiDao;
import com.entity.JianshenxinxiEntity;
import com.service.JianshenxinxiService;
import com.entity.vo.JianshenxinxiVO;
import com.entity.view.JianshenxinxiView;

@Service("jianshenxinxiService")
public class JianshenxinxiServiceImpl extends ServiceImpl<JianshenxinxiDao, JianshenxinxiEntity> implements JianshenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenxinxiEntity> page = this.selectPage(
                new Query<JianshenxinxiEntity>(params).getPage(),
                new EntityWrapper<JianshenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenxinxiEntity> wrapper) {
		  Page<JianshenxinxiView> page =new Query<JianshenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenxinxiVO> selectListVO(Wrapper<JianshenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenxinxiVO selectVO(Wrapper<JianshenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenxinxiView> selectListView(Wrapper<JianshenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenxinxiView selectView(Wrapper<JianshenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
