package com.ex.spring.view;

import org.springframework.web.servlet.view.JstlView;

import java.io.File;
import java.util.Locale;

/*自定义 视图解析器 */
public class JspResourceView extends JstlView {
    @Override
    public boolean checkResource(Locale locale) {
        System.out.println(this.getServletContext().getRealPath("/") +"++"+ super.getUrl());
        File file = new File(this.getServletContext().getRealPath("/") + super.getUrl());
        return file.exists();// 判断该页面是否存在
    }
}
