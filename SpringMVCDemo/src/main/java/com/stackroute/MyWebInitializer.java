package com.stackroute;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
   //    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[0];
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[0];
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[0];
//    }
   @Override
   protected Class<?>[] getRootConfigClasses() {
       return new Class[0];
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
       return new Class[]{WebConfig.class};
   }
 
   @Override
   protected String[] getServletMappings() {
       return new String[]{"/"};
   }
}
