import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import jianshenxinxi from '@/views/modules/jianshenxinxi/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import jiaolian from '@/views/modules/jiaolian/list'
    import discussjiaolian from '@/views/modules/discussjiaolian/list'
    import tousuxinxi from '@/views/modules/tousuxinxi/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjianshenxinxi from '@/views/modules/discussjianshenxinxi/list'
    import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
    import discussshangpinxinxi from '@/views/modules/discussshangpinxinxi/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'
    import jiaolianyuyue from '@/views/modules/jiaolianyuyue/list'
    import discussxiangmuxinxi from '@/views/modules/discussxiangmuxinxi/list'
    import xiangmuxinxi from '@/views/modules/xiangmuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '健身资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/jianshenxinxi',
        name: '健身信息',
        component: jianshenxinxi
      }
      ,{
	path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
      ,{
	path: '/jiaolian',
        name: '教练',
        component: jiaolian
      }
      ,{
	path: '/discussjiaolian',
        name: '教练评论',
        component: discussjiaolian
      }
      ,{
	path: '/tousuxinxi',
        name: '投诉信息',
        component: tousuxinxi
      }
      ,{
	path: '/forum',
        name: '在线交流',
        component: forum
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussjianshenxinxi',
        name: '健身信息评论',
        component: discussjianshenxinxi
      }
      ,{
	path: '/shangpinfenlei',
        name: '商品分类',
        component: shangpinfenlei
      }
      ,{
	path: '/discussshangpinxinxi',
        name: '商品信息评论',
        component: discussshangpinxinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiaolianyuyue',
        name: '教练预约',
        component: jiaolianyuyue
      }
      ,{
	path: '/discussxiangmuxinxi',
        name: '项目信息评论',
        component: discussxiangmuxinxi
      }
      ,{
	path: '/xiangmuxinxi',
        name: '项目信息',
        component: xiangmuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
