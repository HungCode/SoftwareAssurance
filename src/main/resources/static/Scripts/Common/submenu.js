// hàm xử  lý ẩn hiện submenu
// create by: vvthuy 2/1/2019
$(document).ready(function () {
    $("#menu-item-dictionary").click(function () {
        $("#option-menu").toggle();
    });
});
// hàm ẩn phần submenu khi không click vào nó 
// create by : vvthuy 2/1/2018
$(document).mouseup(function (e) {
    //debugger;
    var container = $('#option-menu');
    var container1 = $('#menu-item-dictionary');
    // khi không nhấp chuột vào nó thì sẽ mất submenu hiện tại
    if (!container1.is(e.target) && container1.has(e.target).length === 0) {
        container.hide();
    }
});

/// ẩn hiện menu  
//create by: vvthuy 3/1/2019
$(document).ready(function () {
    var c = 0;
    $('#icon-menu').click(function () {
        if (c === 0) {
            $('.main-nav').hide();
            $(".content").removeAttr("style");
            $(".content").attr("style", "left:0px");
            c = 1;
        }
        else {
            $('.main-nav').show();
            $(".content").removeAttr("style");
            $(".content").attr("style", "left:230px");
            c = 0;
        }
    });
});
// show hide phần header
// create by: vvthuy 4/1/2019
$(document).ready(function () {
    $("#combobox-chain-restaurant").click(function () {
        //debugger;
        $(".chain-restaurant").toggle()
    });
});
$(document).ready(function () {
    $("#combobox-languge").click(function () {
        //debugger;
        $(".language").toggle()
    });
})
$(document).ready(function () {
    $("#combobox-property").click(function () {
        //debugger;
        $(".property-admin").toggle()
    });
});

// hàm ẩn phần header combobox các chi nhánh nhà hàng khi không dùng đến
// create by: vvthuy 4/1/2019
$(document).mouseup(function (e) {
    //debugger;
    var container = $('.chain-restaurant');
    var container1 = $('#combobox-chain-restaurant');

    // khi không nhấp chuột vào nó thì sẽ mất submenu hiện tại
    if (!container1.is(e.target) && container1.has(e.target).length === 0) {
        container.hide();
    }
});

// hàm ẩn phần header combobox lựa chọn ngôn ngữ khi không dùng đến
// create by: vvthuy 4/1/2019
$(document).mouseup(function (e) {
    //debugger;
    var container = $('.language');
    var container1 = $('#combobox-languge');
    // khi không nhấp chuột vào nó thì sẽ mất submenu hiện tại
    if (!container1.is(e.target) && container1.has(e.target).length === 0) {
        container.hide();
    }
});

// hàm ẩn phần header combobox property người dùng khi không dùng đến
// create by: vvthuy 4/1/2019
$(document).mouseup(function (e) {
    //debugger;
    var container = $('.property-admin');
    var container1 = $('#combobox-property');
    // khi không nhấp chuột vào nó thì sẽ mất submenu hiện tại
    if (!container1.is(e.target) && container1.has(e.target).length === 0) {
        container.hide();
    }
});
