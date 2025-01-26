package com.entity.vo;

import com.entity.JianshenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健身信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-08 20:26:58
 */
public class JianshenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 健身类型
	 */
	
	private String jianshenleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 视频教学
	 */
	
	private String shipinjiaoxue;
		
	/**
	 * 健身内容
	 */
	
	private String jianshenneirong;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：健身类型
	 */
	 
	public void setJianshenleixing(String jianshenleixing) {
		this.jianshenleixing = jianshenleixing;
	}
	
	/**
	 * 获取：健身类型
	 */
	public String getJianshenleixing() {
		return jianshenleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：视频教学
	 */
	 
	public void setShipinjiaoxue(String shipinjiaoxue) {
		this.shipinjiaoxue = shipinjiaoxue;
	}
	
	/**
	 * 获取：视频教学
	 */
	public String getShipinjiaoxue() {
		return shipinjiaoxue;
	}
				
	
	/**
	 * 设置：健身内容
	 */
	 
	public void setJianshenneirong(String jianshenneirong) {
		this.jianshenneirong = jianshenneirong;
	}
	
	/**
	 * 获取：健身内容
	 */
	public String getJianshenneirong() {
		return jianshenneirong;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
