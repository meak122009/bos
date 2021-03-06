<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理定区/调度排班</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
/*表单数据抽取成json格式  */
$.fn.serializeJson=function(){  
    var serializeObj={};  
    var array=this.serializeArray();  
    var str=this.serialize();  
    $(array).each(function(){  
        if(serializeObj[this.name]){  
            if($.isArray(serializeObj[this.name])){  
                serializeObj[this.name].push(this.value);  
            }else{  
                serializeObj[this.name]=[serializeObj[this.name],this.value];  
            }  
        }else{  
            serializeObj[this.name]=this.value;   
        }  
    });  
    return serializeObj;  
}; 
	function doAdd(){
		$('#addDecidedzoneWindow').window("open");
		
	}
	
	function doEdit(){
		 var arr=$("#tb").datagrid("getSelections");
		 if(arr.length==1){
			 var rowData=arr[0];
				$("#addDecidedzoneWindow").window("open");
				$("#addDecidedzoneForm").form("load",rowData);
				$("#hiddenId").val(rowData.id);//用于定区编码检验使用
				//负责人
				$('#staff').combobox('setValue',rowData.staff.id); 
				$('#staff').combobox('setText',rowData.staff.name);
				//分区数据选择
				$("#subareaGrid").datagrid("load",{"hiddenId":rowData.id});
				$("#subareaGrid").datagrid({
					//数据获取成功触发事件
					onLoadSuccess:function(data){
						var rows=data.rows;
						for( var i in rows){
							var index=$("#subareaGrid").datagrid("getRowIndex",rows[i]);
							if(rows[i].did==rowData.id){
								$("#subareaGrid").datagrid("checkRow",index);
							}
						}
					}
				});
		 }else{
			 $.messager.alert("警告！","请选择一行修改","warning");
		 }

	}
	
	function doDelete(){
		 var arr=$("#tb").datagrid("getSelections");
		 if(arr==null||arr.length==0){
				$.messager.alert("警告！","请至少选择一行","warning");
				return;
			}
			var arrIds=new Array();
			for(var i=0;i<arr.length;i++){
				arrIds.push(arr[i].id);
			}
			var ids=arrIds.join(",");
			$.post("${pageContext.request.contextPath}/decidedAction_delete",{"ids":ids},function(data){
				if(data){
					$.messager.alert("信息","恭喜您，数据删除成功","info");
					$("#tb").datagrid("reload");//数据重新加载，但选中的数据无法清除
					$("#tb").datagrid("clearChecked");//清除之前选中的行
				}else{
					$.messager.alert("警告！","数据删除失败，系统维护中。。。","warning");
				}
			});
	}
	
	function doSearch(){
		$('#searchWindow').window("open");
	}
	
	function doAssociations(){
		 var arr=$("#tb").datagrid("getSelections");
		 if(arr.length==1){
			 var rowData=arr[0];
			$("#associationSelect").empty();
			$("#noassociationSelect").empty();//清空缓冲
			$('#customerWindow').window('open');
			$("#customerDecidedZoneId").val(rowData.id);//设置隐藏域定区id
			$.post("${pageContext.request.contextPath }/decidedzoneAction_getAssociationCustomersByDecided",{"id":rowData.id},function(data){
				$(data).each(function(){
					$("#associationSelect").append("<option value='"+this.id+"'>"+this.name+"</option>");
				});
			});
			$.post("${pageContext.request.contextPath }/decidedzoneAction_getNoAssociationCustomers",function(data){
				$(data).each(function(){
					$("#noassociationSelect").append("<option value='"+this.id+"'>"+this.name+"</option>");
				});
			});
			
		 }else{
			 $.messager.alert("警告！","请选择一行修改","warning");
		 }
		
		
	}
	
	//工具栏
	var toolbar = [ {id : 'button-search',	text : '查询',iconCls : 'icon-search',handler : doSearch},
	                {id : 'button-add',text : '增加',iconCls : 'icon-add',handler : doAdd},
	                {id : 'button-edit',	text : '修改',iconCls : 'icon-edit',handler : doEdit},
	                {id : 'button-delete',text : '删除',iconCls : 'icon-cancel',handler : doDelete},
	                {id : 'button-association',text : '关联客户',iconCls : 'icon-sum',handler : doAssociations}];
	// 定义列
	var columns = [ [ {field : 'id',title : '定区编号',width : 180,align : 'center' ,checkbox:true},
	                  {field : 'name',title : '定区名称',width : 180,align : 'center'},
	                  {field : 'staff.name',title : '负责人',width : 180,align : 'center',
		formatter : function(data,row ,index){
			if(row.staff!=null){
			return row.staff.name;		
			}
		}
	}, {
		field : 'staff.telephone',
		title : '联系电话',
		width : 180,
		align : 'center',
		formatter : function(data,row ,index){
			if(row.staff!=null){
				return row.staff.telephone;
				}
		}
	}, {
		field : 'staff.station',
		title : '所属公司',
		width : 180,
		align : 'center',
		formatter : function(data,row ,index){
			if(row.staff!=null){
				return row.staff.station;
				}
		}
	} ] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 定区数据表格
		$('#tb').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			pageList: [3,5,10],
			pagination : true,
			toolbar : toolbar,
			url : "${pageContext.request.contextPath }/decidedzoneAction_pageQuery",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow
		});
		
		// 添加、修改定区
		$('#addDecidedzoneWindow').window({
	        title: '添加修改定区',
	        width: 600,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		
		// 查询定区
		$('#searchWindow').window({
	        title: '查询定区',
	        width: 400,
	        modal: true,
	        shadow: true,
	        closed: true,
	        height: 400,
	        resizable:false
	    });
		//条件查询
		$("#btn").click(function(){
			var predicate=$("#queryDecidedzoneForm").serializeJson();
			$("#tb").datagrid("load",predicate);
			$('#searchWindow').window("close");
		});
		
	});
	//双击事件
	function doDblClickRow(rowIndex,rowData){
		$('#association_subarea').datagrid( {
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			url : "${pageContext.request.contextPath }/subareaAction_relationalSubarea?decidedzone.id="+rowData.id,
			columns : [ [{field : 'sid',title : '分拣编号',width : 120,align : 'center'},
			             {field : 'province',title : '省',width : 120,align : 'center',
										formatter : function(data,row ,index){
											return row.region.province;
										}},
					{field : 'city',title : '市',width : 120,align : 'center',
										formatter : function(data,row ,index){
											return row.region.city;
										}}, 
					{field : 'district',title : '区',width : 120,align : 'center',
										formatter : function(data,row ,index){
											return row.region.district;
										}},
				{field : 'addresskey',title : '关键字',width : 120,align : 'center'},
				{field : 'startnum',title : '起始号',width : 100,align : 'center'},
				{field : 'endnum',title : '终止号',width : 100,align : 'center'} ,
				{field : 'single',title : '单双号',width : 100,align : 'center'} ,
				{field : 'position',title : '位置',width : 200,align : 'center'
			} ] ]
		});
		$('#association_customer').datagrid( {
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			url : "${pageContext.request.contextPath }/decidedzoneAction_getAssociationCustomersByDecided?id="+rowData.id,
			columns : [[{
				field : 'id',
				title : '客户编号',
				width : 180,
				align : 'center'
			},{
				field : 'name',
				title : '客户名称',
				width : 180,
				align : 'center'
			},{
				field : 'telephone',
				title : '客户电话',
				width : 180,
				align : 'center'
			}, {
				field : 'address',
				title : '客户地址',
				width : 180,
				align : 'center'
			},{
				field : 'station',
				title : '所属单位',
				width : 180,
				align : 'center'
			}]]
		});		
	};
	$(function(){
		//添加保存
		$("#save").click(function(){
			var flag=$("#addDecidedzoneForm").form("validate");
			if(flag){
				$("#addDecidedzoneForm").submit();
				$("#addDecidedzoneWindow").window("close");
			}
		});
		$("#toRight").click(function(){
			$("#associationSelect").append($("#noassociationSelect option:selected"));
		});
		$("#toLeft").click(function(){
			$("#noassociationSelect").append($("#associationSelect option:selected"));
		});
		$("#associationBtn").click(function(){
			$("#associationSelect option").attr("selected","selected");
			$("#customerForm").submit();
		});
		
	});
	//定区编码检验
