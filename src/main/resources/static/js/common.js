// /**********************公用的js文件*************************/
// $(function () {
//     $(".logout").click(function () {
//         CAjax("/user/logOut", {},function (data) {
//             if(data.code === 1) {
//                 window.location.href = "/";
//                 localStorage.clear();
//             }
//         })
//     });
// });
//
//
// //数据初始化
//
// let name = localStorage.getItem("name");
// let signFlag = localStorage.getItem("signFlag");
// let flag = localStorage.getItem("flag");
// $(".name").text(name);
// if(signFlag === "1"){
//     $(".sign-type").attr("href","/user/detect?type=signout");
//     $(".sign-type").text("签退");
// } else {
//     $(".sign-type").attr("href","/user/detect?type=signin");
//     $(".sign-type").text("签到");
// }
// if(flag === "2"){
//     let str = $('<li><a href="/admin/admin">进入后台</a></li>\n' +
//         '   <li role="separator" class="divider"></li>');
//     $(".admin-forward").after(str);
// }
//
// //项目使用的ajax方法
// function CAjax(url, data, cb) {
//     let urlAll =/* "https://192.168.3.3" +*/ url;
//     let params = {
//         "data": JSON.stringify(data),
//         timestamp: new Date().getTime()
//     };
//     $.post(urlAll, params, function(res) {
//         return typeof cb === "function" && cb(res)
//     })
// }
//
// //视频参数
// var opt = {
//     audio: false,
//     video: {
//         width: 300,
//         height: 300
//     }
// };
//
// var sUserAgent = navigator.userAgent;
// var isWin7 = sUserAgent.indexOf("Windows NT 6.1") > -1 || sUserAgent.indexOf("Windows 7") > -1;
// var isWin10 = sUserAgent.indexOf("Windows NT 10") > -1 || sUserAgent.indexOf("Windows 10") > -1;
//
// function screenshot(video, canvas){
//     var ctx = canvas.getContext('2d');//设置canvas绘制2d图，
//     var width = 300;//设置canvas宽
//     var height = 300;//设置canvas高
//     canvas.width = width;
//     canvas.height = height;
//     ctx.drawImage(video, 0, 0, width, height);//将video视频绘制到canvas中
//     var images = canvas.toDataURL('image/jpeg',0.92);//canvas的api中的toDataURL（）保存图像
//     images = images.split(",")[1];
//
//     return images;
// }
//
// //控制总的完成度
// function getCompletedPercent(me, weekScore) {
//     let allScore = me.parents(".day-body").find(".day-score");
//     console.log(allScore);
//     let percent = 0;
//     allScore.each(function (index, item) {
//         let $item = $(item);
//         percent += parseInt($item.text());
//     });
//     weekScore.text((percent/7).toFixed(2) + "%");
// }
//
// //home 和 myPlan页面的编辑
// $(".edit-plan").click(function (e){
//     let $me = $(this);
//     let currentTask = $me.parent().parent().find(".task").text();
//     let currentScore = $me.parent().parent().find(".day-score").text();
//         layer.open({
//         type: 1,
//         area: '650px',
//         content: `<form class="layui-form" action="" style="margin: 15px 15px 15px 0">
//                             <div class="layui-form-item layui-form-text">
//                                 <label class="layui-form-label" style="width: 100px">计划详情</label>
//                                 <div class="layui-input-block">
//                                     <textarea id="day-task" name="day-task" placeholder="请输入计划详情" class="layui-textarea" style="resize: none">${currentTask}</textarea>
//                                 </div>
//                             </div>
//                             <div class="layui-form-item layui-form-text">
//                                 <label class="layui-form-label" style="width: 100px">分数</label>
//                                 <div class="layui-input-block">
//                                     <input type="text" id="day-score" name="day-score" class="layui-input" placeholder="请给你的一天打分" autocomplete="off" value="${currentScore}">
//                                 </div>
//                             </div>
//                         </form>`,
//         anim: 1,
//         btn: ['提交', '关闭'],
//         yes: function (index, layero) {
//             let data = {
//                 dayId:$me.data("id"),
//                 dayScore:$("#day-score").val(),
//                 dayTask:$("#day-task").val()
//             };
//             if(isNaN(parseInt(data.dayScore)) || parseInt(data.dayScore)>100 || parseInt(data.dayScore) < 0 || data.dayScore.length === 0 || data.dayTask.length === 0){
//                 layer.msg("输入有误");
//             } else {
//                 let $item = $me.parent().parent();
//                 let score = data.dayScore;
//                 let task = data.dayTask;
//                 CAjax("/plan/updateDayPlan", data, function (data) {
//                     $item.find(".task").text(task);
//                     $item.find(".day-score").text(score);
//                     $item.find(".score-width").css({width:score+"%"});
//                     getCompletedPercent($me, $item.parents(".rotate").find(".week-score"));
//                     layer.msg(data.msg);
//                     layer.close(index);
//                 })
//             }
//         },
//         btn2:function (index,layero) {
//
//         }
//     });
//     e.stopPropagation();
// });