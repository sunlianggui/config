package com.boot.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/12/29 0029.
 */
//@Component
public class MyFilter extends ZuulFilter {
    //filterType：返回一个字符串代表过滤器的类型
    @Override
    public String filterType() {
        return "pre";      //pre：路由之前   routing：路由之时  post： 路由之后  error：发送错误调用
    }

    //filterOrder：过滤的顺序
    @Override
    public int filterOrder() {
        return 0;
    }


    //这里可以写逻辑判断，是否要过滤，本文true,永远过滤
    @Override
    public boolean shouldFilter() {
        return true;
    }


    //过滤器的具体逻辑。可以查sql，nosql去判断该请求到底有没有权限访问。
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if (accessToken == null) {

            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
            }

            return null;
        }
            return null;
        }

}
