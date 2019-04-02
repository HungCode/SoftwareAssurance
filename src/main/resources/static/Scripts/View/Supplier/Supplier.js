
$(document).ready(function () {
    // load dữ liệu:
    customerJs.loadData();
})


class CustomerJS {
    constructor(name) {
        this.Address = name;
    }
    loadData() {
        //Gọi lên Service lấy dữ liệu:
        $.ajax({
            url: "/customers",
            method: "GET",
            success: function (response) {
                if (response.length > 0) {
                    $.each(response, function (index, item) {
                        var fields = $('div [fieldData]');
                        var rowHTML = '<div></div>';
                        //var currentRowIndex = index + 1;
                        //var rowClass = "";
                        //if (currentRowIndex % 2 == 0) {
                        //    rowClass = "row-even";
                        //    rowHTML = '<tr class="' + rowClass + '"></tr>';
                        //}
                        debugger;
                        $.each(fields, function (index, field) {
                            var fieldName = $(field).attr('fieldData');
                            var value = item[fieldName] ? item[fieldName] : "";
                            rowHTML = $(rowHTML).append('<div>' + value + '</div>');
                        })

                        $('div').append(rowHTML);
                    })
                }
            },
            fail: function () {

            },
            error: function () {

            }
        })
    }
    add() {

    }
    delete() {

    }
}

var customerJs = new CustomerJS();

