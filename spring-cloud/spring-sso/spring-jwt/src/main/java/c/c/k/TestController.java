package c.c.k;

import c.c.k.util.Constants;
import c.c.k.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String apiTest(HttpServletRequest request){
//        String token = request.getHeader("token");
        String token = "eyJhbGciOiJIUzI1NiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAACWMwQrDIBBE_2XPETRxjeZbctHVUAuxpauQUvrvVXqcN2_mA_eaYYPDB5dwVoJoQaHXiCLowwpPRkerrUJCmCD7CptCY-U6O2Um4Bb6mt9c0zl65hFvqZTcpFw68i12RI3rYxjpev4fFLplPDROr-LP1KUdfKAd4PsDtZlLCZYAAAA.5GrFqizGmmUCOAuenPojd0DD8DOpv83sAgWQGAKK_Gw";


        System.out.println(JwtUtil.getVal(token, Constants.ENCRY_KEY, "username"));
        return "ok";
    }

    @GetMapping("/login")
    public String login(){
        Map<String, Object> map = new HashMap<>();
        map.put("username", "abc");
        return JwtUtil.getToken(map, true, Constants.ENCRY_KEY, 60*60*24);
    }
}
