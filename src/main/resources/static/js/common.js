$(function () {
    //点赞
    $(".img-good").click(function () {
        $(".img-bad").removeClass("active");
        $(".img-bad").find("span").removeClass("active");
        if($(this).hasClass("active")){
            $(this).toggleClass("active");
            $(this).find("span").removeClass("active");
        } else {
            $(this).find("span").toggleClass("active");
            $(this).toggleClass("active");
        }
    });

    //取消赞
    $(".img-bad").click(function () {
        $(".img-good").removeClass("active");
        $(".img-good").find("span").removeClass("active");
        if($(this).hasClass("active")){
            $(this).toggleClass("active");
            $(this).find("span").removeClass("active");
        } else {
            $(this).find("span").toggleClass("active");
            $(this).toggleClass("active");
        }
    })

    //喜欢
    $(".img-like").click(function () {
        $(this).toggleClass("active");
    })
    //快速点赞喜欢
    $(document).on("click", ".good, .like", function () {
        $(this).toggleClass("active");
    })

    //图片点击出现框
    $(document).on("click", ".pic img", function () {
        let src = $(this).attr("src");
        $(".img-clicked").find(".img-content img").attr("src", src);
        $(".img-clicked").css("animation","in 0.5s forwards ease-in-out");
    });
    $(".click-close").click(function () {
        $(".img-clicked").css("animation","out 0.5s forwards ease-in-out");
    });
});