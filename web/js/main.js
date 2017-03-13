
var app={
		setConfig:false//true 为有点击过设置，默认没有
		
};
var LocalStorageUtility = {
		setItemInLS :function(key, value) {
			window.localStorage.setItem(key, value);
	    },
	    getItemInLS :function(key) {
	        return window.localStorage.getItem(key) ;
	    },
	    removeItemInLS :function(key) {
	        window.localStorage.removeItem(key) ;
	    }
};
function getLocalStorageObj(){
	return LocalStorageUtility;
}
getLocalStorageObj().setItemInLS("servicePath", "http://60.191.13.120:8081/HousingService/api/");//服务器
//隐藏加载器  
//$.mobile.loading('hide'); 

//$.mobile.ajaxEnabled=false;
//删除对象数组中指定对象[删除对象obj,根据对象主键obj_pkId]
Array.prototype.removeArrayObj=function(obj_pkfiled,obj_pkId){
    var newArr=this.concat();
    for(var i=0;i<newArr.length;i++) {
        if(newArr[i][obj_pkfiled]==obj_pkId)newArr.splice(i,1);
    }
    return newArr;
};
//判断是否有重复
Array.prototype.isRepeat = function(pk_Id,pk_val){
	var flag = false;
	var newArr=this.concat();
    for(var i=0;i<newArr.length;i++) {
        if(newArr[i][pk_Id]==pk_val){
        	flag = true;
        	break;
        }
    }
    return flag;
};
//删除对象数组中重复对象[数组对象唯一][根据obj_pkId判别]
Array.prototype.ArrayObjUnique=function(obj_pkId){
    var newArr=this.concat();
    for(var i=0;i<newArr.length;i++) {
        for(var j=i+1;j<newArr.length;j++) {
            if(newArr[i][obj_pkId]==newArr[j][obj_pkId]) {
                newArr.splice(j,1);
                j--;
            }
        }
    }
    return newArr;
};
//value 为long类型的数据
Date.prototype.DateGridFormat = function(value){
	if(value=='' || value==null)return '';
    var date = new Date(value);
    var year = date.getFullYear();
    var _month=date.getMonth()+1;
    var month = _month<10?('0'+_month):_month;
    var time = date.getDate()<10?('0'+date.getDate()):date.getDate();
    var hours = date.getHours()<10?('0'+date.getHours()):date.getHours();
    var minutes=date.getMinutes()<10?('0'+date.getMinutes()):date.getMinutes();
    var seconds= date.getSeconds()<10?('0'+date.getSeconds()):date.getSeconds();
    return year+'-'+month+'-'+time+' '+hours+':'+minutes+':'+seconds;
};
//项目路劲
function getRootPath(){  
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp  
    var curWwwPath=window.document.location.href;  
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp  
    var pathName=window.document.location.pathname;  
    var pos=curWwwPath.indexOf(pathName);  
    //获取主机地址，如： http://localhost:8083  
    var localhostPaht=curWwwPath.substring(0,pos);  
    //获取带"/"的项目名，如：/uimcardprj  
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);  
    return(localhostPaht+projectName);  
}

$(document).on("mobileinit",function() {

	//按钮按下/划过的状态感觉反应有些迟缓
	$.mobile.buttonMarkup.hoverDelay = "false";
	$.mobile.loader.prototype.options.html='<img src="../../img/iconLoading.gif" >';
	
//	document.addEventListener("backbutton",onBackKeyDown,false);   
//	//BackButton按钮  
//	function onBackKeyDown(){  
//		alert("a");
////	    if($.mobile.activePage.is('#homepage')){  
//	        navigator.app.exitApp();  
////	    }  
////	    else {  
////	        navigator.app.backHistory();  
////	    }  
//	}
});


