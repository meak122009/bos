/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2017-07-31 02:43:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.mypages.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class decidedzone_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>管理定区/调度排班</title>\r\n");
      out.write("<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\t\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*表单数据抽取成json格式  */\r\n");
      out.write("$.fn.serializeJson=function(){  \r\n");
      out.write("    var serializeObj={};  \r\n");
      out.write("    var array=this.serializeArray();  \r\n");
      out.write("    var str=this.serialize();  \r\n");
      out.write("    $(array).each(function(){  \r\n");
      out.write("        if(serializeObj[this.name]){  \r\n");
      out.write("            if($.isArray(serializeObj[this.name])){  \r\n");
      out.write("                serializeObj[this.name].push(this.value);  \r\n");
      out.write("            }else{  \r\n");
      out.write("                serializeObj[this.name]=[serializeObj[this.name],this.value];  \r\n");
      out.write("            }  \r\n");
      out.write("        }else{  \r\n");
      out.write("            serializeObj[this.name]=this.value;   \r\n");
      out.write("        }  \r\n");
      out.write("    });  \r\n");
      out.write("    return serializeObj;  \r\n");
      out.write("}; \r\n");
      out.write("\tfunction doAdd(){\r\n");
      out.write("\t\t$('#addDecidedzoneWindow').window(\"open\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doEdit(){\r\n");
      out.write("\t\t var arr=$(\"#tb\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t if(arr.length==1){\r\n");
      out.write("\t\t\t var rowData=arr[0];\r\n");
      out.write("\t\t\t\t$(\"#addDecidedzoneWindow\").window(\"open\");\r\n");
      out.write("\t\t\t\t$(\"#addDecidedzoneForm\").form(\"load\",rowData);\r\n");
      out.write("\t\t\t\t$(\"#hiddenId\").val(rowData.id);//用于定区编码检验使用\r\n");
      out.write("\t\t\t\t//负责人\r\n");
      out.write("\t\t\t\t$('#staff').combobox('setValue',rowData.staff.id); \r\n");
      out.write("\t\t\t\t$('#staff').combobox('setText',rowData.staff.name);\r\n");
      out.write("\t\t\t\t//分区数据选择\r\n");
      out.write("\t\t\t\t$(\"#subareaGrid\").datagrid(\"load\",{\"hiddenId\":rowData.id});\r\n");
      out.write("\t\t\t\t$(\"#subareaGrid\").datagrid({\r\n");
      out.write("\t\t\t\t\t//数据获取成功触发事件\r\n");
      out.write("\t\t\t\t\tonLoadSuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tvar rows=data.rows;\r\n");
      out.write("\t\t\t\t\t\tfor( var i in rows){\r\n");
      out.write("\t\t\t\t\t\t\tvar index=$(\"#subareaGrid\").datagrid(\"getRowIndex\",rows[i]);\r\n");
      out.write("\t\t\t\t\t\t\tif(rows[i].did==rowData.id){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#subareaGrid\").datagrid(\"checkRow\",index);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t $.messager.alert(\"警告！\",\"请选择一行修改\",\"warning\");\r\n");
      out.write("\t\t }\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doDelete(){\r\n");
      out.write("\t\t var arr=$(\"#tb\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t if(arr==null||arr.length==0){\r\n");
      out.write("\t\t\t\t$.messager.alert(\"警告！\",\"请至少选择一行\",\"warning\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar arrIds=new Array();\r\n");
      out.write("\t\t\tfor(var i=0;i<arr.length;i++){\r\n");
      out.write("\t\t\t\tarrIds.push(arr[i].id);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar ids=arrIds.join(\",\");\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedAction_delete\",{\"ids\":ids},function(data){\r\n");
      out.write("\t\t\t\tif(data){\r\n");
      out.write("\t\t\t\t\t$.messager.alert(\"信息\",\"恭喜您，数据删除成功\",\"info\");\r\n");
      out.write("\t\t\t\t\t$(\"#tb\").datagrid(\"reload\");//数据重新加载，但选中的数据无法清除\r\n");
      out.write("\t\t\t\t\t$(\"#tb\").datagrid(\"clearChecked\");//清除之前选中的行\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert(\"警告！\",\"数据删除失败，系统维护中。。。\",\"warning\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doSearch(){\r\n");
      out.write("\t\t$('#searchWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction doAssociations(){\r\n");
      out.write("\t\t var arr=$(\"#tb\").datagrid(\"getSelections\");\r\n");
      out.write("\t\t if(arr.length==1){\r\n");
      out.write("\t\t\t var rowData=arr[0];\r\n");
      out.write("\t\t\t$(\"#associationSelect\").empty();\r\n");
      out.write("\t\t\t$(\"#noassociationSelect\").empty();//清空缓冲\r\n");
      out.write("\t\t\t$('#customerWindow').window('open');\r\n");
      out.write("\t\t\t$(\"#customerDecidedZoneId\").val(rowData.id);//设置隐藏域定区id\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_getAssociationCustomersByDecided\",{\"id\":rowData.id},function(data){\r\n");
      out.write("\t\t\t\t$(data).each(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#associationSelect\").append(\"<option value='\"+this.id+\"'>\"+this.name+\"</option>\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_getNoAssociationCustomers\",function(data){\r\n");
      out.write("\t\t\t\t$(data).each(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#noassociationSelect\").append(\"<option value='\"+this.id+\"'>\"+this.name+\"</option>\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t $.messager.alert(\"警告！\",\"请选择一行修改\",\"warning\");\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//工具栏\r\n");
      out.write("\tvar toolbar = [ {id : 'button-search',\ttext : '查询',iconCls : 'icon-search',handler : doSearch},\r\n");
      out.write("\t                {id : 'button-add',text : '增加',iconCls : 'icon-add',handler : doAdd},\r\n");
      out.write("\t                {id : 'button-edit',\ttext : '修改',iconCls : 'icon-edit',handler : doEdit},\r\n");
      out.write("\t                {id : 'button-delete',text : '删除',iconCls : 'icon-cancel',handler : doDelete},\r\n");
      out.write("\t                {id : 'button-association',text : '关联客户',iconCls : 'icon-sum',handler : doAssociations}];\r\n");
      out.write("\t// 定义列\r\n");
      out.write("\tvar columns = [ [ {field : 'id',title : '定区编号',width : 180,align : 'center' ,checkbox:true},\r\n");
      out.write("\t                  {field : 'name',title : '定区名称',width : 180,align : 'center'},\r\n");
      out.write("\t                  {field : 'staff.name',title : '负责人',width : 180,align : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\tif(row.staff!=null){\r\n");
      out.write("\t\t\treturn row.staff.name;\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'staff.telephone',\r\n");
      out.write("\t\ttitle : '联系电话',\r\n");
      out.write("\t\twidth : 180,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\tif(row.staff!=null){\r\n");
      out.write("\t\t\t\treturn row.staff.telephone;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'staff.station',\r\n");
      out.write("\t\ttitle : '所属公司',\r\n");
      out.write("\t\twidth : 180,\r\n");
      out.write("\t\talign : 'center',\r\n");
      out.write("\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\tif(row.staff!=null){\r\n");
      out.write("\t\t\t\treturn row.staff.station;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 先将body隐藏，再显示，不会出现页面刷新效果\r\n");
      out.write("\t\t$(\"body\").css({visibility:\"visible\"});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 定区数据表格\r\n");
      out.write("\t\t$('#tb').datagrid( {\r\n");
      out.write("\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\tpageList: [3,5,10],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_pageQuery\",\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 添加、修改定区\r\n");
      out.write("\t\t$('#addDecidedzoneWindow').window({\r\n");
      out.write("\t        title: '添加修改定区',\r\n");
      out.write("\t        width: 600,\r\n");
      out.write("\t        modal: true,\r\n");
      out.write("\t        shadow: true,\r\n");
      out.write("\t        closed: true,\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 查询定区\r\n");
      out.write("\t\t$('#searchWindow').window({\r\n");
      out.write("\t        title: '查询定区',\r\n");
      out.write("\t        width: 400,\r\n");
      out.write("\t        modal: true,\r\n");
      out.write("\t        shadow: true,\r\n");
      out.write("\t        closed: true,\r\n");
      out.write("\t        height: 400,\r\n");
      out.write("\t        resizable:false\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t//条件查询\r\n");
      out.write("\t\t$(\"#btn\").click(function(){\r\n");
      out.write("\t\t\tvar predicate=$(\"#queryDecidedzoneForm\").serializeJson();\r\n");
      out.write("\t\t\t$(\"#tb\").datagrid(\"load\",predicate);\r\n");
      out.write("\t\t\t$('#searchWindow').window(\"close\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t//双击事件\r\n");
      out.write("\tfunction doDblClickRow(rowIndex,rowData){\r\n");
      out.write("\t\t$('#association_subarea').datagrid( {\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/subareaAction_relationalSubarea?decidedzone.id=\"+rowData.id,\r\n");
      out.write("\t\t\tcolumns : [ [{field : 'sid',title : '分拣编号',width : 120,align : 'center'},\r\n");
      out.write("\t\t\t             {field : 'province',title : '省',width : 120,align : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn row.region.province;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}},\r\n");
      out.write("\t\t\t\t\t{field : 'city',title : '市',width : 120,align : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn row.region.city;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}}, \r\n");
      out.write("\t\t\t\t\t{field : 'district',title : '区',width : 120,align : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(data,row ,index){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn row.region.district;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}},\r\n");
      out.write("\t\t\t\t{field : 'addresskey',title : '关键字',width : 120,align : 'center'},\r\n");
      out.write("\t\t\t\t{field : 'startnum',title : '起始号',width : 100,align : 'center'},\r\n");
      out.write("\t\t\t\t{field : 'endnum',title : '终止号',width : 100,align : 'center'} ,\r\n");
      out.write("\t\t\t\t{field : 'single',title : '单双号',width : 100,align : 'center'} ,\r\n");
      out.write("\t\t\t\t{field : 'position',title : '位置',width : 200,align : 'center'\r\n");
      out.write("\t\t\t} ] ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#association_customer').datagrid( {\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_getAssociationCustomersByDecided?id=\"+rowData.id,\r\n");
      out.write("\t\t\tcolumns : [[{\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\ttitle : '客户编号',\r\n");
      out.write("\t\t\t\twidth : 180,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\ttitle : '客户名称',\r\n");
      out.write("\t\t\t\twidth : 180,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'telephone',\r\n");
      out.write("\t\t\t\ttitle : '客户电话',\r\n");
      out.write("\t\t\t\twidth : 180,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tfield : 'address',\r\n");
      out.write("\t\t\t\ttitle : '客户地址',\r\n");
      out.write("\t\t\t\twidth : 180,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\tfield : 'station',\r\n");
      out.write("\t\t\t\ttitle : '所属单位',\r\n");
      out.write("\t\t\t\twidth : 180,\r\n");
      out.write("\t\t\t\talign : 'center'\r\n");
      out.write("\t\t\t}]]\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//添加保存\r\n");
      out.write("\t\t$(\"#save\").click(function(){\r\n");
      out.write("\t\t\tvar flag=$(\"#addDecidedzoneForm\").form(\"validate\");\r\n");
      out.write("\t\t\tif(flag){\r\n");
      out.write("\t\t\t\t$(\"#addDecidedzoneForm\").submit();\r\n");
      out.write("\t\t\t\t$(\"#addDecidedzoneWindow\").window(\"close\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#toRight\").click(function(){\r\n");
      out.write("\t\t\t$(\"#associationSelect\").append($(\"#noassociationSelect option:selected\"));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#toLeft\").click(function(){\r\n");
      out.write("\t\t\t$(\"#noassociationSelect\").append($(\"#associationSelect option:selected\"));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#associationBtn\").click(function(){\r\n");
      out.write("\t\t\t$(\"#associationSelect option\").attr(\"selected\",\"selected\");\r\n");
      out.write("\t\t\t$(\"#customerForm\").submit();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t//定区编码检验\r\n");
      out.write("$.extend($.fn.validatebox.defaults.rules, { \r\n");
      out.write("\t\tuniDecidedzoneId: { \r\n");
      out.write("\t\t\tvalidator: function(value, param){ \r\n");
      out.write("\t\t\t\tvar hiddenId=$(\"#hiddenId\").val();\r\n");
      out.write("\t\t\t\tvar flag;\r\n");
      out.write("\t\t\t\tif(value==hiddenId){//窗体关闭时必须清空\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_checkdecidedzoneId\",\r\n");
      out.write("\t\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\tdata:\"id=\"+value+\"&hiddenId=\"+hiddenId,\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t//如果能查找到，返回true,不能查找到返回false\r\n");
      out.write("\t\t\t\t\t\tif(data){\r\n");
      out.write("\t\t\t\t\t\t\tflag=false;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tflag=true;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\treturn flag;\r\n");
      out.write("\t\t\t}, \r\n");
      out.write("\t\t\tmessage: '定区编号已存在' \r\n");
      out.write("\t\t}\r\n");
      out.write("\t}); \r\n");
      out.write("function closeClear(){//窗体关闭时清空\r\n");
      out.write("\t//$(\"#addDecidedzoneForm\").form(\"clear\");\r\n");
      out.write("\t$(\"#addDecidedzoneForm\")[0].reset();//并不能把隐藏域数据清空\r\n");
      out.write("\t$(\"#hiddenId\").val(\"\");\r\n");
      out.write("\t$(\"#subareaGrid\").datagrid(\"load\",{\"hiddenId\":\"\"});\r\n");
      out.write("}\r\n");
      out.write("</script>\t\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility:hidden;\">\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("    \t<table id=\"tb\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div region=\"south\" border=\"false\" style=\"height:150px\">\r\n");
      out.write("\t\t<div id=\"tabs\" fit=\"true\" class=\"easyui-tabs\">\r\n");
      out.write("\t\t\t<div title=\"关联分区\" id=\"subArea\"\r\n");
      out.write("\t\t\t\tstyle=\"width:100%;height:100%;overflow:hidden\">\r\n");
      out.write("\t\t\t\t<table id=\"association_subarea\"></table>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t\t<div title=\"关联客户\" id=\"customers\"\r\n");
      out.write("\t\t\t\tstyle=\"width:100%;height:100%;overflow:hidden\">\r\n");
      out.write("\t\t\t\t<table id=\"association_customer\"></table>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 添加 定区 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"定区添加修改\" id=\"addDecidedzoneWindow\"  data-options=\"onBeforeClose:closeClear\"\r\n");
      out.write("\t collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div style=\"height:31px;overflow:hidden;\" split=\"false\" border=\"false\" >\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" >保存</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"addDecidedzoneForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_save\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"hiddenId\" id=\"hiddenId\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">定区信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区编码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" class=\"easyui-validatebox\" data-options=\"required:true,validType:'uniDecidedzoneId'\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区名称</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" class=\"easyui-validatebox\" required=\"true\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>选择负责人</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"easyui-combobox\" name=\"staff.id\"  id=\"staff\"\r\n");
      out.write("    \t\t\t\t\t\t\tdata-options=\"valueField:'id',textField:'name',url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staffAction_nameListInUse'\" />  \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr height=\"300\">\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\">关联分区</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"subareaGrid\"  class=\"easyui-datagrid\" border=\"false\" style=\"width:300px;height:300px\"\r\n");
      out.write("\t\t\t\t\t\t\t data-options=\"url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/subareaAction_subareaListInAssociation',fitColumns:true,singleSelect:false\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>  \r\n");
      out.write("\t\t\t\t\t\t\t        <tr>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'did',hidden:true,width:30,checkbox:true\">编号</th>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'sid',width:30,checkbox:true\">编号</th>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'addresskey',width:150\">关键字</th>  \r\n");
      out.write("\t\t\t\t\t\t\t            <th data-options=\"field:'position',width:200,align:'right'\">位置</th>  \r\n");
      out.write("\t\t\t\t\t\t\t        </tr>  \r\n");
      out.write("\t\t\t\t\t\t\t    </thead> \r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 查询定区 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"查询定区窗口\" id=\"searchWindow\" collapsible=\"false\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px\">\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"queryDecidedzoneForm\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">查询条件</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>定区编码</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>所属单位</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"staff.station\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>是否关联分区</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"isAssociationSubarea\"  style=\"width:170px\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">是</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">否</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\"><a id=\"btn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">查询</a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 关联客户窗口 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"关联客户窗口\" id=\"customerWindow\" collapsible=\"false\" closed=\"true\" minimizable=\"false\" maximizable=\"false\" style=\"top:20px;left:200px;width: 400px;height: 300px;\">\r\n");
      out.write("\t\t<div style=\"overflow:auto;padding:5px;\" border=\"false\">\r\n");
      out.write("\t\t\t<form id=\"customerForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/decidedzoneAction_assignedCustomerToDecidedZone\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"80%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">关联客户</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" id=\"customerDecidedZoneId\" />\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"noassociationSelect\" multiple=\"multiple\" size=\"10\">\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"》》\" id=\"toRight\"><br/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"《《\" id=\"toLeft\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"associationSelect\" name=\"customerIds\" multiple=\"multiple\" size=\"10\">\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"><a id=\"associationBtn\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\">关联客户</a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
