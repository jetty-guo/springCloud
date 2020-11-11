package com.jbs.spring.cloud.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author gs
 */
@Component
public class MyZuulFilter extends ZuulFilter {

    public boolean shouldFilter() {

        RequestContext context = RequestContext.getCurrentContext();

        HttpServletRequest request = context.getRequest();

        String servletPath = request.getServletPath();

        System.err.println(servletPath);

        return true;
    }

    public Object run() throws ZuulException {

        System.err.println("filter worked");

        return null;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

}
