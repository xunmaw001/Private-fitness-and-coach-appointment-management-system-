package com.dao;

import com.entity.JianshenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenxinxiVO;
import com.entity.view.JianshenxinxiView;


/**
 * 健身信息
 * 
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
public interface JianshenxinxiDao extends BaseMapper<JianshenxinxiEntity> {
	
	List<JianshenxinxiVO> selectListVO(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
	
	JianshenxinxiVO selectVO(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
	
	List<JianshenxinxiView> selectListView(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);

	List<JianshenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
	
	JianshenxinxiView selectView(@Param("ew") Wrapper<JianshenxinxiEntity> wrapper);
	

}
