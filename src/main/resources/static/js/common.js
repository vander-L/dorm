let stuName = document.getElementById("stuName")
let stuId = document.getElementById("stuId")
let stuCla = document.getElementById("stuCla")
let stuDept = document.getElementById("stuDept")

$.ajax({
    url: '/stuData',
    async: false,
    dataType: 'json',
    type: 'get',
    success: function (data){
        stuName.innerHTML = data.name
        stuId.innerHTML = data.id
        stuCla.innerHTML = data.cla
        stuDept.innerHTML = data.dept
    }
})

let logout = function (){
    alert("注销成功！")
    $("#logout-form").submit()
    return false
}