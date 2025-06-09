const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm24d5w/",
            name: "ssm24d5w",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm24d5w/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "医院设备管理系统"
        } 
    }
}
export default base
