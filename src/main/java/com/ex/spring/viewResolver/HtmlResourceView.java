package com.ex.spring.viewResolver;

import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.JstlView;

import java.io.File;
import java.util.Locale;

/*自定义视图解析器 */
public class HtmlResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) {
        System.out.println(this.getServletContext().getRealPath("/") +"++"+ super.getUrl());
        File file = new File(this.getServletContext().getRealPath("/") + super.getUrl());
        return file.exists();// 判断该页面是否存在
    }
}
