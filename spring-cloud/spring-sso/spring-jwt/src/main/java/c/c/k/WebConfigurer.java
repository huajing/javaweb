package c.c.k;

import c.c.k.util.Constants;
import c.c.k.util.JwtUtil;
import io.jsonwebtoken.Jwts;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                //从请求中获取
//                String token = request.getHeader("token");

                String token = "eyJhbGciOiJIUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAACWMwQrDIBBE_2XPETRxjeZbctHVUAuxpauQUvrvVXqcN2_mA_eaYYPDB5dwVoJoQaHXiCLowwpPRkerrUJCmCD7CptCY-U6O2Um4Bb6mt9c0zl65hFvqZTcpFw68i12RI3rYxjpev4fFLplPDROr-LP1KUdfKAd4PsDtZlLCZYAAAA.5GrFqizGmmUCOAuenPojd0DD8DOpv83sAgWQGAKK_Gw";
                Object username = JwtUtil.getVal(token, Constants.ENCRY_KEY, "username");
                request.setAttribute("username", username);


                return false;
            }
        }).addPathPatterns("/**").excludePathPatterns("/login");
    }


    public Object getUser(String encryKey, String token){
        return Jwts.parser()
         .setSigningKey(encryKey)
        .parseClaimsJws(token)
        .getBody();
    }
}
