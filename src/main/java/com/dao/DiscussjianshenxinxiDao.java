package com.dao;

import com.entity.DiscussjianshenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenxinxiVO;
import com.entity.view.DiscussjianshenxinxiView;


/**
 * 健身信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:59
 */
public interface DiscussjianshenxinxiDao extends BaseMapper<DiscussjianshenxinxiEntity> {
	
	List<DiscussjianshenxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
	
	DiscussjianshenxinxiVO selectVO(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
	
	List<DiscussjianshenxinxiView> selectListView(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);

	List<DiscussjianshenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
	
	DiscussjianshenxinxiView selectView(@Param("ew") Wrapper<DiscussjianshenxinxiEntity> wrapper);
	

}
