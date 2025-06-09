
var projectName = '医院设备管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [


{
	name: '论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm24d5w/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室员","menuJump":"列表","tableName":"keshiyuan"}],"menu":"科室员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"维修员","menuJump":"列表","tableName":"weixiuyuan"}],"menu":"维修员管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"设备领用","menuJump":"列表","tableName":"shebeilingyong"}],"menu":"设备领用管理"},{"child":[{"buttons":["新增","查看","修改","删除","入库","出库","借用","归还"],"menu":"设备信息","menuJump":"列表","tableName":"shebeixinxi"}],"menu":"设备信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备入库","menuJump":"列表","tableName":"shebeiruku"}],"menu":"设备入库管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备出库","menuJump":"列表","tableName":"shebeichuku"}],"menu":"设备出库管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备报废","menuJump":"列表","tableName":"shebeibaofei"}],"menu":"设备报废管理"},{"child":[{"buttons":["新增","查看","修改","删除","设备归还","归还"],"menu":"设备借用","menuJump":"列表","tableName":"shebeijieyong"}],"menu":"设备借用管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备归还","menuJump":"列表","tableName":"shebeiguihai"}],"menu":"设备归还管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","设备报修","保养预约"],"menu":"设备领用","menuJump":"列表","tableName":"shebeilingyong"}],"menu":"设备领用管理"},{"child":[{"buttons":["新增","查看"],"menu":"设备报修","menuJump":"列表","tableName":"shebeibaoxiu"}],"menu":"设备报修管理"},{"child":[{"buttons":["查看","查看评论","评价"],"menu":"设备维修","menuJump":"列表","tableName":"shebeiweixiu"}],"menu":"设备维修管理"},{"child":[{"buttons":["新增","查看"],"menu":"保养预约","menuJump":"列表","tableName":"baoyangyuyue"}],"menu":"保养预约管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"科室员","tableName":"keshiyuan"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","维修处理"],"menu":"设备报修","menuJump":"列表","tableName":"shebeibaoxiu"}],"menu":"设备报修管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"设备维修","menuJump":"列表","tableName":"shebeiweixiu"}],"menu":"设备维修管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"保养预约","menuJump":"列表","tableName":"baoyangyuyue"}],"menu":"保养预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"设备巡查","menuJump":"列表","tableName":"shebeixuncha"}],"menu":"设备巡查管理"},{"child":[{"buttons":["查看"],"menu":"维修评价","menuJump":"列表","tableName":"weixiupingjia"}],"menu":"维修评价管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"维修员","tableName":"weixiuyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
