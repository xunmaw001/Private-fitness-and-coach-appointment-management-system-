<template>
<div class="home-preview" :style='{"width":"100%","margin":"0px auto","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>


	<!-- 关于我们 -->
	<div :style='{"padding":"0px 7% 0px","boxShadow":"0 0px 0px rgba(255, 255, 255, .3)","margin":"0px auto 0px","flexWrap":"wrap","background":"url() no-repeat center bottom / 100% auto","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"600px"}'>
	  <div :style='{"padding":"0 0 20px","margin":"-60px 0 0 0px","color":"#333333","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom","width":"100%","lineHeight":"40px","fontSize":"24px","fontWeight":"bold","height":"60px","order":"2"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"margin":"20px 0 0px","color":"#f2f2f2","top":"0","textAlign":"center","background":"none","width":"100%","lineHeight":"1","fontSize":"80px","position":"relative","fontWeight":"bold"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"padding":"120px 7% 40px 0","top":"0","flexWrap":"wrap","background":"none","display":"flex","width":"44%","position":"absolute","right":"0%","height":"100%","order":"4"}'>
	    <img :style='{"width":"100%","margin":"0px","objectFit":"cover","background":"#fff","display":"block","height":"100%"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"padding":"20px","margin":"0px 0 0 0px","overflow":"hidden","color":"#666","background":"linear-gradient(270deg, rgba(249,249,249,1) 50%, rgba(242,242,242,1) 100%),#f2f2f2","width":"calc(48% - 0px)","lineHeight":"24px","fontSize":"15px","textIndent":"2em","float":"left","height":"284px","order":"3"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>

