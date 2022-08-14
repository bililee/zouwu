package common.route;

import lombok.Data;

/**
 * Router 用于标明数据的路由，保证能把数据送到对应的地方
 * @author Lee
 * @date 2022/8/14
 */
@Data
public class Router {

    private String target;

}
