package com.example.demo.controller.src;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class hellowcontroller {
  
  @PostMapping("posthello")
  public String posthello(@RequestParam("name")String name,Model model)
  {
    System.out.println(name+"name");
    model.addAttribute("post", name);

    return "posthello";

  }
  @GetMapping("hello")
    public String name(Model model) {
    model.addAttribute("data", "hello");
      return "hello";///파일 찾아라
  }

  @GetMapping("hello-mvc")
  public String hellomvc(@RequestParam("name") String name,Model model) {

    model.addAttribute("name", name);

    return "hello-template";
  }

  @GetMapping("hello-string")
  @ResponseBody//api body에 직접 넣어주겠다 소스보기하면 html코드없이 그냥 문자열만 그대로 넣어버린다
  public String hellostring(@RequestParam("name") String name) {
      
    return "hello"+name;
  }
  @GetMapping("hello-api")
  @ResponseBody//api 
  public hello helloapi(@RequestParam("name")String name)
  {
    hello h=new hello();
    h.setName(name);
    return h;///json으로 간다 {"name":"변수"}
  }

  static class hello{
    private String name;

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    };

  }
    
  
  
}
