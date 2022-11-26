$.ajax({
    url: '/adminData',
    async: false,
    dataType: 'json',
    type: 'get',
    success: function (data){
        $("#adminName").innerHTML = data.name
        $("#adminId").innerHTML = data.id
        $("#adminTel").innerHTML = data.phone
    }
})

let logout = function (){
    alert("注销成功！")
    $("#logout-form").submit()
    return false
}