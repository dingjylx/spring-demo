/*
 * Copyright © 2017 www.lvmama.com
 */

/*
 * 修订记录:
 * @author 钟勋（zhongxun@lvmama.com） 2017-08-21 13:53 创建
 */

import com.dingj.code.springdemo.SpringDemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试父类
 */
@SpringBootTest(classes = SpringDemoApplication.class)
public class AbstractTest {
    protected static final Logger logger = LoggerFactory.getLogger(AbstractTest.class);

}