//显示加载器  
function showLoader() {  
    //显示加载器
	//$("#index_body").jqLoading({backgroundImage:getRootPath()+"/img/iconLoading.gif"});
    $.mobile.loading('show', {  
        text: '加载中...', //加载器中显示的文字  
        textVisible: false, //是否显示文字  
        theme: 'e',        //加载器主题样式a-e  
        textonly: false,   //是否只显示文字  
        html: '<img src="../../img/iconLoading.gif" >'//要显示的html内容，如图片等  
    }); 
}
//隐藏加载器
function hideLoader(){  
    //隐藏加载器  
	//$("#index_body").jqLoading("destroy");
    $.mobile.loading('hide');  
}
//添加数据加载器
function addDataLoader(domId){
	delDataLoader();
	var div = "<div id='get_moreId' class='get_more'></div>";
	if(domId instanceof jQuery){
		$(div).appendTo(domId);
	}else{
		$(div).appendTo($("#"+domId));
	}
}
//删除数据加载器
function delDataLoader(){
	 $("#get_moreId").remove();
	 $("#no_moredataId").remove();
}
function noMoreData(domId){
	var div = '<div id="no_moredataId" class="nomoredata">没有更多数据了</div>';
	if(domId instanceof jQuery){
		$(div).appendTo(domId);
	}else{
		$(div).appendTo($("#"+domId));
	}
}
//格式化
function getTypeNameStr(typeId){
	var typeNameStr = "";
	if(typeId==1){
		typeNameStr = "产权登记";
	}else if(typeId==2){
		typeNameStr = "住房保障";
	}else if(typeId==3){
		typeNameStr = "维修中心";
	}
	else if(typeId==4){
		typeNameStr = "查档地址";
	}
	return typeNameStr;
}
//获取值
function getObjctValue(objVal){
	var objeValStr = "";
	if(objVal!="" && objVal!=null){
		objeValStr = objVal;
	}
	return objeValStr;
}
//获取联系电话方式，如果有则为tel:***,否则为：#
function getTelAHref(telNum){
	var aHrefTelNum = "#";
	if(telNum!=null && telNum!=""){
		aHrefTelNum = "tel:"+telNum;
	}
	return aHrefTelNum;
}
//1:首页，2：搜索，3：民政互动，4：设置
function openToPage(pageNo){
	if(pageNo==1){
//		$.mobile.page.prototype.options.domCache=false;
		$.mobile.changePage("../../page/convenience/new_index.html","pop");
		app.setConfig=false;
//		$('div[data-role=page]:hidden').remove();
	}else if(pageNo==2){
		$.mobile.changePage("../../page/information/Notice.html","pop");
		app.setConfig=false;
	}else if(pageNo==3){
		$.mobile.changePage("../../page/convenience/Service.html","pop");
		app.setConfig=false;
	}else if(pageNo==4){
		$.mobile.changePage("../../page/login/loginIndex.html","pop");
		app.setConfig=false;
	}else if(pageNo==5){
		$.mobile.changePage("../../page/masatami/Interactivity.html","pop");
		app.setConfig=true;
	}else if(pageNo==6){
		$.mobile.changePage("../../page/convenience/Termites_Content.html","pop");
		app.setConfig=false;
	}
	//setLoginNavigationBar();
}
//用户登录成功后，登录导航栏自动设置为我的
/*function setLoginNavigationBar(aId){
	var userInfo = JSON.parse(getLocalStorageObj().getItemInLS("userInfo"));
	var children = $("#"+aId).children();
	if(userInfo){
		if($("#"+aId).attr("href")=="javascript:openToPage(6)")return;
		$("#"+aId).attr("href","javascript:openToPage(6)");
		//$("#"+aId).html('我的<div class="footer_placeicons_setting"></div>');
		alert($(children[0]).html());
		$(children[0]).html("我的");
		$(children[1]).attr("class","footer_placeicons_setting");
	}else{
		if($("#"+aId).attr("href")=="javascript:openToPage(4)")return;
		$("#"+aId).attr("href","javascript:openToPage(4)");
		//$("#"+aId).html('登录<div class="footer_placeicons_setting"></div>');
		$(children[0]).html("登录");
		$(children[1]).attr("class","footer_placeicons_setting");
	}
}*/
// 判断是否为空
function isEmpty(val){
	if(val == null || val == ''){
		return true;
	} else{
		return false;
	}
}