<div class="recommend" :style='{"padding":"0 0 60px","margin":"0px auto","flexWrap":"wrap","background":"url() no-repeat center top,#fff","display":"flex","width":"100%","position":"relative"}'>
	<div v-if="true" class="idea recommendIdea" :style='{"padding":"0px 7%","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230111/716e966cad1743d9b1ff1915ce985774.jpg) no-repeat center center / 100% 100%","display":"flex","width":"100%","justifyContent":"space-between","height":"200px"}'>
		<div class="box1" :style='{"width":"100%","background":"url(http://codegen.caihongy.cn/20230111/4367fbe926804b4bb2daafcbbeaf67b5.png) no-repeat left center","height":"200px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","padding":"0px 7%","margin":"40px auto 20px","lineHeight":"54px","textAlign":"center","background":"none"}'>
		<span :style='{"padding":"0 0 20px","fontSize":"24px","color":"#202020","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom"}'>项目信息推荐</span>
	</div>
	
	
	
	
	
	<!-- 样式四 -->
	<div class="list list4 index-pv1" :style='{"width":"100%","padding":"20px 7% 40px","background":"none","height":"auto"}'>
		<div v-if="xiangmuxinxiRecommend.length>0" class="list-item animation-box" @click="toDetail('xiangmuxinxiDetail', xiangmuxinxiRecommend[0])" :style='{"width":"48%","margin":"0","position":"relative","float":"right","height":"570px"}'>
			<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="xiangmuxinxiRecommend[0].tupian.substr(0,4)=='http'" :src="xiangmuxinxiRecommend[0].tupian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (xiangmuxinxiRecommend[0].tupian?xiangmuxinxiRecommend[0].tupian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"18px","position":"absolute","textOverflow":"ellipsis"}'>
                <div>{{xiangmuxinxiRecommend[0].xiangmumingcheng}}</div>
                <div>{{xiangmuxinxiRecommend[0].xiangmufenlei}}</div>
                <div>{{xiangmuxinxiRecommend[0].kechengshizhang}}</div>
            </div>
		</div>
		<div class="list-body" :style='{"width":"48%","margin":"0 0 10px","float":"left","justifyContent":"space-between","display":"flex","height":"275px"}'>
			<div v-if="xiangmuxinxiRecommend.length>1" @click="toDetail('xiangmuxinxiDetail', xiangmuxinxiRecommend[1])" class="list-item animation-box" :style='{"width":"48%","margin":"0 0px","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="xiangmuxinxiRecommend[1].tupian.substr(0,4)=='http'" :src="xiangmuxinxiRecommend[1].tupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (xiangmuxinxiRecommend[1].tupian?xiangmuxinxiRecommend[1].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"18px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{xiangmuxinxiRecommend[1].xiangmumingcheng}}</div>
                    <div>{{xiangmuxinxiRecommend[1].xiangmufenlei}}</div>
                    <div>{{xiangmuxinxiRecommend[1].kechengshizhang}}</div>
                </div>
			</div>
			<div v-if="xiangmuxinxiRecommend.length>2" @click="toDetail('xiangmuxinxiDetail', xiangmuxinxiRecommend[2])" class="list-item animation-box" :style='{"width":"48%","margin":"0 10px","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="xiangmuxinxiRecommend[2].tupian.substr(0,4)=='http'" :src="xiangmuxinxiRecommend[2].tupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (xiangmuxinxiRecommend[2].tupian?xiangmuxinxiRecommend[2].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"overflow":"hidden","whiteSpace":"nowrap","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"18px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{xiangmuxinxiRecommend[2].xiangmumingcheng}}</div>
                    <div>{{xiangmuxinxiRecommend[2].xiangmufenlei}}</div>
                    <div>{{xiangmuxinxiRecommend[2].kechengshizhang}}</div>
                </div>
			</div>
		</div>
		<div class="list-body" :style='{"width":"48%","margin":"10px 0 0","justifyContent":"space-between","display":"flex","height":"275px"}'>
			<div v-if="xiangmuxinxiRecommend.length>3" @click="toDetail('xiangmuxinxiDetail', xiangmuxinxiRecommend[3])" class="list-item animation-box" :style='{"width":"48%","margin":"0 10px","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="xiangmuxinxiRecommend[3].tupian.substr(0,4)=='http'" :src="xiangmuxinxiRecommend[3].tupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (xiangmuxinxiRecommend[3].tupian?xiangmuxinxiRecommend[3].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"18px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{xiangmuxinxiRecommend[3].xiangmumingcheng}}</div>
                    <div>{{xiangmuxinxiRecommend[3].xiangmufenlei}}</div>
                    <div>{{xiangmuxinxiRecommend[3].kechengshizhang}}</div>
                </div>
			</div>
			<div v-if="xiangmuxinxiRecommend.length>4" @click="toDetail('xiangmuxinxiDetail', xiangmuxinxiRecommend[4])" class="list-item animation-box" :style='{"width":"48%","margin":"0 10px","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="xiangmuxinxiRecommend[4].tupian.substr(0,4)=='http'" :src="xiangmuxinxiRecommend[4].tupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (xiangmuxinxiRecommend[4].tupian?xiangmuxinxiRecommend[4].tupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"18px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{xiangmuxinxiRecommend[4].xiangmumingcheng}}</div>
                    <div>{{xiangmuxinxiRecommend[4].xiangmufenlei}}</div>
                    <div>{{xiangmuxinxiRecommend[4].kechengshizhang}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('xiangmuxinxi')" :style='{"border":"1px solid #999","margin":"20px auto 0px","textAlign":"center","background":"none","display":"inline-block","width":"80px","lineHeight":"36px"}'>
		<span :style='{"color":"#999","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#999","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>



<div class="lists" :style='{"width":"100%","padding":"0px 7% 20px","margin":"0px auto","background":"#fff"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","padding":"0px 7%","margin":"0px auto 40px","lineHeight":"54px","textAlign":"center","background":"none"}'>
	  <span :style='{"padding":"0 0 20px","fontSize":"24px","color":"#202020","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom"}'>教练展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listsjiaolian" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0","fontSize":"0","position":"relative","borderRadius":"4px","background":"#fff"}' v-for="(item,index) in jiaolianList" :key="index" @click="toDetail('jiaolianDetail', item)">
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-if="item.touxiang.substr(0,4)=='http'" :src="item.touxiang.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.touxiang?item.touxiang.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.jiaolianxingming}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('jiaolian')" :style='{"border":"0","margin":"0px auto 0px","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"width":"100%","padding":"0px 7% 20px","margin":"0px auto","background":"#fff"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","padding":"0px 7%","margin":"0px auto 40px","lineHeight":"54px","textAlign":"center","background":"none"}'>
	  <span :style='{"padding":"0 0 20px","fontSize":"24px","color":"#202020","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom"}'>健身信息展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listsjianshenxinxi" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0","fontSize":"0","position":"relative","borderRadius":"4px","background":"#fff"}' v-for="(item,index) in jianshenxinxiList" :key="index" @click="toDetail('jianshenxinxiDetail', item)">
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-if="item.tupian.substr(0,4)=='http'" :src="item.tupian.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.biaoti}}</div>
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.jianshenleixing}}</div>
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.fabushijian}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('jianshenxinxi')" :style='{"border":"0","margin":"0px auto 0px","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>
<div class="lists" :style='{"width":"100%","padding":"0px 7% 20px","margin":"0px auto","background":"#fff"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","padding":"0px 7%","margin":"0px auto 40px","lineHeight":"54px","textAlign":"center","background":"none"}'>
	  <span :style='{"padding":"0 0 20px","fontSize":"24px","color":"#202020","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom"}'>商品信息展示</span>
	</div>
	
	
	
	
	<!-- 样式三 -->
	<div class="list list3 index-pv1">
		<div class="swiper-container" id="listsshangpinxinxi" :style='{"width":"100%","padding":"10px","background":"#fff","height":"auto"}'>
			<div class="swiper-wrapper">
				<div class="swiper-slide animation-box" :style='{"border":"0","fontSize":"0","position":"relative","borderRadius":"4px","background":"#fff"}' v-for="(item,index) in shangpinxinxiList" :key="index" @click="toDetail('shangpinxinxiDetail', item)">
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-if="item.tupian.substr(0,4)=='http'" :src="item.tupian.split(',')[0]" alt="" />
					<img :name="item.id" :style='{"border":"0","width":"100%","height":"250px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.shangpinmingcheng}}</div>
					<div class="name line1" :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"32px","color":"#333"}'>{{item.shangpinfenlei}}</div>
            </div>
        </div>
			<!-- 如果需要导航按钮 -->
			<div class="swiper-button-prev"></div>
			<div class="swiper-button-next"></div>
		</div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('shangpinxinxi')" :style='{"border":"0","margin":"0px auto 0px","textAlign":"center","background":"#409EFF","display":"none","width":"80px","lineHeight":"32px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	

