import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jiaolianList from '../pages/jiaolian/list'
import jiaolianDetail from '../pages/jiaolian/detail'
import jiaolianAdd from '../pages/jiaolian/add'
import jianshenxinxiList from '../pages/jianshenxinxi/list'
import jianshenxinxiDetail from '../pages/jianshenxinxi/detail'
import jianshenxinxiAdd from '../pages/jianshenxinxi/add'
import jiaolianyuyueList from '../pages/jiaolianyuyue/list'
import jiaolianyuyueDetail from '../pages/jiaolianyuyue/detail'
import jiaolianyuyueAdd from '../pages/jiaolianyuyue/add'
import xiangmufenleiList from '../pages/xiangmufenlei/list'
import xiangmufenleiDetail from '../pages/xiangmufenlei/detail'
import xiangmufenleiAdd from '../pages/xiangmufenlei/add'
import xiangmuxinxiList from '../pages/xiangmuxinxi/list'
import xiangmuxinxiDetail from '../pages/xiangmuxinxi/detail'
import xiangmuxinxiAdd from '../pages/xiangmuxinxi/add'
import tousuxinxiList from '../pages/tousuxinxi/list'
import tousuxinxiDetail from '../pages/tousuxinxi/detail'
import tousuxinxiAdd from '../pages/tousuxinxi/add'
import shangpinfenleiList from '../pages/shangpinfenlei/list'
import shangpinfenleiDetail from '../pages/shangpinfenlei/detail'
import shangpinfenleiAdd from '../pages/shangpinfenlei/add'
import shangpinxinxiList from '../pages/shangpinxinxi/list'
import shangpinxinxiDetail from '../pages/shangpinxinxi/detail'
import shangpinxinxiAdd from '../pages/shangpinxinxi/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'jiaolian',
					component: jiaolianList
				},
				{
					path: 'jiaolianDetail',
					component: jiaolianDetail
				},
				{
					path: 'jiaolianAdd',
					component: jiaolianAdd
				},
				{
					path: 'jianshenxinxi',
					component: jianshenxinxiList
				},
				{
					path: 'jianshenxinxiDetail',
					component: jianshenxinxiDetail
				},
				{
					path: 'jianshenxinxiAdd',
					component: jianshenxinxiAdd
				},
				{
					path: 'jiaolianyuyue',
					component: jiaolianyuyueList
				},
				{
					path: 'jiaolianyuyueDetail',
					component: jiaolianyuyueDetail
				},
				{
					path: 'jiaolianyuyueAdd',
					component: jiaolianyuyueAdd
				},
				{
					path: 'xiangmufenlei',
					component: xiangmufenleiList
				},
				{
					path: 'xiangmufenleiDetail',
					component: xiangmufenleiDetail
				},
				{
					path: 'xiangmufenleiAdd',
					component: xiangmufenleiAdd
				},
				{
					path: 'xiangmuxinxi',
					component: xiangmuxinxiList
				},
				{
					path: 'xiangmuxinxiDetail',
					component: xiangmuxinxiDetail
				},
				{
					path: 'xiangmuxinxiAdd',
					component: xiangmuxinxiAdd
				},
				{
					path: 'tousuxinxi',
					component: tousuxinxiList
				},
				{
					path: 'tousuxinxiDetail',
					component: tousuxinxiDetail
				},
				{
					path: 'tousuxinxiAdd',
					component: tousuxinxiAdd
				},
				{
					path: 'shangpinfenlei',
					component: shangpinfenleiList
				},
				{
					path: 'shangpinfenleiDetail',
					component: shangpinfenleiDetail
				},
				{
					path: 'shangpinfenleiAdd',
					component: shangpinfenleiAdd
				},
				{
					path: 'shangpinxinxi',
					component: shangpinxinxiList
				},
				{
					path: 'shangpinxinxiDetail',
					component: shangpinxinxiDetail
				},
				{
					path: 'shangpinxinxiAdd',
					component: shangpinxinxiAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