/**
* jQueryMobile 弹出提示框
* @param text：提示内容
* @param callback:点击确定要执行的函数
*/
function confirmJQM(text, callback) {
	var popupDialogId = 'popupDialogC';
	$('<div data-role="popup" id="' + popupDialogId + '" data-confirmed="no" data-position-to="window" data-transition="pop" data-theme="b" data-dismissible="false" style="max-width:500px;">'+ 
	'<div role="main" class="ui-content" style="text-align: center;">'+ 
	'<h3 class="ui-title">' + text + '</h3>'+ 
	'<p></p>'+
	'<a data-role="button" data-theme="b" class="optionCancel" data-mini="true" data-inline="true" onclick="$(\'#popupDialogC\').popup(\'close\');" >取消</a>'+ 
	'<a data-role="button" data-theme="b" class="optionConfirm" data-transition="flow" data-inline="true" data-mini="true">确定</a>'+ 
	'</div>'+ 
	'</div>').appendTo($.mobile.pageContainer); 
	var popupDialogObj = $('#' + popupDialogId); 
	popupDialogObj.trigger('create'); //动态加载时 需要重新刷新下 也就是给popup赋上jqm对应的css
	//初始化popup
	popupDialogObj.popup({
		//关闭时 绑定的事件
		afterclose: function (event, ui) { 
			popupDialogObj.find(".optionConfirm").first().off('click'); //关闭时 需要清除确定按钮上 绑定的事件
			$(event.target).remove();//删除 创建的 popup
		},
		//显示时 绑定的事件
		afteropen: function (event, ui) {
			popupDialogObj.find(".optionConfirm").first().on('click', function () { 
				popupDialogObj.attr('data-confirmed', 'no'); 
				$('#popupDialogC').popup('close');
				if(callback && callback instanceof Function ){
					callback();
				}
			});
		} 
	}); 
	//打开
	popupDialogObj.popup('open'); 
}
/**
* jQueryMobile 弹出提示框
* @param text：提示内容
* @param callback:点击确定要执行的函数
*/
function dialogJQM(text) {
	var dialogId = 'dialogC';
	$('<div data-role="popup" id="' + dialogId + '" data-confirmed="no"   data-position-to="window" data-transition="pop" data-theme="b" data-dismissible="false" style="max-width:500px;">'+ 
			'<div role="main" class="ui-content" style="text-align: center;">'+ 
			'<div class="ui-title">' + text + '</div>'+ 
			'<p></p>'+
			'<a data-role="button" data-theme="b" class="optionCancel" data-mini="true" data-inline="true">关闭</a>'+
			'</div>'+ 
			'</div>').appendTo($.mobile.pageContainer); 
	var dialogObj = $('#'+dialogId);
	dialogObj.trigger('create'); //动态加载时 需要重新刷新下 也就是给popup赋上jqm对应的css
	//初始化popup
	dialogObj.popup({
		//关闭时 绑定的事件
		afterclose: function (event, ui) {	
			//关闭时 需要清除确定按钮上 绑定的事件
			$(".optionCancel").off('click');
			$(event.target).remove();//删除 创建的 popup
		},
		//显示时 绑定的事件
		afteropen: function (event, ui) {
			$(".optionCancel").on("click",function(){
				$('#popupDialogC').popup('close');
				$(event.target).remove();
			})
//			alert("b");
//			popupDialogObj.find(".optionConfirm").first().on('click', function () { 
//				popupDialogObj.attr('data-confirmed', 'no'); 
//				$('#popupDialogC').popup('close');
//				if(callback && callback instanceof Function ){
//					callback();
//				}
//			});
			
//			$('#dialogC').popup('close');
//			popupDialogObj.find(".optionConfirm").first().on('click', function () { 
//				popupDialogObj.attr('data-confirmed', 'no'); 
//				$('#popupDialogC').popup('close');
//				if(callback && callback instanceof Function ){
//					callback();
//				}
//			});
		} 
	}); 
	//打开
	dialogObj.popup('open'); 
}