$.extend($.fn.validatebox.defaults.rules, { 
		uniDecidedzoneId: { 
			validator: function(value, param){ 
				var hiddenId=$("#hiddenId").val();
				var flag;
				if(value==hiddenId){//窗体关闭时必须清空
					return true;
				}
				$.ajax({
					url:"${pageContext.request.contextPath }/decidedzoneAction_checkdecidedzoneId",
					type:"POST",
					async:false,
					data:"id="+value+"&hiddenId="+hiddenId,
					success:function(data){
						//如果能查找到，返回true,不能查找到返回false
						if(data){
							flag=false;						
						}else{
							flag=true;
						}
					}			
				});
				return flag;
			}, 
			message: '定区编号已存在' 
		}
	}); 
function closeClear(){//窗体关闭时清空
	//$("#addDecidedzoneForm").form("clear");
	$("#addDecidedzoneForm")[0].reset();//并不能把隐藏域数据清空
	$("#hiddenId").val("");
	$("#subareaGrid").datagrid("load",{"hiddenId":""});
}
</script>	
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="tb"></table>
	</div>
	<div region="south" border="false" style="height:150px">
		<div id="tabs" fit="true" class="easyui-tabs">
			<div title="关联分区" id="subArea"
				style="width:100%;height:100%;overflow:hidden">
				<table id="association_subarea"></table>
			</div>	
			<div title="关联客户" id="customers"
				style="width:100%;height:100%;overflow:hidden">
				<table id="association_customer"></table>
			</div>	
		</div>
	</div>
	
	<!-- 添加 定区 -->
	<div class="easyui-window" title="定区添加修改" id="addDecidedzoneWindow"  data-options="onBeforeClose:closeClear"
	 collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="height:31px;overflow:hidden;" split="false" border="false" >
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton" plain="true" >保存</a>
			</div>
		</div>
		
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="addDecidedzoneForm" method="post" action="${pageContext.request.contextPath }/decidedzoneAction_save">
				<input type="hidden" name="hiddenId" id="hiddenId">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">定区信息</td>
					</tr>
					<tr>
						<td>定区编码</td>
						<td><input type="text" name="id" class="easyui-validatebox" data-options="required:true,validType:'uniDecidedzoneId'"/></td>
					</tr>
					<tr>
						<td>定区名称</td>
						<td><input type="text" name="name" class="easyui-validatebox" required="true"/></td>
					</tr>
					<tr>
						<td>选择负责人</td>
						<td>
							<input class="easyui-combobox" name="staff.id"  id="staff"
    							data-options="valueField:'id',textField:'name',url:'${pageContext.request.contextPath }/staffAction_nameListInUse'" />  
						</td>
					</tr>
					<tr height="300">
						<td valign="top">关联分区</td>
						<td>
							<table id="subareaGrid"  class="easyui-datagrid" border="false" style="width:300px;height:300px"
							 data-options="url:'${pageContext.request.contextPath }/subareaAction_subareaListInAssociation',fitColumns:true,singleSelect:false">
								<thead>  
							        <tr>  
							            <th data-options="field:'did',hidden:true,width:30,checkbox:true">编号</th>  
							            <th data-options="field:'sid',width:30,checkbox:true">编号</th>  
							            <th data-options="field:'addresskey',width:150">关键字</th>  
							            <th data-options="field:'position',width:200,align:'right'">位置</th>  
							        </tr>  
							    </thead> 
							</table>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<!-- 查询定区 -->
	<div class="easyui-window" title="查询定区窗口" id="searchWindow" collapsible="false" minimizable="false" maximizable="false" style="top:20px;left:200px">
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="queryDecidedzoneForm">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="2">查询条件</td>
					</tr>
					<tr>
						<td>定区编码</td>
						<td><input type="text" name="id" /></td>
					</tr>
					<tr>
						<td>所属单位</td>
						<td><input type="text" name="staff.station"/></td>
					</tr>
					<tr>
						<td>是否关联分区</td>
						<td>
						<select name="isAssociationSubarea"  style="width:170px">
							<option value="2">--请选择--</option>
							<option value="1">是</option>
							<option value="0">否</option>
						</select>
						</td>
					</tr>
					<tr>
						<td colspan="2"><a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a> </td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
	<!-- 关联客户窗口 -->
	<div class="easyui-window" title="关联客户窗口" id="customerWindow" collapsible="false" closed="true" minimizable="false" maximizable="false" style="top:20px;left:200px;width: 400px;height: 300px;">
		<div style="overflow:auto;padding:5px;" border="false">
			<form id="customerForm" action="${pageContext.request.contextPath }/decidedzoneAction_assignedCustomerToDecidedZone" method="post">
				<table class="table-edit" width="80%" align="center">
					<tr class="title">
						<td colspan="3">关联客户</td>
					</tr>
					<tr>
						<td>
							<input type="hidden" name="id" id="customerDecidedZoneId" />
							<select id="noassociationSelect" multiple="multiple" size="10">
							</select>
						</td>
						<td>
							<input type="button" value="》》" id="toRight"><br/>
							<input type="button" value="《《" id="toLeft">
						</td>
						<td>
							<select id="associationSelect" name="customerIds" multiple="multiple" size="10">
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="3"><a id="associationBtn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">关联客户</a> </td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>