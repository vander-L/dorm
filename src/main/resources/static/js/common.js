let stuName = document.getElementById("stuName")
let stuId = document.getElementById("stuId")
let stuCla = document.getElementById("stuCla")
let stuDept = document.getElementById("stuDept")
let stuBuilding = document.getElementById("stuBuilding")
let stuDorm = document.getElementById("stuDorm")

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
        stuBuilding.innerHTML = data.building
        stuDorm.innerHTML = data.dorm
    }
})

let logout = function (){
    alert("注销成功！")
    $("#logout-form").submit()
    return false
}