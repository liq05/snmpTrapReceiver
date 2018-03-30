import cn.bg.trap.business.SNMPTrapReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lq on 2018/3/30.
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.bg.trap.business")
public class trapReceiverApplication {
    static SNMPTrapReceiver snmpTrapReceiver;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(trapReceiverApplication.class, args);
        snmpTrapReceiver.run();
    }

    @Autowired
    private void setSnmpTrapReceiver(SNMPTrapReceiver snmpTrapReceiver) {
        trapReceiverApplication.snmpTrapReceiver = snmpTrapReceiver;
    }

//    @Bean(destroyMethod = "shutdown",name="trapexcutor")
//    public Executor getTrapExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(5);
//        executor.setMaxPoolSize(10);
//        executor.setQueueCapacity(100);
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        executor.setAllowCoreThreadTimeOut(true);
//        executor.initialize();
//        return executor;
//    }

    //@Async("trapexcutor")
}
