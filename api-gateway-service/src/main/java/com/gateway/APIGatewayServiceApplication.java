package com.gateway;

import com.gateway.filters.ErrorFilter;
import com.gateway.filters.PostFilter;
import com.gateway.filters.PreFilter;
import com.gateway.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class APIGatewayServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(APIGatewayServiceApplication.class, args);
    }

    @Bean
    public PreFilter preFilter()
    {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter()
    {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter()
    {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter()
    {
        return new RouteFilter();
    }
}
