const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmnt5mp/",
            name: "ssmnt5mp",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmnt5mp/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "私人健身和教练预约管理系统"
        } 
    }
}
export default base
