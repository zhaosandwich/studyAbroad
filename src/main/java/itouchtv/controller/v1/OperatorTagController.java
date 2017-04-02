package itouchtv.controller.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by edit on 2017/3/13.
 */
@Controller
@RequestMapping(value = "/v1")
public class OperatorTagController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/tag", method = {RequestMethod.GET})
    public ResponseEntity<?> getTag(@RequestParam String type,
                                     @RequestParam(name = "parentPk") int pTagPk,
                                     @RequestParam(name = "tagName") String tagName,
                                     @RequestParam(name = "pageNum", defaultValue = "0") int pageNum,
                                     @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                     @RequestHeader HttpHeaders headers) {
        return null;
    }

}
