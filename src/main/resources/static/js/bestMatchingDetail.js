/**
 * 인기 매칭 - 상세페이지
 */
console.log("인기 매칭 상세페이지 js 연결성공");

//매칭 문의 및 신청 모달창 오픈
var modal = document.querySelector("#modal_wrap");
function init(){
	modal.classList.remove("hidden");
}

//매칭 문의 및 신청 모달창 숨기기
$(document).on("click", "#modal .content .con_btn_wrap .modal_btn, #modal .title span", function () {
	$(".reset").val('');
     modal.classList.add("hidden");
});

//인기 매칭-트레이너 후기 사진 더보기 => 이미지리스트 모달창 오픈
var modal = document.querySelector(".moreReview");
function init(){
	modal.classList.remove("hidden");
}