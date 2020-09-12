package filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class FilterController {

    @GetMapping("/test1")
    public Map test1() {
        System.out.println("method in controller");
        Map map = new HashMap();
        map.put("a",123);
        return map;
    }

    @GetMapping("/ddd")
    public String ddd() {
        System.out.println("method in controllerddddd");
        return "ddd";
    }
}
