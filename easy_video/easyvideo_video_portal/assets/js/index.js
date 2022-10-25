/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

//首页响应式幻灯片调取方法
function sSwiperFun() {
    var _sWrap = $('.swiper-container');
    var mySwiper = _sWrap.swiper({
        loop: true, //无缝连接滚动
        autoplay : 5000, //自动滚动
        autoplayDisableOnInteraction : false, //设置点击后是否继续滚动
        speed:300, //滚动速度
        pagination : '.pagination', //设置分页
        paginationClickable :true //设置true分页点击执行swiper
    });
    $('.arrow-left').on('click', function(e){
        e.preventDefault();
        mySwiper.swipePrev();
      });
    $('.arrow-right').on('click', function(e){
        e.preventDefault();
        mySwiper.swipeNext();
    });

    $(".imgload").eq(0).get(0).onload=function(){
    	$(".i-slide").css("height",$(".imgload").eq(0).height());
    }

};
