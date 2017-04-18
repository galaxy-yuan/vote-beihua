/**
 * Created by 安哥 on 2017/4/13.
 */
//document.oncontextmenu = function(e) { return false; }//防止右击弹出菜单
$(document).ready(function () {
    var datas=null;
    
$("#add-key").click(function(){
    $("#add-key").createModal({
        background: "#000",//设定弹窗之后的覆盖层的颜色
        width: "800px",//设定弹窗的宽度
        height: "500px",//设定弹窗的高度
        resizable: true,//设定弹窗是否可以拖动改变大小
        html: " <div class='mgr-data-add' id='mgr-add'>"
       +"<form id='mgr-form-add' class='mgr-form-add'>"
        +"<label>账号：</label> <input class='mgr-form-input' id='mgr-form-account' type='text' /><BR>"
        +"<label>密码：</label> <input class='mgr-form-input' id='mgr-form-pwd' type='text'   /><BR>"
        +"<label>是否可用：</label>"
    +"<select id='mgr-select'>"
        +"<option>"+ datas+ "</option>" +
        "<option>sss</option>"
        +"</select><br>"
        +"</form>"

        +"<div>"
        +"<input type='submit' class='mgr-form-submit' name='确认' onclick=''>"
        +"<input type='button' class='mgr-form-button'  value='取消' onclick=''>"

        +"</div>"
        +"</div> ",
        addFunction:function () {
         $("mgr-add").click(function () {
             $.ajax({
                 type:"get",
                 url:"get.do",
                 dataType:json,
                 success:function (data) {
                    datas=data;
                 }

             })


         })

        }
    });
});

});