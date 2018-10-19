$(function () {

    //图片点击出现框
    $(document).on("click", ".pic", function () {
       $(".img-clicked").css("animation","in 0.5s forwards ease-in-out");
    });
    $(".click-close").click(function () {
        $(".img-clicked").css("animation","out 0.5s forwards ease-in-out");
    });

    let count = 1;
    $(window).scroll(function () {
        //瀑布流
        if (Math.round($(window).scrollTop()) === Math.round($(document).height() - $(window).height())) {
            // console.log(1);
            count ++;
            //传值模板
            // $.post("url", {
            //     pagenum:count,
            //     pagSize:20
            // }, function (data) {
            //     $.each(piclist, function (index, item) {
            //         let img = `<div class="box">
            //         <div class="pic">
            //             <img src="/imgs/${item.src}" alt="">
            //             <div class="img-control">
            //                 <span class="user-name">${item.name}</span>
            //                 <span style="margin-top: 3px;">
            //                     <i class="glyphicon glyphicon-thumbs-up good"></i>
            //                     <i class="glyphicon glyphicon-heart like"></i>
            //                 </span>
            //             </div>
            //     </div>`;
            //         $("#new .pictures").append(str);
            //     })
            // })
            let str = $(`
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img03.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                </div>
                    </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img04.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img05.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img06.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img07.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img08.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img09.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img10.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img01.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <div class="box">
                    <div class="pic">
                        <img src="/imgs/img02.jpg" alt="">
                        <div class="img-control">
                            <span class="user-name">SBlh</span>
                            <span style="margin-top: 3px;">
                                <i class="glyphicon glyphicon-thumbs-up good"></i>
                                <i class="glyphicon glyphicon-heart like"></i>
                            </span>
                        </div>
                    </div>
                </div>            
`)

            $("#new .pictures").append(str);

        }

        //控制导航条颜色
        if($(window).scrollTop() > 150){
            $(".navbar-default.my-nav").css("backgroundColor","#222");
            $(".navbar-default.my-nav .navbar-header").css("opacity","1");
            $(".navbar-default .search-form").css("opacity","1");
        } else {
            $(".navbar-default.my-nav").css("backgroundColor","transparent");
            $(".navbar-default.my-nav .navbar-header").css("opacity","0");
            $(".navbar-default .search-form").css("opacity","0");
        }
    });
});


