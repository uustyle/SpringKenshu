package jp.co;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import samples.HankakuNumberToZenkakuNumber;

@Controller
public class TestController {

	@Autowired
	Properties prop;

    // ①Beanクラスをインジェクション
    @Autowired
    private AppPropertyBean propBean;
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showMessage(Model model) {
    	
		System.out.println("key:" + prop.getProperty("key"));

		System.out.println("jdbc.url:" + prop.getProperty("jdbc.url"));
		
		String id = propBean.getId();
       String name = propBean.getName();
       String testEnv = propBean.getTestenv();
       
       System.out.println("id=" + id + ", name=" + name + ", testEnv=" + testEnv);
		
    	HankakuNumberToZenkakuNumber.hankakuNumberToZenkakuNumber("");
    	
        model.addAttribute("message", "hello world!!!");
        return "showMessage";
    }
}
