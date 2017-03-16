package cn.com.huak.demo.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.rpc.RpcContext;

import cn.com.huak.demo.api.DemoServer;
import cn.com.huak.demo.api.TestVO;
public class DemoServerImpl implements DemoServer{

	public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

	@Override
	public TestVO getH(String id, String name, int age) {
		// TODO Auto-generated method stub
		TestVO vo = new TestVO();
		vo.setId(id);
		vo.setName(name);
		vo.setAge(age);
		return vo;
	}

}
