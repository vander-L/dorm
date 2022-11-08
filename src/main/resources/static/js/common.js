let stuName = document.getElementById("stuName")
let stuId = document.getElementById("stuId")
let stuCla = document.getElementById("stuCla")
let stuDept = document.getElementById("stuDept")

stuName.innerHTML = sessionStorage.getItem("name")
stuId.innerHTML = sessionStorage.getItem("id")
stuCla.innerHTML = sessionStorage.getItem("cla")
stuDept.innerHTML = sessionStorage.getItem("dept")

console.log(stuName.innerHTML)