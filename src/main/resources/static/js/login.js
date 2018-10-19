$(function () {
    //控制手
    armControl($('#password'))
    armControl($('.pwd'))

    //监听回车登录
    $(document).keyup(function(event){
        switch(event.keyCode) {
            case 13:
                $(".submit").trigger("click");
                return;
        }
    });

    //控制密码显示与否
    controlPwd_cpwd()
    $(window).on("resize", function () {
        $(".eye").unbind();
        controlPwd_cpwd();
    });

    //监听submit事件
    $(".submit").click(function (e) {
        e.preventDefault();
        let data = {};
        if($(".loginform").hasClass("mylogin")){
            //登录时使用
            data = {
                username : $("#username").val(),
                password : $("#password").val()
            };
            if(!isNull(data)){
                // let id = data.id;
                // CAjax("/check", data, function (data) {
                //     if(data.code === 1) {
                //         localStorage.setItem("id", id);
                //         window.location.href = "/user/home?id="+id+"&t="+new Date().getTime();
                //     } else {
                //         layer.msg(data.msg);
                //     }
                // });

                $.post("/exp/login", data, function (data) {
                    console.log(data);
                    if (data.code === 0){
                        layer.msg(data.msg);
                    } else {
                        window.location.href = "/exp/index?t="+new Date().getTime();
                    }
                })

            } else {
                layer.msg("请保持所有选项非空！");
            }

         }
         // else {
        //     //修改密码时使用
        //     data = {
        //         id : $("#username").val(),
        //         passwordOld : $("#passwordOld").val(),
        //         passwordNew1 :$("#passwordNew1").val(),
        //         passwordNew2 : $("#passwordNew2").val()
        //     };
        //     if(isNull(data)){
        //         layer.msg("请保持所有内容非空");
        //         return false;
        //     } else {
        //         if(data.passwordNew1 === data.passwordOld){
        //             layer.msg("请修改与之前密码不一样的密码");
        //             return false
        //         } else if(data.passwordNew1 !== data.passwordNew2){
        //             layer.msg("两次输入的密码不一致");
        //             return false
        //         } else {
        //             CAjax("/user/changePassword", data, function (data) {
        //             if(data.code === 1) {
        //                 layer.msg("修改成功",{time:800}, function () {
        //                     window.location.href = "/user/home?id="+localStorage.getItem("id")+"t=" + new Date().getTime();
        //                 });
        //             } else {
        //                 layer.msg("网络不佳请联系实验室最帅的平叶超");
        //             }
        //         });
        //         }
        //     }
        // }
    });

    //控制背景淡入淡出
    let num = Math.round( Math.random() *19 ) + 1;
    $(".bg").css({
        background:'url(/imgs/bg/'+num+'.jpg) no-repeat'
    });
    //监听左右点击
    $(".left, .right").click(function () {
        if($(this).hasClass("left")){
            num--;
            if(num <= 0){
                num = 20;
            }
            changBg(num);
        } else {
            num++;
            if(num >=20){
                num = 1;
            }
            changBg(num);
        }
    });

    /**********************自定义方法区*************************/
    function armControl($pwd) {
        //控制手
        $pwd.focus(function () {
            $('#owl-login').addClass('password');
        }).blur(function () {
            $('#owl-login').removeClass('password');
        });
    }

    function controlPwd_cpwd() {
        let $eye = $(".eye");
        let $password;
        $eye.mousedown(function () {
            let $me = $(this);
            $password = $me.siblings();
            $password.attr("type", "text");
            $('#owl-login').removeClass('password');
        });
        $eye.mouseup(function () {
            let $me = $(this);
            $password = $me.siblings();
            $password.attr("type", "password");
            $('#owl-login').addClass('password');

        })
    }



});

//判断对象是都全为空
function isNull(obj) {
    let flag = false;
    $.each(obj, function (key, val) {
        if(val.length === 0){
            flag = true;
            return flag;
        }
    });
    return flag;
}

//控制背景切换
function changBg(num) {
    $(".bg").css({
        background:'url(/imgs/bg/'+num+'.jpg) no-repeat',
    })
}