package cn.com.huak;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.huak.demo.api.DemoServer;
import cn.com.huak.demo.api.TestVO;


@Controller
@RequestMapping("/services")
public class ConsumerDemoContorller {
	@Autowired
	private DemoServer demo;
	@RequestMapping("/test")
	@ResponseBody
	public String listRecToJson(@RequestParam Map<String, String> paramsMap) throws Exception {
		TestVO vo = demo.getH("111", "222", 444);
		
		return vo.getId()+" " + vo.getAge()+" "+vo.getName();
	}
}