</div>

	
<div class="news" :style='{"minHeight":"520px","padding":"20px 0 40px","margin":"0px auto 0px","flexWrap":"wrap","background":"url() no-repeat center top,#fff","display":"flex","width":"100%","position":"relative"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","padding":"0px 7%","margin":"20px auto 60px","lineHeight":"54px","textAlign":"center","background":"none"}'>
		<span :style='{"padding":"0 0 20px","fontSize":"24px","lineHeight":"40px","color":"#202020","background":"url(http://codegen.caihongy.cn/20230111/0c17638871cf4d2ebd3ed6bc1131ba4c.png) no-repeat center bottom","fontWeight":"bold"}'>健身资讯</span>
	</div>
	
	
	
	
	
	<!-- 样式四 -->
	<div v-if="newsList.length" class="list list4 index-pv1" :style='{"padding":"0px 0","margin":"0 7%","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","justifyContent":"flex-end","height":"auto"}'>
	    <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" class="new-list-item animation-box" :style='{"padding":"0px","margin":"0 25px 0 0","background":"none","width":"48%","float":"right","height":"300px","order":"2"}'>
			<div :style='{"margin":"0 0 0px 10px","whiteSpace":"nowrap","overflow":"hidden","color":"#111","textAlign":"left","background":"none","fontSize":"20px","lineHeight":"32px","textOverflow":"ellipsis"}' class="new-list-item-title line1">{{newsList[0].title}}</div>
			<div :style='{"padding":"10px 10px","margin":"0 0 10px","overflow":"hidden","color":"#666","background":"none","fontSize":"14px","lineHeight":"24px","textIndent":"2em","height":"188px"}' class="descript  line3">{{newsList[0].introduction}}</div>
			<div :style='{"fontSize":"12px","color":"#666","textAlign":"right","display":"none"}' class="time">{{newsList[0].addtime}}</div>
	    </div>
	    <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" class="new-list-item animation-box" :style='{"width":"48%","float":"left","background":"rgba(255,255,255,.3)","height":"500px","order":"1"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"100%"}' :src="baseUrl + newsList[0].picture" alt="">
	    </div>
	    <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" class="new-list-item animation-box" :style='{"width":"390px","padding":"10px","background":"#f5f5f5","display":"none","height":"300px"}'>
			<div :style='{"margin":"0 0 10px","fontSize":"16px","color":"#333","textAlign":"center"}' class="new-list-item-title line1">{{newsList[1].title}}</div>
			<div :style='{"color":"#666","margin":"0 0 10px","fontSize":"14px"}' class="descript  line3">{{newsList[1].introduction}}</div>
			<div :style='{"color":"#999","textAlign":"right","fontSize":"12px"}' class="time">{{newsList[1].addtime}}</div>
	    </div>
	    <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" class="new-list-item animation-box" :style='{"padding":"0 20px  0 0","margin":"0 0px 0 1%","background":"rgba(255,255,255,.3)","bottom":"0","width":"23%","position":"absolute","right":"25%","height":"200px","order":"3"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"100%"}' :src="baseUrl + newsList[1].picture" alt="">
	    </div>
	    <div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" class="new-list-item animation-box" :style='{"width":"390px","padding":"10px","background":"#f5f5f5","display":"none","height":"300px"}'>
			<div :style='{"margin":"0 0 10px","fontSize":"16px","color":"#333","textAlign":"center"}' class="new-list-item-title  line1">{{newsList[2].title}}</div>
			<div :style='{"color":"#666","margin":"0 0 10px","fontSize":"14px"}' class="descript  line3">{{newsList[2].introduction}}</div>
			<div :style='{"color":"#999","textAlign":"right","fontSize":"12px"}' class="time">{{newsList[2].addtime}}</div>
	    </div>
	    <div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" class="new-list-item animation-box" :style='{"background":"none","bottom":"0","width":"23%","position":"absolute","right":"0","height":"200px","order":"6"}'>
			<img :style='{"objectFit":"cover","width":"100%","height":"100%"}' :src="baseUrl + newsList[2].picture" alt="">
	    </div>
	</div>
	
	
	
	
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"0","padding":"0 22px","margin":"0px auto 0px","top":"396px","textAlign":"center","left":"52%","background":"#000","display":"inline-block","width":"auto","lineHeight":"40px","position":"absolute"}'>
		<span :style='{"color":"#fff","fontSize":"12px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#fff","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>

