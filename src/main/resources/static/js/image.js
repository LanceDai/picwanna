$(function () {
    $(window).scroll(function () {
        //瀑布流
        if (Math.round($(window).scrollTop()) >= Math.round($(document).height() - ($(window).height()+10))) {
            let str = $(`
                <div class="box">
                <div class="pic">
                        <img src="imgs/img03.jpg" alt="">
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
                        <img src="imgs/img04.jpg" alt="">
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
                        <img src="imgs/img05.jpg" alt="">
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
                        <img src="imgs/img06.jpg" alt="">
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
                        <img src="imgs/img07.jpg" alt="">
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
                        <img src="imgs/img08.jpg" alt="">
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
                        <img src="imgs/img09.jpg" alt="">
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
                        <img src="imgs/img10.jpg" alt="">
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
                        <img src="imgs/img01.jpg" alt="">
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
                        <img src="imgs/img02.jpg" alt="">
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

            $(".tab-pane.active .pictures").append(str);

        }
    });
})