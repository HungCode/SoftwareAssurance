
class Dialog {
   
    constructor(element,title, width, height) {
        debugger;
        //if (!buttons) {
        //    buttons = this.buildButtons(scope ? scope : this);
        //}
        this.dialog = $(element).dialog({
            width: width,
            title:title,
            height: height,
            modal: true,
            close: function () {
                alert("Bạn có thật sự muốn thoát");
            }
        });
    }
    //buildButtons(scope) {
    //    var buttons = buttons = [{
    //        text: 'Lưu',
    //        icons: {
    //            primary: "ui-icon-check"
    //        },
    //        class: "djklfhsdjkfh",
    //        id: "btnSave",
    //        click: eval(scope)['btnSaveClick']
    //    }, {
    //        text: 'Đóng',
    //        icons: {
    //            primary: "ui-icon-cancel"
    //        },
    //        click: function () {
    //            $(this).dialog('close');
    //        }
    //    },
    //    {
    //        text: 'Giúp',
    //        icons: {
    //            primary: "ui-icon-cancel"
    //        },
    //        click: function () {
    //            $(this).dialog('close');
    //        }
    //    }];
    //    return buttons;
    //}
    //btnSaveClick() {
    //    alert('1');
    //}
}