
$(document).ready(function () {
    $('#btn-add').click( $("#form-modal").show());
    //Gọi lên Service lấy dữ liệu:
    $.ajax({
        url: "/getList",
        method: "GET",
        success: function (response) {
            if (response.length > 0) {
                $.each(response, function (index, item) {
                    var rowHTML = $('<div class="grid-data-row"></div>');
                    var fields = $('.grid-header-cell .grid-title');
                    $.each(fields, function (index, field) {
                        var fieldName = $(field).attr('fieldData');
                        var value = item[fieldName] ? item[fieldName]:"";
                        //var row = $(rowHTML);
                        rowHTML = rowHTML.append('<div class="grid-col-' + (index + 1) + '"><div class="data-text">'
                            + value + '</div></div>');
                    })
                    $('.supplier-drg .grid-content').append(rowHTML);
                });
                // console.log(response);
            }
        },
        fail: function () {

        },
        error: function () {

        }
    });
    // supplierJs.loadData();
})

// class Supplier {
//     constructor(name) {
//         this.Address = name;
//     }
//
//     add() {
//
//     }
//     delete() {
//
//     }
// }
//
// var SupplierJs = new Supplier();

