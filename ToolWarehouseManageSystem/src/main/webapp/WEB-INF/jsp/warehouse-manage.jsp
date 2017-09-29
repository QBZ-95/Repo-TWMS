<%--
  Created by IntelliJ IDEA.
  User: 李-元海
  Date: 2017/9/26
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>仓库管理</title>
    <meta name="description" content="Restyling jQuery UI Widgets and Elements"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="/css/ace-fonts.css"/>
    <link rel="stylesheet" href="/css/ace.min.css" id="main-ace-style"/>
    <link rel="stylesheet" href="/css/bootstrap-fileupload.min.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/css/ace-part2.min.css"/>
    <![endif]-->
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="/css/ace-ie.min.css"/>
    <![endif]-->
    <script src="/js/ace-extra.min.js"></script>
    <!--[if lte IE 8]>
    <script src="/js/html5shiv.min.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="no-skin">
<%--包含顶部菜单栏--%>
<%@include file="top.jsp" %>

<div class="main-container" id="main-container">
    <%--包含左侧菜单栏--%>
    <%@include file="menu.jsp" %>
    <div class="main-content">
        <!-- #section:basics/content.breadcrumbs -->
        <div class="breadcrumbs" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="/twms/index">系统首页</a>
                </li>
                <li>
                    <a href="javascript:void(0)">仓库管理</a>
                </li>
            </ul><!-- /.breadcrumb -->
        </div>

        <div class="page-content">
            <!-- /section:settings.box -->
            <div class="page-content-area">


                <div class="row" style="padding-top: 10px;">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <div class="row">
                            <div class="col-xs-12">

                                <div class="table-header" style="font-size: x-large;">
                                    仓库信息管理
                                </div>
                                <div style="padding-bottom: 10px;padding-top: 10px;text-align: center;display:block;">
                                    <label style="font-size: large;padding-bottom: 5px;padding-left: 20px;">查询库存：</label>
                                    <select class="" id="form-field-select-1"
                                            style="height: 35px;margin-left: 10px;">
                                        <option value="">请选择查询条件
                                        </option>
                                        <option value="AL">按货架编号查询
                                        </option>
                                        <option value="AK">按工装编号查询
                                        </option>
                                    </select>
                                    <span class="input-icon">
                                        <input type="text"
                                               placeholder="请输入关键字 ..."
                                               class="nav-search-input"
                                               id="nav-search-input"
                                               autocomplete="off"/>
                                        <i class="ace-icon fa fa-search nav-search-icon"></i>
                                        </span>
                                    <input type="submit" value="搜索"
                                           class="btn btn-sm btn-primary"
                                           id="searchUser"/>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                    <div class="fileupload fileupload-new"
                                         data-provides="fileupload"
                                         style="display: inline-block;">
                                         <span class="btn btn-file btn-primary"
                                               style="height: 35px;font-size: small;">
                                             <span class="fileupload-new ">导入库存信息</span>
                                             <span class="fileupload-exists">更改文件</span>
                                             <input type="file" name="file">
                                         </span>
                                        <span class="fileupload-preview"></span>
                                        <a href="#"
                                           class="close fileupload-exists"
                                           data-dismiss="fileupload"
                                           style="float: none">x</a>
                                        <input type="submit"
                                               class="btn btn-sm btn-primary"
                                               value="确认上传">
                                    </div>
                                </div>

                                <div class="table-responsive">

                                    <table id="sample-table-2"
                                           class="table table-striped table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th class="center">
                                                <label class="position-relative">
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                            </th>
                                            <th class="center">货架编号</th>
                                            <th class="center">货架位置</th>
                                            <th class="center">工装编号</th>
                                            <th class="center">库存状态</th>
                                            <th class="center">操作</th>
                                        </tr>
                                        </thead>

                                        <tbody class="center">
                                        <tr>
                                            <td class="center">
                                                <label class="position-relative">
                                                    <input type="checkbox" class="ace"/>
                                                    <span class="lbl"></span>
                                                </label>
                                            </td>

                                            <td>037667</td>
                                            <td>李元海</td>
                                            <td>男</td>
                                            <td>变频一班</td>

                                            <td>
                                                <%--弹窗按钮--%>
                                                <a href="#modal-table" role="button" class="btn btn-xs btn-info" data-toggle="modal">
                                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                                                </a>

                                                <a href="#modal-table" role="button" class="btn btn-xs btn-danger" data-toggle="modal">
                                                <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                                </a>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>

                                    <div class="modal-footer no-margin-top">

                                        <ul class="pagination pull-right no-margin">
                                            <li class="prev disabled">
                                                <a href="#">
                                                    <i class="ace-icon fa fa-angle-double-left"></i>
                                                </a>
                                            </li>

                                            <li class="active">
                                                <a href="#">1</a>
                                            </li>

                                            <li>
                                                <a href="#">2</a>
                                            </li>

                                            <li>
                                                <a href="#">3</a>
                                            </li>

                                            <li class="next">
                                                <a href="#">
                                                    <i class="ace-icon fa fa-angle-double-right"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>

                                </div>


                            </div>
                        </div>

                        <div id="modal-table" class="modal fade" tabindex="-1">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header no-padding">
                                        <div class="table-header">
                                            <button type="button" class="close" data-dismiss="modal"
                                                    aria-hidden="true">
                                                <span class="white">&times;</span>
                                            </button>
                                            添加用户
                                        </div>
                                    </div>

                                    <div class="modal-body">
                                        <form class="form-horizontal" role="form">
                                            <!-- #section:elements.form -->
                                            <div class="form-group"
                                                 style="padding-top: 10px;padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"
                                                       for="form-field-1"> 编号：</label>

                                                <div class="col-sm-9">
                                                    <input type="text" id="form-field-1"
                                                           placeholder="请输入用户编号"
                                                           class="col-xs-10 col-sm-5"/>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"
                                                       for="form-field-1-1">姓名： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" id="form-field-1-1"
                                                           placeholder="输入用户姓名"
                                                           class=" col-xs-10 col-sm-5"/>
                                                </div>
                                            </div>

                                            <!-- /section:elements.form -->
                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right"
                                                       for="form-field-2">密码： </label>

                                                <div class="col-sm-9">
                                                    <input type="text" id="form-field-2"
                                                           placeholder="输入用户密码"
                                                           class="col-xs-10 col-sm-5"/>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">性别： </label>

                                                <div class="radio">
                                                    <label>
                                                        <input name="form-field-radio" type="radio"
                                                               class="ace"/>
                                                        <span class="lbl"> 男</span>
                                                    </label>
                                                    &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                                                    <input name="form-field-radio" type="radio"
                                                           class="ace"/>
                                                    <span class="lbl"> 女</span>
                                                </div>
                                            </div>

                                            <div class="space-4"></div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">班组：</label>

                                                <div class="col-sm-9">
                                                    <!-- #section:plugins/bootstrap.typeahead-js -->
                                                    <div class="pos-rel">
                                                        <select class="form-control"
                                                                style="width: 135px;" id="">
                                                            <option value="">请选择所属班组</option>
                                                            <option value="AL">未提交</option>
                                                            <option value="AK">已提交</option>
                                                            <option value="AZ">待审核</option>
                                                            <option value="AR">审核通过</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">角色：</label>

                                                <div class="col-sm-9">
                                                    <!-- #section:plugins/bootstrap.typeahead-js -->
                                                    <div class="pos-rel">
                                                        <select class="form-control"
                                                                style="width: 135px;" id="">
                                                            <option value="">请选择用户角色</option>
                                                            <option value="AL">普通员工</option>
                                                            <option value="AK">仓库管理员</option>
                                                            <option value="AZ">超级管理员</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group" style="padding-left: 120px;">
                                                <label class="col-sm-3 control-label no-padding-right">批量导入：</label>

                                                <div class="col-sm-9">
                                                    <div class="pos-rel">
                                                        <div class="fileupload fileupload-new"
                                                             data-provides="fileupload"
                                                             style="display: block;">
                                                             <span class="btn btn-file btn-primary"
                                                                   style="height: 35px;font-size: small;">
                                                                 <span class="fileupload-new ">选择文件</span>
                                                                 <span class="fileupload-exists">更改文件</span>
                                                                 <input type="file" name="file">
                                                             </span>
                                                            <span class="fileupload-preview"></span>
                                                            <a href="#"
                                                               class="close fileupload-exists"
                                                               data-dismiss="fileupload"
                                                               style="float: none">x</a>
                                                            <input type="submit"
                                                                   class="btn btn-sm btn-primary"
                                                                   value="确认上传">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="clearfix form-actions">
                                                <div class="col-md-offset-3 col-md-9"
                                                     style="margin-left: 100px;">
                                                    <button class="btn btn-info" type="button">
                                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                                        提交
                                                    </button>

                                                    &nbsp; &nbsp; &nbsp;
                                                    <button class="btn" type="reset">
                                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                                        重置
                                                    </button>

                                                    &nbsp; &nbsp; &nbsp;
                                                    <button class="btn btn-danger bigger-110"
                                                            data-dismiss="modal">
                                                        <i class="ace-icon fa fa-times"></i>
                                                        关闭
                                                    </button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal-dialog -->
                        </div><!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content-area -->
        </div><!-- /.page-content -->
    </div><!-- /.main-content -->

</div>

<!-- basic scripts -->
<script src="/js/typeahead.jquery.min.js"></script>
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='/js/jquery.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='/js/jquery1x.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!-- ace scripts -->
<script src="/js/ace-elements.min.js"></script>
<script src="/js/ace.min.js"></script>
<script src="/js/bootstrap-fileupload.js"></script>
</body>
</html>
