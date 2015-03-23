/*建议在javascript操作时，全部使用jquery操作*/
function changeVerifyCode() {
	// 使用jquery操作标签属性
	$("#verifyimg").attr("src","verifyimg?id=" + new Date().getTime());
}