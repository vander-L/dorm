let adminName = document.getElementById("adminName")
let adminId = document.getElementById("adminId")
let adminTel = document.getElementById("adminTel")

$.ajax({
    url: '/adminData',
    async: false,
    dataType: 'json',
    type: 'get',
    success: function (data){
        adminName.innerHTML = data.name
        adminId.innerHTML = data.id
        adminTel.innerHTML = data.phone
    }
})

console.log(adminName.innerHTML)
console.log(adminId.innerHTML)
console.log(adminTel.innerHTML)

let logout = function (){
    alert("注销成功！")
    $("#logout-form").submit()
    return false
}