</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        newsList: [],
        xiangmuxinxiRecommend: [],

        jiaolianList: [],
        jianshenxinxiList: [],
        shangpinxinxiList: [],
      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getAboutUs();
      this.getList();
    },
    //方法集合
    methods: {
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 4,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "xiangmuxinxi/autoSort";
          if(localStorage.getItem('Token')) {
              autoSortUrl = "xiangmuxinxi/autoSort2";
          }
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 8,
			}}).then(res => {
				if (res.data.code == 0) {
					this.xiangmuxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			this.$http.get('jiaolian/list', {params: {
				page: 1,
				limit: 12,
			}}).then(res => {
				if (res.data.code == 0) {
					this.jiaolianList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listsjiaolian', options)
					})
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('jianshenxinxi/list', {params: {
				sort : 'fabushijian',
				order: 'desc',
				page: 1,
				limit: 12,
			}}).then(res => {
				if (res.data.code == 0) {
					this.jianshenxinxiList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listsjianshenxinxi', options)
					})
					
					// 商品列表样式五
					
				}
			});
			this.$http.get('shangpinxinxi/list', {params: {
				sort : 'shangjiariqi',
				order: 'desc',
				page: 1,
				limit: 12,
			}}).then(res => {
				if (res.data.code == 0) {
					this.shangpinxinxiList = res.data.data.list;
					let options = {"observer":true,"navigation":{"nextEl":".swiper-button-next","prevEl":".swiper-button-prev"},"observeParents":true,"loop":true,"slidesPerView":5,"speed":500,"spaceBetween":20,"autoplay":{"delay":3000,"disableOnInteraction":false}}
					options.pagination = {el:'null'}
					if(options.slidesPerView) {
						options.slidesPerView = Number(options.slidesPerView);
					}
					if(options.spaceBetween) {
						options.spaceBetween = Number(options.spaceBetween);
					}
					this.$nextTick(() => {
						new Swiper ('#listsshangpinxinxi', options)
					})
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: translate3d(10px,0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
