package gateway.filter;

import core.pojo.user.po.User;
import gateway.session.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Slf4j
@Component
public class AuthFilter extends AbstractGatewayFilterFactory {


    @Autowired
    private Session session;

    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            String accessToken = request.getHeaders().getFirst("Access-Token");

            if (!StringUtils.hasText(accessToken)){
                response.setStatusCode(HttpStatus.UNAUTHORIZED);
            }



            User user = session.get(accessToken);

            if (user == null) {

            }

            return chain.filter(null);
        };
    }

}
