console.log("파일연결성공");
//$(document).ready(function(){
//	$("#header_wrap").load("header.html");
//});

//모달창 오픈
var modal = document.querySelector("#modal_wrap");
function init(){
	modal.classList.remove("hidden");
}
//모달창 숨기기
$(document).on("click", "#modal .content .con_btn_wrap .modal_btn, #modal .title span", function () {
	$(".reset").val('');
     modal.classList.add("hidden");
});
function loadHTML(file){
console.log("연결성공");
    var rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function ()
    {
        if(rawFile.readyState === 4)
        {
            if(rawFile.status === 200 || rawFile.status == 0)
            {
                var allText = rawFile.responseText;
                document.write(allText);
            }
        }
    }
    rawFile.send(null);
}