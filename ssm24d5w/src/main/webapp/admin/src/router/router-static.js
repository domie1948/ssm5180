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
    import baoyangyuyue from '@/views/modules/baoyangyuyue/list'
    import shebeiguihai from '@/views/modules/shebeiguihai/list'
    import shebeibaoxiu from '@/views/modules/shebeibaoxiu/list'
    import shebeiweixiu from '@/views/modules/shebeiweixiu/list'
    import shebeilingyong from '@/views/modules/shebeilingyong/list'
    import shebeixinxi from '@/views/modules/shebeixinxi/list'
    import users from '@/views/modules/users/list'
    import shebeichuku from '@/views/modules/shebeichuku/list'
    import forum from '@/views/modules/forum/list'
    import shebeixuncha from '@/views/modules/shebeixuncha/list'
    import weixiuyuan from '@/views/modules/weixiuyuan/list'
    import keshiyuan from '@/views/modules/keshiyuan/list'
    import chat from '@/views/modules/chat/list'
    import shebeiruku from '@/views/modules/shebeiruku/list'
    import shebeibaofei from '@/views/modules/shebeibaofei/list'
    import shebeijieyong from '@/views/modules/shebeijieyong/list'
    import config from '@/views/modules/config/list'
    import weixiupingjia from '@/views/modules/weixiupingjia/list'


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
        name: '新闻资讯',
        component: news
      }
          ,{
	path: '/baoyangyuyue',
        name: '保养预约',
        component: baoyangyuyue
      }
          ,{
	path: '/shebeiguihai',
        name: '设备归还',
        component: shebeiguihai
      }
          ,{
	path: '/shebeibaoxiu',
        name: '设备报修',
        component: shebeibaoxiu
      }
          ,{
	path: '/shebeiweixiu',
        name: '设备维修',
        component: shebeiweixiu
      }
          ,{
	path: '/shebeilingyong',
        name: '设备领用',
        component: shebeilingyong
      }
          ,{
	path: '/shebeixinxi',
        name: '设备信息',
        component: shebeixinxi
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/shebeichuku',
        name: '设备出库',
        component: shebeichuku
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/shebeixuncha',
        name: '设备巡查',
        component: shebeixuncha
      }
          ,{
	path: '/weixiuyuan',
        name: '维修员',
        component: weixiuyuan
      }
          ,{
	path: '/keshiyuan',
        name: '科室员',
        component: keshiyuan
      }
          ,{
	path: '/chat',
        name: '客服管理',
        component: chat
      }
          ,{
	path: '/shebeiruku',
        name: '设备入库',
        component: shebeiruku
      }
          ,{
	path: '/shebeibaofei',
        name: '设备报废',
        component: shebeibaofei
      }
          ,{
	path: '/shebeijieyong',
        name: '设备借用',
        component: shebeijieyong
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/weixiupingjia',
        name: '维修评价',
        component: weixiupingjia
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

export default router;
