package com.stackroute;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class HelloController {
 
//   @RequestMapping("/add")
//    public String DisplayData(){
//        return "display";
//    }
//
 
  @RequestMapping("/add")
   public ModelAndView displayData(HttpServletRequest request, HttpServletResponse response){
       String email = request.getParameter("txt1");
       ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("display");
      modelAndView.addObject("key",email);
       return modelAndView;
   }
   @RequestMapping("/calculate")
   public ModelAndView additionOfTwoNumbers(HttpServletRequest request, HttpServletResponse response) {
       int num1 = Integer.parseInt(request.getParameter("text1"));
       int num2 = Integer.parseInt(request.getParameter("text2"));
       AddServices services = new AddServices();
       int result = services.sum(num1, num2);
       ModelAndView mv = new ModelAndView();
      mv.setViewName("addition");
      mv.addObject("addition",result);
       return mv;
   }
}
 
