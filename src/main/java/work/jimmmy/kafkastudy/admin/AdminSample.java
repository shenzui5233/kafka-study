package work.jimmmy.kafkastudy.admin;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;

import java.util.Properties;

public class AdminSample {
    /**
     * 设置adminclient
     *
     * @return adminClient
     */
    public static AdminClient adminClient() {
        Properties properties = new Properties();
        properties.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "172.16.182.132:9092");
        AdminClient adminClient = AdminClient.create(properties);
        return adminClient;
    }

    public static void main(String[] args) {
        AdminClient adminClient = AdminSample.adminClient();
        System.out.println("adminClient : " + adminClient);
    }
}
