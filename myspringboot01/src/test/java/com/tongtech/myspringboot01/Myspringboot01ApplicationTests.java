package com.tongtech.myspringboot01;
import com.tongtech.myspringboot01.log.LogService;
import com.tongtech.myspringboot01.log.LogServiceImpl;
import com.tongtech.myspringboot01.work.WorkService;
import com.tongtech.myspringboot01.work.WorkServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
@SpringBootTest
class Myspringboot01ApplicationTests {
    @Test
    public void test() throws  Exception{
        WorkService target = new WorkServiceImpl();
        WorkService service  = (WorkService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行前的增强。。。。。。。。。。。。。。");
                        LogService logService = new LogServiceImpl();
                        logService.outLog();
                        return method.invoke(target,args);
                    }
                });
        service.doSome();
    }
}
