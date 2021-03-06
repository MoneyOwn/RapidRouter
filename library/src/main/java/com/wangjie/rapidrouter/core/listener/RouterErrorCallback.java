package com.wangjie.rapidrouter.core.listener;

import com.wangjie.rapidrouter.core.RouterStuff;

/**
 * Author: wangjie Email: tiantian.china.2@gmail.com Date: 2/9/17.
 */
public interface RouterErrorCallback {
    boolean onRouterError(RouterStuff routerStuff, Throwable throwable);
}
