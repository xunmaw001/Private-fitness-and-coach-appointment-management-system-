package com.dao;

import com.entity.DiscussxiangmuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxiangmuxinxiVO;
import com.entity.view.DiscussxiangmuxinxiView;


/**
 * 项目信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:59
 */
public interface DiscussxiangmuxinxiDao extends BaseMapper<DiscussxiangmuxinxiEntity> {
	
	List<DiscussxiangmuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxiangmuxinxiEntity> wrapper);
	
	DiscussxiangmuxinxiVO selectVO(@Param("ew") Wrapper<DiscussxiangmuxinxiEntity> wrapper);
	
	List<DiscussxiangmuxinxiView> selectListView(@Param("ew") Wrapper<DiscussxiangmuxinxiEntity> wrapper);

	List<DiscussxiangmuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxiangmuxinxiEntity> wrapper);
	
	DiscussxiangmuxinxiView selectView(@Param("ew") Wrapper<DiscussxiangmuxinxiEntity> wrapper);
	

}
