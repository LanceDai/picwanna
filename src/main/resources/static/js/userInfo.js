$(function () {

    $(document).on("click", ".pic", function () {
        $(".img-clicked").css("animation","in 0.5s forwards ease-in-out");
    });
    $(".click-close").click(function () {
        $(".img-clicked").css("animation","out 0.5s forwards ease-in-out");
    });

    $(window).scroll(function () {
        if (Math.round($(window).scrollTop()) === Math.round($(document).height() - $(window).height())) {
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

            $("#my-photo .pictures").append(str);

        }
    });
});


