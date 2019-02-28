package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;


public class EmployeeRegister$jsp extends HttpJspBase {


    static {
    }
    public EmployeeRegister$jsp( ) {
    }

    private static boolean _jspx_inited = false;

    public final void _jspx_init() throws org.apache.jasper.runtime.JspException {
    }

    public void _jspService(HttpServletRequest request, HttpServletResponse  response)
        throws java.io.IOException, ServletException {

        JspFactory _jspxFactory = null;
        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        String  _value = null;
        try {

            if (_jspx_inited == false) {
                synchronized (this) {
                    if (_jspx_inited == false) {
                        _jspx_init();
                        _jspx_inited = true;
                    }
                }
            }
            _jspxFactory = JspFactory.getDefaultFactory();
            response.setContentType("text/html;ISO-8859-1");
            pageContext = _jspxFactory.getPageContext(this, request, response,
            			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // HTML // begin [file="/EmployeeRegister.jsp";from=(0,57);to=(1,0)]
                out.write("\r\n");

            // end
            // HTML // begin [file="/EmployeeRegister.jsp";from=(1,57);to=(2,0)]
                out.write("\r\n");

            // end
            // HTML // begin [file="/EmployeeRegister.jsp";from=(2,59);to=(15,20)]
                out.write("\r\n\r\n<html>\r\n<head>\r\n</head>\r\n<body>\r\n\r\n\t<h2>Struts - Validator Example</h2>\r\n\r\n\t<b>User Registeration Form</b>\r\n\t<br />\r\n\t<br />\r\n\r\n\t<font color=\"red\"> ");

            // end
            // begin [file="/EmployeeRegister.jsp";from=(15,20);to=(15,35)]
                /* ----  html:errors ---- */
                org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = new org.apache.struts.taglib.html.ErrorsTag();
                _jspx_th_html_errors_0.setPageContext(pageContext);
                _jspx_th_html_errors_0.setParent(null);
                try {
                    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
                    if (_jspx_eval_html_errors_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                        throw new JspTagException("Since tag handler class org.apache.struts.taglib.html.ErrorsTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_html_errors_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                        // end
                        // begin [file="/EmployeeRegister.jsp";from=(15,20);to=(15,35)]
                        } while (_jspx_th_html_errors_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                } finally {
                    _jspx_th_html_errors_0.release();
                }
            // end
            // HTML // begin [file="/EmployeeRegister.jsp";from=(15,35);to=(18,1)]
                out.write("\r\n\t</font>\r\n\r\n\t");

            // end
            // begin [file="/EmployeeRegister.jsp";from=(18,1);to=(18,31)]
                /* ----  html:form ---- */
                org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = new org.apache.struts.taglib.html.FormTag();
                _jspx_th_html_form_0.setPageContext(pageContext);
                _jspx_th_html_form_0.setParent(null);
                _jspx_th_html_form_0.setAction("/Register");
                try {
                    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
                    if (_jspx_eval_html_form_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                        throw new JspTagException("Since tag handler class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                        // end
                        // HTML // begin [file="/EmployeeRegister.jsp";from=(18,31);to=(21,2)]
                            out.write("\r\n\r\n\t\t<br />\r\n\t\t");

                        // end
                        // begin [file="/EmployeeRegister.jsp";from=(21,2);to=(21,44)]
                            /* ----  bean:message ---- */
                            org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = new org.apache.struts.taglib.bean.MessageTag();
                            _jspx_th_bean_message_0.setPageContext(pageContext);
                            _jspx_th_bean_message_0.setParent(_jspx_th_html_form_0);
                            _jspx_th_bean_message_0.setKey("label.user.username");
                            try {
                              int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
                              if (_jspx_eval_bean_message_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                              throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                          if (_jspx_eval_bean_message_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(21,2);to=(21,44)]
                          } while (_jspx_th_bean_message_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_0.release();
                  }
              // end
              // HTML // begin [file="/EmployeeRegister.jsp";from=(21,44);to=(22,0)]
                  out.write(" : \r\n");

              // end
              // begin [file="/EmployeeRegister.jsp";from=(22,0);to=(22,43)]
                  /* ----  html:text ---- */
                  org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = new org.apache.struts.taglib.html.TextTag();
                  _jspx_th_html_text_0.setPageContext(pageContext);
                  _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
                  _jspx_th_html_text_0.setProperty("username");
                  _jspx_th_html_text_0.setSize("25");
                  try {
                      int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
                      if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          try {
                              if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = pageContext.pushBody();
                              _jspx_th_html_text_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_text_0.doInitBody();
                          }
                          do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(22,0);to=(22,43)]
                          } while (_jspx_th_html_text_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      } finally {
                          if (_jspx_eval_html_text_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = pageContext.popBody();
                      }
                  }
                  if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_html_text_0.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(22,43);to=(24,2)]
              out.write("\r\n\t\t<br />\r\n\t\t");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(24,2);to=(24,45)]
              /* ----  bean:message ---- */
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = new org.apache.struts.taglib.bean.MessageTag();
              _jspx_th_bean_message_1.setPageContext(pageContext);
              _jspx_th_bean_message_1.setParent(_jspx_th_html_form_0);
              _jspx_th_bean_message_1.setKey("label.user.password1");
              try {
                  int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
                  if (_jspx_eval_bean_message_1 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                      throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                  if (_jspx_eval_bean_message_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                      // end
                      // begin [file="/EmployeeRegister.jsp";from=(24,2);to=(24,45)]
                      } while (_jspx_th_bean_message_1.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_bean_message_1.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(24,45);to=(25,0)]
              out.write(" : \r\n");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(25,0);to=(25,44)]
              /* ----  html:text ---- */
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = new org.apache.struts.taglib.html.TextTag();
              _jspx_th_html_text_1.setPageContext(pageContext);
              _jspx_th_html_text_1.setParent(_jspx_th_html_form_0);
              _jspx_th_html_text_1.setProperty("password1");
              _jspx_th_html_text_1.setSize("25");
              try {
                  int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
                  if (_jspx_eval_html_text_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      try {
                          if (_jspx_eval_html_text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = pageContext.pushBody();
                              _jspx_th_html_text_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_text_1.doInitBody();
                          }
                          do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(25,0);to=(25,44)]
                          } while (_jspx_th_html_text_1.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      } finally {
                          if (_jspx_eval_html_text_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = pageContext.popBody();
                      }
                  }
                  if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_html_text_1.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(25,44);to=(27,2)]
              out.write("\r\n\t\t<br />\r\n\t\t");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(27,2);to=(27,45)]
              /* ----  bean:message ---- */
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = new org.apache.struts.taglib.bean.MessageTag();
              _jspx_th_bean_message_2.setPageContext(pageContext);
              _jspx_th_bean_message_2.setParent(_jspx_th_html_form_0);
              _jspx_th_bean_message_2.setKey("label.user.password2");
              try {
                  int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
                  if (_jspx_eval_bean_message_2 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                      throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                  if (_jspx_eval_bean_message_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                      // end
                      // begin [file="/EmployeeRegister.jsp";from=(27,2);to=(27,45)]
                      } while (_jspx_th_bean_message_2.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_bean_message_2.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(27,45);to=(28,0)]
              out.write(" : \r\n");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(28,0);to=(28,44)]
              /* ----  html:text ---- */
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = new org.apache.struts.taglib.html.TextTag();
              _jspx_th_html_text_2.setPageContext(pageContext);
              _jspx_th_html_text_2.setParent(_jspx_th_html_form_0);
              _jspx_th_html_text_2.setProperty("password2");
              _jspx_th_html_text_2.setSize("25");
              try {
                  int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
                  if (_jspx_eval_html_text_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      try {
                          if (_jspx_eval_html_text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = pageContext.pushBody();
                              _jspx_th_html_text_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_text_2.doInitBody();
                          }
                          do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(28,0);to=(28,44)]
                          } while (_jspx_th_html_text_2.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      } finally {
                          if (_jspx_eval_html_text_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = pageContext.popBody();
                      }
                  }
                  if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_html_text_2.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(28,44);to=(30,2)]
              out.write("\r\n\t\t<br />\r\n\t\t");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(30,2);to=(30,41)]
              /* ----  bean:message ---- */
              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = new org.apache.struts.taglib.bean.MessageTag();
              _jspx_th_bean_message_3.setPageContext(pageContext);
              _jspx_th_bean_message_3.setParent(_jspx_th_html_form_0);
              _jspx_th_bean_message_3.setKey("label.user.email");
              try {
                  int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
                  if (_jspx_eval_bean_message_3 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                      throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                  if (_jspx_eval_bean_message_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                      // end
                      // begin [file="/EmployeeRegister.jsp";from=(30,2);to=(30,41)]
                      } while (_jspx_th_bean_message_3.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_bean_message_3.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(30,41);to=(31,0)]
              out.write(" : \r\n");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(31,0);to=(31,40)]
              /* ----  html:text ---- */
              org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = new org.apache.struts.taglib.html.TextTag();
              _jspx_th_html_text_3.setPageContext(pageContext);
              _jspx_th_html_text_3.setParent(_jspx_th_html_form_0);
              _jspx_th_html_text_3.setProperty("email");
              _jspx_th_html_text_3.setSize("25");
              try {
                  int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
                  if (_jspx_eval_html_text_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      try {
                          if (_jspx_eval_html_text_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = pageContext.pushBody();
                              _jspx_th_html_text_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_text_3.doInitBody();
                          }
                          do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(31,0);to=(31,40)]
                          } while (_jspx_th_html_text_3.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      } finally {
                          if (_jspx_eval_html_text_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                              out = pageContext.popBody();
                      }
                  }
                  if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
              } finally {
                  _jspx_th_html_text_3.release();
              }
          // end
          // HTML // begin [file="/EmployeeRegister.jsp";from=(31,40);to=(34,2)]
              out.write("\r\n\t\t<br />\r\n\t\t<br />\r\n\t\t");

          // end
          // begin [file="/EmployeeRegister.jsp";from=(34,2);to=(34,15)]
              /* ----  html:submit ---- */
              org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = new org.apache.struts.taglib.html.SubmitTag();
              _jspx_th_html_submit_0.setPageContext(pageContext);
              _jspx_th_html_submit_0.setParent(_jspx_th_html_form_0);
              try {
                  int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
                  if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      try {
                          if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = pageContext.pushBody();
                              _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_html_submit_0.doInitBody();
                          }
                          do {
                          // end
                          // HTML // begin [file="/EmployeeRegister.jsp";from=(34,15);to=(35,3)]
                              out.write("\r\n\t\t\t");

                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(35,3);to=(35,50)]
                              /* ----  bean:message ---- */
                              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = new org.apache.struts.taglib.bean.MessageTag();
                              _jspx_th_bean_message_4.setPageContext(pageContext);
                              _jspx_th_bean_message_4.setParent(_jspx_th_html_submit_0);
                              _jspx_th_bean_message_4.setKey("label.user.button.submit");
                              try {
                              int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
                              if (_jspx_eval_bean_message_4 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                              throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                          if (_jspx_eval_bean_message_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                          // end
                          // begin [file="/EmployeeRegister.jsp";from=(35,3);to=(35,50)]
                          } while (_jspx_th_bean_message_4.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_4.release();
                  }
              // end
              // HTML // begin [file="/EmployeeRegister.jsp";from=(35,50);to=(36,2)]
                  out.write("\r\n\t\t");

              // end
              // begin [file="/EmployeeRegister.jsp";from=(36,2);to=(36,16)]
              } while (_jspx_th_html_submit_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          } finally {
              if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
          }
      }
      if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
  } finally {
      _jspx_th_html_submit_0.release();
  }
// end
// HTML // begin [file="/EmployeeRegister.jsp";from=(36,16);to=(38,1)]
    out.write("\r\n\r\n\t");

// end
// begin [file="/EmployeeRegister.jsp";from=(38,1);to=(38,13)]
} while (_jspx_th_html_form_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
}
if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
    return;
} finally {
    _jspx_th_html_form_0.release();
}
// end
// HTML // begin [file="/EmployeeRegister.jsp";from=(38,13);to=(41,7)]
    out.write("\r\n\r\n</body>\r\n</html>");

// end

} catch (Throwable t) {
    if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
    if (pageContext != null) pageContext.handlePageException(t);
} finally {
    if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
}
}
}
