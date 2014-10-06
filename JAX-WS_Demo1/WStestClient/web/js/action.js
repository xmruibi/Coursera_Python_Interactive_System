$(document).ready(function() {
var form = $('#form1');
form.submit(function () {

    $.post({
        type: "post",
        url: "UserServlet",
        data: value,
        success: function (data) {
            var result = data;
            $('#login').html(result);
        }
    });
    return false;
});
})
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


