$(document).ready(function () {
    //Thay đổi màu sắc
    $(".change-color").click(mainScreen.changeColorItemMenu);
    //Ẩn hiện menu con báo cáo
    $(".show-menu-report").click(mainScreen.showHideMenuReport);
    //Ẩn hiện menu con trợ giúp
    $(".show-menu-help").click(mainScreen.showHideMenuHelp);
    //Ẩn menu con khi click ngoài
    $(".click-show-hide").click(mainScreen.hideAllMenu);
});
//Các sự kiện trên màn hình chính
var mainScreen = {
    /*
     * Thay đổi màu của menu khi click vào
     * Created by: VVDung 14/12/2018
     */

    changeColorItemMenu: function () {
        $(".menu-parent").find(".change-color").removeClass("add-remove-color");
        $(this).addClass("add-remove-color");
    },
    /*
     * Ẩn hiện menu report và click vào thì ẩn menu help nếu help đang mở
     * Created by: VVDung 18/12/2018
     */
    showHideMenuReport: function () {
        $(".menu-children-help").hide();
        $(".menu-children-report").slideToggle();
        $(".menu-has-children-help").find(".icon-dropdown-submenu").removeClass("icon-dropup-submenu");
        $(".menu-has-children-report").find(".icon-dropdown-submenu").toggleClass("icon-dropup-submenu");
    },
    /*
     * Ẩn hiện menu help và click vào thì ẩn report nếu report đang mở
     * Created by: VVDung 18/12/2018
     */
    showHideMenuHelp: function () {
        $(".menu-children-report").hide();
        $(".menu-children-help").slideToggle();
        $(".menu-has-children-report").find(".icon-dropdown-submenu").removeClass("icon-dropup-submenu");
        $(".menu-has-children-help").find(".icon-dropdown-submenu").toggleClass("icon-dropup-submenu");
    },
    /*
     * Ẩn menu con khi click ngoài
     * Created by: VVDung 18/12/2018
     */
    hideAllMenu: function () {
        $(".menu-parent").find(".icon-dropdown-submenu").removeClass("icon-dropup-submenu");
        $(".menu-children-report").hide();
        $(".menu-children-help").hide();
    }
};
