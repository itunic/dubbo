package cn.com.huak.serializable;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import cn.com.huak.demo.api.TestVO;

/**
 * 实现序列化接口
 * @author 尹斌
 *
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

	public Collection<Class> getSerializableClasses() {
		List<Class> classes = new LinkedList<Class>();
		classes.add(TestVO.class);
		return classes;
	}

}
