import cn.fly.common.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author xiongfei
 * @Date 2019/6/3 16:32
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestDemo {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void test(){
//        redisUtil.set("testKey","测试");
        redisUtil.del("testKey");
    }

}
