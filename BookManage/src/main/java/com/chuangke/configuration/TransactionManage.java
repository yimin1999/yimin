package com.chuangke.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Descrition:
 * @Author yimin
 * @Date 2021/4/27 0027 16:22
 */
@Configuration
@EnableTransactionManagement
public class TransactionManage {

    @Autowired
    private ComboPooledDataSource c3p0;

    @Bean
    public DataSourceTransactionManager getManage(){
        DataSourceTransactionManager sd=new DataSourceTransactionManager();
        sd.setDataSource(c3p0);
        return sd;
    }
    //在要使用事务的方法上加上@Transactional
}
