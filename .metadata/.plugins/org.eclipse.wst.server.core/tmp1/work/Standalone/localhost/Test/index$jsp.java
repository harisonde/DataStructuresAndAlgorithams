package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;


public class index$jsp extends HttpJspBase {


    static {
    }
    public index$jsp( ) {
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
            response.setContentType("text/html");
            pageContext = _jspxFactory.getPageContext(this, request, response,
            			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // HTML // begin [file="/index.jsp";from=(0,57);to=(1,0)]
                out.write("\n");

            // end
            // HTML // begin [file="/index.jsp";from=(1,57);to=(2,0)]
                out.write("\n");

            // end
            // HTML // begin [file="/index.jsp";from=(2,33);to=(3,0)]
                out.write("\n");

            // end
            // HTML // begin [file="/index.jsp";from=(3,30);to=(11,8)]
                out.write("\n\n\n<html>\n    <head>\n       \n    </head>\n    <body>\n        ");

            // end
            // begin [file="/index.jsp";from=(11,8);to=(11,40)]
                /* ----  html:form ---- */
                org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = new org.apache.struts.taglib.html.FormTag();
                _jspx_th_html_form_0.setPageContext(pageContext);
                _jspx_th_html_form_0.setParent(null);
                _jspx_th_html_form_0.setAction("UserAction");
                try {
                    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
                    if (_jspx_eval_html_form_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                        throw new JspTagException("Since tag handler class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        do {
                        // end
                        // HTML // begin [file="/index.jsp";from=(11,40);to=(15,24)]
                            out.write("\n            <table>\n                <tr>\n                    <td>\n                        ");

                        // end
                        // begin [file="/index.jsp";from=(15,24);to=(15,73)]
                            /* ----  bean:write ---- */
                            org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = new org.apache.struts.taglib.bean.WriteTag();
                            _jspx_th_bean_write_0.setPageContext(pageContext);
                            _jspx_th_bean_write_0.setParent(_jspx_th_html_form_0);
                            _jspx_th_bean_write_0.setName("UserForm");
                            _jspx_th_bean_write_0.setProperty("message");
                            try {
                              int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
                              if (_jspx_eval_bean_write_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                              throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                          if (_jspx_eval_bean_write_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                          // end
                          // begin [file="/index.jsp";from=(15,24);to=(15,73)]
                          } while (_jspx_th_bean_write_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_write_0.release();
                  }
              // end
              // HTML // begin [file="/index.jsp";from=(15,73);to=(20,24)]
                  out.write("\n                    </td>\n                </tr>\n                <tr>\n                    <td>\n                        ");

              // end
              // begin [file="/index.jsp";from=(20,24);to=(20,55)]
                  /* ----  html:submit ---- */
                  org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = new org.apache.struts.taglib.html.SubmitTag();
                  _jspx_th_html_submit_0.setPageContext(pageContext);
                  _jspx_th_html_submit_0.setParent(_jspx_th_html_form_0);
                  _jspx_th_html_submit_0.setProperty("method");
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
                          // begin [file="/index.jsp";from=(20,55);to=(20,89)]
                              /* ----  bean:message ---- */
                              org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = new org.apache.struts.taglib.bean.MessageTag();
                              _jspx_th_bean_message_0.setPageContext(pageContext);
                              _jspx_th_bean_message_0.setParent(_jspx_th_html_submit_0);
                              _jspx_th_bean_message_0.setKey("UserForm.add");
                              try {
                              int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
                              if (_jspx_eval_bean_message_0 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                              throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                          if (_jspx_eval_bean_message_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                          // end
                          // begin [file="/index.jsp";from=(20,55);to=(20,89)]
                          } while (_jspx_th_bean_message_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_0.release();
                  }
              // end
              // begin [file="/index.jsp";from=(20,24);to=(20,103)]
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
// HTML // begin [file="/index.jsp";from=(20,103);to=(25,24)]
    out.write("\n                    </td>\n                </tr>\n                <tr>\n                    <td>\n                        ");

// end
// begin [file="/index.jsp";from=(25,24);to=(25,55)]
    /* ----  html:submit ---- */
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_1 = new org.apache.struts.taglib.html.SubmitTag();
    _jspx_th_html_submit_1.setPageContext(pageContext);
    _jspx_th_html_submit_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_submit_1.setProperty("method");
    try {
        int _jspx_eval_html_submit_1 = _jspx_th_html_submit_1.doStartTag();
        if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            try {
                if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = pageContext.pushBody();
                    _jspx_th_html_submit_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_html_submit_1.doInitBody();
                }
                do {
                // end
                // begin [file="/index.jsp";from=(25,55);to=(25,92)]
                    /* ----  bean:message ---- */
                    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = new org.apache.struts.taglib.bean.MessageTag();
                    _jspx_th_bean_message_1.setPageContext(pageContext);
                    _jspx_th_bean_message_1.setParent(_jspx_th_html_submit_1);
                    _jspx_th_bean_message_1.setKey("UserForm.update");
                    try {
                        int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
                        if (_jspx_eval_bean_message_1 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                            throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                        if (_jspx_eval_bean_message_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                          // end
                          // begin [file="/index.jsp";from=(25,55);to=(25,92)]
                          } while (_jspx_th_bean_message_1.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_1.release();
                  }
              // end
              // begin [file="/index.jsp";from=(25,24);to=(25,106)]
              } while (_jspx_th_html_submit_1.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          } finally {
              if (_jspx_eval_html_submit_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
          }
      }
      if (_jspx_th_html_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
  } finally {
      _jspx_th_html_submit_1.release();
  }
// end
// HTML // begin [file="/index.jsp";from=(25,106);to=(30,24)]
    out.write("\n                    </td>\n                </tr>\n                <tr>\n                    <td>\n                        ");

// end
// begin [file="/index.jsp";from=(30,24);to=(30,55)]
    /* ----  html:submit ---- */
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_2 = new org.apache.struts.taglib.html.SubmitTag();
    _jspx_th_html_submit_2.setPageContext(pageContext);
    _jspx_th_html_submit_2.setParent(_jspx_th_html_form_0);
    _jspx_th_html_submit_2.setProperty("method");
    try {
        int _jspx_eval_html_submit_2 = _jspx_th_html_submit_2.doStartTag();
        if (_jspx_eval_html_submit_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            try {
                if (_jspx_eval_html_submit_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = pageContext.pushBody();
                    _jspx_th_html_submit_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_html_submit_2.doInitBody();
                }
                do {
                // end
                // begin [file="/index.jsp";from=(30,55);to=(30,92)]
                    /* ----  bean:message ---- */
                    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = new org.apache.struts.taglib.bean.MessageTag();
                    _jspx_th_bean_message_2.setPageContext(pageContext);
                    _jspx_th_bean_message_2.setParent(_jspx_th_html_submit_2);
                    _jspx_th_bean_message_2.setKey("UserForm.delete");
                    try {
                        int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
                        if (_jspx_eval_bean_message_2 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                            throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                        if (_jspx_eval_bean_message_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                          // end
                          // begin [file="/index.jsp";from=(30,55);to=(30,92)]
                          } while (_jspx_th_bean_message_2.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_2.release();
                  }
              // end
              // begin [file="/index.jsp";from=(30,24);to=(30,106)]
              } while (_jspx_th_html_submit_2.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          } finally {
              if (_jspx_eval_html_submit_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
          }
      }
      if (_jspx_th_html_submit_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
  } finally {
      _jspx_th_html_submit_2.release();
  }
// end
// HTML // begin [file="/index.jsp";from=(30,106);to=(35,24)]
    out.write("\n                    </td>\n                </tr>\n                 <tr>\n                    <td>\n                        ");

// end
// begin [file="/index.jsp";from=(35,24);to=(35,55)]
    /* ----  html:submit ---- */
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_3 = new org.apache.struts.taglib.html.SubmitTag();
    _jspx_th_html_submit_3.setPageContext(pageContext);
    _jspx_th_html_submit_3.setParent(_jspx_th_html_form_0);
    _jspx_th_html_submit_3.setProperty("method");
    try {
        int _jspx_eval_html_submit_3 = _jspx_th_html_submit_3.doStartTag();
        if (_jspx_eval_html_submit_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            try {
                if (_jspx_eval_html_submit_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = pageContext.pushBody();
                    _jspx_th_html_submit_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_html_submit_3.doInitBody();
                }
                do {
                // end
                // begin [file="/index.jsp";from=(35,55);to=(35,95)]
                    /* ----  bean:message ---- */
                    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = new org.apache.struts.taglib.bean.MessageTag();
                    _jspx_th_bean_message_3.setPageContext(pageContext);
                    _jspx_th_bean_message_3.setParent(_jspx_th_html_submit_3);
                    _jspx_th_bean_message_3.setKey("UserForm.incorrect");
                    try {
                        int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
                        if (_jspx_eval_bean_message_3 == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED)
                            throw new JspTagException("Since tag handler class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it can't return BodyTag.EVAL_BODY_TAG");
                        if (_jspx_eval_bean_message_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            do {
                          // end
                          // begin [file="/index.jsp";from=(35,55);to=(35,95)]
                          } while (_jspx_th_bean_message_3.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                  } finally {
                      _jspx_th_bean_message_3.release();
                  }
              // end
              // begin [file="/index.jsp";from=(35,24);to=(35,109)]
              } while (_jspx_th_html_submit_3.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          } finally {
              if (_jspx_eval_html_submit_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
          }
      }
      if (_jspx_th_html_submit_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
  } finally {
      _jspx_th_html_submit_3.release();
  }
// end
// HTML // begin [file="/index.jsp";from=(35,109);to=(39,8)]
    out.write("\n                    </td>\n                </tr>\n            </table>\n        ");

// end
// begin [file="/index.jsp";from=(39,8);to=(39,20)]
} while (_jspx_th_html_form_0.doAfterBody() == javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
}
if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
    return;
} finally {
    _jspx_th_html_form_0.release();
}
// end
// HTML // begin [file="/index.jsp";from=(39,20);to=(41,7)]
    out.write("\n    </body>\n</html>");

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
