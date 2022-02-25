package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gdTimKiemNV_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tìm kiếm nhân viên vào ca làm</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        html{\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            color:#fff;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .insert{\n");
      out.write("\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            padding : 0;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: 100%;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-image: linear-gradient(\n");
      out.write("                70deg,rgb(233 159 159 / 9%),rgb(68 56 63 / 50%)), url(vantai.jpg);\n");
      out.write("        }\n");
      out.write("        header { \n");
      out.write("            height: 80px;\n");
      out.write("            width: 80%;\n");
      out.write("            margin: auto;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        .container { \t\n");
      out.write("            height: 450px;\n");
      out.write("            width: 80%;\n");
      out.write("            margin: auto;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .wrapper{\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .main__title{\n");
      out.write("            font-size: 30px;\n");
      out.write("            line-height: 74px;\n");
      out.write("        }\n");
      out.write("        .title{\n");
      out.write("            display: block;\n");
      out.write("            font-size: 30px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("\n");
      out.write("            width: 100px;\n");
      out.write("        }\n");
      out.write("        span.button{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            padding-top: 20px;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 30%;\n");
      out.write("            height: 35px;\n");
      out.write("            background-color: #eccccc;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("        form{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 30px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]{\n");
      out.write("            width: 10%;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("        span.insert{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            margin: 20px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        span.insert a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #086177;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 600;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        span.insert:hover a{\n");
      out.write("            color: rgb(173, 24, 163);\n");
      out.write("        }\n");
      out.write("        .table__content{\n");
      out.write("            width: 95%;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            padding-left: 10px;\n");
      out.write("            /*padding-left: 50px;*/\n");
      out.write("        }\n");
      out.write("        table{\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            /* border: 2px solid #999999; */\n");
      out.write("            padding: 5px;\n");
      out.write("            background-color: rgb(243 219 219 / 78%);\n");
      out.write("            color: rgb(94 15 15);\n");
      out.write("            font-weight: 450;\n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            background-color: rgb(205 132 132);\n");
      out.write("\n");
      out.write("            font-weight: normal;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        /* ------ */\n");
      out.write("        tbody {\n");
      out.write("            /* display: inline-block; */\n");
      out.write("            border: 2px solid #999999;\n");
      out.write("        }\n");
      out.write("        td a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: rgb(94 15 15);\n");
      out.write("        }\n");
      out.write("        td a:hover{\n");
      out.write("\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]{\n");
      out.write("            color: #086177;\n");
      out.write("            font-size: 15px;\n");
      out.write("            font-weight: 700;\n");
      out.write("            width: 89px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            color:rgb(173, 24, 163);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .search{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            padding-top: 20px;\n");
      out.write("        }\n");
      out.write("        .search span{\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 400;\n");
      out.write("            padding-right: 28px;\n");
      out.write("        }\n");
      out.write("        .search select{\n");
      out.write("            width: 81px;\n");
      out.write("            margin-right: 15px;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"]{\n");
      out.write("            width: 160px;\n");
      out.write("        }\n");
      out.write("        select option{\n");
      out.write("            color: #495a5e;\n");
      out.write("        }\n");
      out.write("        button.button__back{\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100px;\n");
      out.write("            left: 160px;\n");
      out.write("            bottom: 30px;\n");
      out.write("        }\n");
      out.write("        .button{\n");
      out.write("            display: flex;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: -10px;\n");
      out.write("            left: 504px;\n");
      out.write("            padding-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form__button{\n");
      out.write("            margin-right: 150px;\n");
      out.write("        }\n");
      out.write("        .button input[type=\"submit\"]{\n");
      out.write("            /* position: absolute; */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"insert\">\n");
      out.write("            <header>\n");
      out.write("                <span class=\"main__title\">Tìm kiếm nhân viên vào ca làm</span>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"wrapper\">\n");
      out.write("                    <span class=\"title\">\n");
      out.write("                        <div class=\"form__button\" method=\"get\" action=\"bac-si/tim-kiem\"> \n");
      out.write("                            <input type=\"text\"  />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form__button\"> \n");
      out.write("                            <input type=\"submit\" value=\"Lưu\" />\n");
      out.write("                        </div>\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                    <form method =\"POST\" action=\"listLichDangKy\">\n");
      out.write("                        <div class=\"table__content\">\n");
      out.write("                            <table>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Họ và tên</th>\n");
      out.write("                                        <th>Số điện thoại</th>\n");
      out.write("                                        <th>Tổng giờ vừa lên lịch</th>\n");
      out.write("                                        <th>Chọn</th>\t\t\t\t\t\t\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"button\">\n");
      out.write("                            <div class=\"form__button button__back\" method=\"get\" action=\"bac-si/tim-kiem\"> \n");
      out.write("                                <input type=\"submit\" formaction=\"/QuanLyKTX/AddLichLamViec\" value=\"Quay lại\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form__button\"> \n");
      out.write("                                <input type=\"submit\" value=\"Lưu\" />\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDK}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.nhanVien.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.nhanVien.SDT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mapTongGio.get(item.nhanVien.ID)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <input type=\"checkbox\" id=\"checkbox1\" name=\"options\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.nhanVien.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listDK.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"form__button\" > \n");
        out.write("                                    <input type=\"submit\" value=\"Thêm nhân viên vào ca làm\" style=\"width: 220px;\" />\n");
        out.write("                                </div>                                               \n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
