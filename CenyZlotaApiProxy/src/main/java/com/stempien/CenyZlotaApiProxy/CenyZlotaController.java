package com.stempien.CenyZlotaApiProxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CenyZlotaController {
    @GetMapping("/cenyzlota")
    @ResponseBody
    public String cenaZlota(){
        ApiHelper apiHelper = new ApiHelper();
        return apiHelper.response;
    }
    @GetMapping("/")
    @ResponseBody
    public String waluty(@RequestParam() String link){
        ApiHelper apiHelper = new ApiHelper(link);
        return apiHelper.response;
    }
}
